package com.nodemules.example.spring.simplerestapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @RequestMapping("/greet")
  public String sayHello() {
    return "Hello World";
  }

  @RequestMapping("/angrygreet")
  public String sayGoodbye() {
    return "Goodbye World.";
  }
}
