package com.maynar.people.model;
import java.util.Date;

import lombok.Data;

@Data
public class Person{

    private Long id;
    private String name;
    private String surname;
    private Date birthdate;

}