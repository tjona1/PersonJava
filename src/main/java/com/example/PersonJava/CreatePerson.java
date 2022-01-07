package com.example.PersonJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CreatePerson {

    public List<Person> persons = new ArrayList<>();
        Random r = new Random();

        public List<Person> people() {


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

               persons.add(person);
            }

            return persons;
        }

}
