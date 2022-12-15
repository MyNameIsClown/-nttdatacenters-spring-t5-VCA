package com.nttdata.spring.service;

import java.sql.Date;
import java.util.List;

import com.nttdata.spring.models.Client;
/**
 * Client Service Interface
 * 
 * @author Victor Carrasco
 *
 */
public interface ClientServiceI {
	/**
	 * Busca un cliente en base de datos por nombre y apellidos
	 * @param nombre
	 * @param apellidos
	 * @return
	 */
	public List<Client> findClientByNombreCompleto(String nombre, String apellidos);
	
	/**
	 * Add client
	 * 
	 * @param client
	 */
	public void addClient(Client client);
	
	/**
	 * Lista todos los clientes
	 * 
	 * @return
	 */
	public List<Client> findAll();
	
	/**
	 * Add client
	 * 
	 * @param string
	 * @param string2
	 * @param string3
	 * @param valueOf
	 */
	public void addClient(String nombre, String apellidos, String dni, Date fechaDeNacimiento);
}
