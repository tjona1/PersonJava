package com.example.PersonJava;


import com.example.PersonJava.services.CreatePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class PersonJavaApplication {



	public static void main(String[] args) {
		SpringApplication.run(PersonJavaApplication.class, args);



	}



	}

