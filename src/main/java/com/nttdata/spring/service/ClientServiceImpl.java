package com.nttdata.spring.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nttdata.spring.models.Client;
import com.nttdata.spring.repository.ClientRepository;

/**
 * Client Service Implementation
 * 
 * @author Victor Carrasco
 *
 */
@Service("ClientService")
@Primary
public class ClientServiceImpl implements ClientServiceI{
	/** Respositorio de cliente */
	@Autowired
	ClientRepository repository;
	
	@Override
	public List<Client> findAll() {
		return repository.findAll();
	}
	
	@Override
	public void addClient(Client client) {
		repository.save(client);
	}

	@Override
	public void addClient(String nombre, String apellidos, String dni, Date fechaDeNacimiento) {
		Client newClient = new Client();
		newClient.setNombre(nombre);
		newClient.setApellidos(apellidos);
		newClient.setDni(dni);
		newClient.setFechaDeNacimiento(fechaDeNacimiento);
		repository.save(newClient);
	}

	@Override
	public List<Client> findClientByNombreCompleto(String nombre, String apellidos) {
		return repository.findByNombreAndApellidos(nombre, apellidos);
	}

	
	
	
}
