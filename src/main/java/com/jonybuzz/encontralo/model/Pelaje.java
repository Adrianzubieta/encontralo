package com.jonybuzz.encontralo.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Pelaje {

    @Id
    @GeneratedValue
    private Integer id;
    private String nombre;
}
