package com.javatpoint.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class CardController 
{

@RequestMapping("/hello")
public String hello() 
{
return "Hello cards-cms";
}


@RequestMapping("/health")
public String healthCheck() 
{
return "Your application is up and running";
}


 private Map<Long, Card> cardMap = new HashMap<>();

    // Initialize sample static data
    public CardController() {
        cardMap.put(1L, new Card(1L, "DebitCard", "Description of DebitCard"));
        cardMap.put(2L, new Card(2L, "CreditCard", "Description of CreditCard"));
        cardMap.put(3L, new Card(3L, "DiningCard", "Description of DiningCard"));
    }

    @GetMapping("/getAllCardsDetails")
    public List<Card> getAllCards() {
        return new ArrayList<>(cardMap.values());
    }

    @GetMapping("/getCardDetails/{cardId}")
    public Card getCardDetails(@PathVariable Long cardId) {
        return cardMap.get(cardId);
    }

  
    

}



