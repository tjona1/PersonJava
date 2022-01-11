package com.example.PersonJava.services;

import com.example.PersonJava.repositery.PersonRepository;
import com.example.PersonJava.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@Slf4j
public class CreatePerson {
    @Autowired
    PersonRepository repository;


    public List<Person> persons = new ArrayList<>();
        static Random r = new Random();

        /*public List<Person> people() {


            for (int i=0; i<10; i++) {
                Person person = new Person();
                person.setName("Tjo");
                person.setLastname("Poro");
                person.setAge("20");
                person.setId(r.nextInt(15));
                person.setProfile("Student");
                System.out.println("My name is" + " " + person.getName());
                System.out.println("My name is" + " " + person.getLastname());
                System.out.println("My name is" + " " + person.getAge());
                System.out.println("My name is" + " " + person.getProfile());

                repository.save(person);
               persons.add(person);
            }

            return persons;
        } */

    public  void dataDasePeople() {

            Person person = new Person();
            person.setName("Tjo");
            person.setLastname("Poro");
            person.setAge("20");
            person.setId(r.nextInt(15));
            person.setProfile("Student");
            System.out.println("My name is" + " " + person.getName());
            System.out.println("My name is" + " " + person.getLastname());
            System.out.println("My name is" + " " + person.getAge());
            System.out.println("My name is" + " " + person.getProfile());
            log.info("Interno del metodo DataBase People");
            repository.save(person);

        }
    }

