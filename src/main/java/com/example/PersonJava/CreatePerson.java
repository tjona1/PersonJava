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

               persons.add(person);
            }

            return persons;
        }

}
