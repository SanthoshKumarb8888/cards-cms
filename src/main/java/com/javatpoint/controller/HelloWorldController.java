package com.javatpoint.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
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

}
