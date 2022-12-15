package com.nttdata.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.spring.models.Client;
import com.nttdata.spring.service.ClientServiceI;
/**
 * Client controller
 * 
 * @author Victor Carrasco
 *
 */	
@RestController
@RequestMapping("/*")
public class ClientController {
	@Autowired
	ClientServiceI service;
	
	/**
	 * Muestra todos los clientes en bbdd
	 * 
	 * @return
	 */
	@RequestMapping("mostrarClientes")
	public @ResponseBody List<Client> showAll(){
		return service.findAll();
	}
	
	/**
	 * Añade el cliente y abre la pagina inicial
	 * 
	 * @param newClient
	 * @return
	 */
	@PostMapping("addCliente")
	public void addClient(@ModelAttribute("cliente") Client newClient) {
		service.addClient(newClient);
	}
	
	/**
	 * lista los clientes por nombre y apellido
	 * 
	 * @param model
	 * @param nombre
	 * @param apellidos
	 * @return
	 */
	@RequestMapping("filtraClientes")
	public @ResponseBody List<Client> filtraClientes(@RequestParam String nombre, @RequestParam String apellidos) {
		
		return service.findClientByNombreCompleto(nombre, apellidos);
		
	}
	
}
