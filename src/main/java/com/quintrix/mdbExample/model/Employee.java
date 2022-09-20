package com.quintrix.mdbExample.model;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Employee")
public class Employee {

  @Id
  private int id;
  private String name;
  private String state;


}


