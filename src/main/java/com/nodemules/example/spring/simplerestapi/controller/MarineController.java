package com.nodemules.example.spring.simplerestapi.controller;

import com.nodemules.example.spring.simplerestapi.bean.ColonialMarine;
import com.nodemules.example.spring.simplerestapi.service.MarineOperations;
import com.nodemules.example.spring.simplerestapi.service.MarineService;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marines")
public class MarineController {

  private MarineOperations marineService;

  @Autowired
  public MarineController(MarineService marineService) {
    this.marineService = marineService;
  }

  @RequestMapping
  public List<ColonialMarine> getMarines() {
    return marineService.getMarines();
  }

}
