package com.nttdata.spring;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.service.ClientServiceI;

/**
 * NTTDataMain
 * 
 * @author Victor Carrasco
 *
 */
@SpringBootApplication
public class NTTDataMain implements CommandLineRunner{
	/** Client Service */
	@Autowired
	ClientServiceI service;
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMain.class, args);
	}
	
	/**
	 * Run
	 */
	@Override
	public void run(String... args) throws Exception {
		service.addClient("Juan", "Perez", "111D", Date.valueOf(LocalDate.now()));
		service.addClient("Maria", "Carrasco", "222D", Date.valueOf(LocalDate.now()));
		service.addClient("Gonzalo", "Dominguez", "333D", Date.valueOf(LocalDate.now()));
		service.addClient("Roberto", "Pacheco", "444D", Date.valueOf(LocalDate.now()));
		service.addClient("Miguel", "Artacho", "555D", Date.valueOf(LocalDate.now()));
	}
}
