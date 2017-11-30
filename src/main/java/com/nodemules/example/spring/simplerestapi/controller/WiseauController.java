package com.nodemules.example.spring.simplerestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/wiseau")
public class WiseauController {

  @RequestMapping("/hi")
  public String sayHi() {
    return "Oh hai Denny";
  }


}
