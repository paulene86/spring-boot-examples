package com.in28minutes.springboot.jpa.hibernate.h2.example;

import com.in28minutes.springboot.jpa.hibernate.h2.example.student.CuentaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBoot2JPAWithHibernateAndH2Application implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CuentaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JPAWithHibernateAndH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("todas las cuentas son B====================-) "+
				repository.findAll().size());
	}
}
