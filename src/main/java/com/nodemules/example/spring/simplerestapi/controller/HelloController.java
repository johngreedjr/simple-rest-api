package com.nodemules.example.spring.simplerestapi.controller;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

  private static final Faker faker = new Faker();

  @RequestMapping("/greet")
  public String sayHello() {
    return "Hello World";
  }

  @RequestMapping("/angrygreet")
  public String sayGoodbye() {
    return "Goodbye World.";
  }

  @RequestMapping("/prey")
  public String prey() {
    return String.format("What percent along does Jay think we are in Prey?  %d%% at least.", faker.number().numberBetween(65,100));
  }
}
