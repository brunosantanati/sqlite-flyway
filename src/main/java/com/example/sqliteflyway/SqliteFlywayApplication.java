package com.example.sqliteflyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqliteFlywayApplication {

	/*
	I had to create de DB before running this program, in order to make it work:
	sqlite> CREATE TABLE person (id integer not null, message varchar, name varchar, primary key (id));
	 */

	public static void main(String[] args) {
		SpringApplication.run(SqliteFlywayApplication.class, args);
	}

}
