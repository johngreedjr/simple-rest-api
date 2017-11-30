package com.nodemules.example.spring.simplerestapi.service;

import com.github.javafaker.Faker;
import com.nodemules.example.spring.simplerestapi.bean.ColonialMarine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Service;

@Service
public class MarineService implements MarineOperations {

  private static final Faker faker = new Faker();

  @Override
  public List<ColonialMarine> getMarines() {
    return getColonialMarines(10, 3);
  }

  private ColonialMarine makeMarine() {
    return makeMarine(0);
  }

  private ColonialMarine makeMarine(int hombres) {
    ColonialMarine marine = new ColonialMarine();
    marine.setDrops(faker.number().numberBetween(0,100));
    marine.setKills(faker.number().numberBetween(0,300));
    marine.setName(faker.name().fullName());
    marine.setEnlistDate(faker.date().future(100*365, TimeUnit.DAYS));

    List<ColonialMarine> list = getColonialMarines(hombres);
    marine.setHombres(list);
    return marine;
  }

  private List<ColonialMarine> getColonialMarines(int marines) {
    return getColonialMarines(marines, 0);
  }

  private List<ColonialMarine> getColonialMarines(int marines, int hombres) {
    List<ColonialMarine> list = new ArrayList<>();
    for (int i = 0; i < marines; i++) {
      list.add(makeMarine(hombres));
    }
    return list;
  }
}
