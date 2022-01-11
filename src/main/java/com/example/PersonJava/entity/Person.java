package com.example.PersonJava.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name= "Persona")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name= "age")
    private String age;
    @Column(name = "profile")
    private String profile;

}

