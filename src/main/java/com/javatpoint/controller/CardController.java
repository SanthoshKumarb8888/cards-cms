package com.javatpoint.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

@GetMapping("/getAllCardsDetails")
    public List<Card> getAllCards() {
        List<Card> cards = new ArrayList<>();
        
        // Sample static data
        cards.add(new Card(1L, "Card 1", "Description of Card 1"));
        cards.add(new Card(2L, "Card 2", "Description of Card 2"));
        cards.add(new Card(3L, "Card 3", "Description of Card 3"));
        
        return cards;
    }

  
    

}

