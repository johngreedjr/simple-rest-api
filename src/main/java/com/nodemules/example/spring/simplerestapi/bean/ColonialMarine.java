package com.nodemules.example.spring.simplerestapi.bean;


import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class ColonialMarine implements Serializable {

  private static final long serialVersionUID = 3092835893452667925L;

  private String name;
  private Integer kills;
  private Integer drops;
  private Date enlistDate;


}
