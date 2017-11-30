package com.nodemules.example.spring.simplerestapi.bean;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
@JsonInclude(Include.NON_EMPTY)
public class ColonialMarine implements Serializable {

  private static final long serialVersionUID = 3092835893452667925L;

  private String name;
  private int kills;
  private int drops;
  @JsonFormat(shape= Shape.STRING, pattern = "YYYY-MM-dd'T'hh:mm:ss.SSS'Z'", timezone = "UTC")
  private Date enlistDate;
  private List<ColonialMarine> hombres = new ArrayList<>();



}
