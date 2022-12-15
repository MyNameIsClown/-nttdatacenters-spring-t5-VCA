package com.nttdata.spring.models;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 * Client Table
 * 
 * @author Victor Carrasco
 *
 */
@Entity
@Table(name = "C_Client")
public class Client implements Serializable{
	//////////////
	//PARAMETROS//
	//////////////
	
	/** Serial Version UID */
	private static final long serialVersionUID = 1L;

	/** ID */
	private Integer id;
	
	/** Nombre */
	private String nombre;
	
	/** Apellido */
	private String apellidos;
	
	/** Fecha de nacimiento */
	private Date fechaDeNacimiento;
	
	/** DNI */
	private String dni;
	
	/////////////////////
	//GETTERS & SETTERS//
	/////////////////////
	
	/**
	 * @return the id
	 */
	@Id
	@Column(name="C_CLIENT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqClientID")
	@SequenceGenerator(name = "seqClientID", sequenceName = "SEQ_T_CLIENT")
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	@Column(name = "C_CLIENT_NAME")
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	@Column(name = "C_CLIENT_APELLIDOS")
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the fechaDeNacimiento
	 */
	@Column(name = "C_CLIENT_FECHA_NACIMIENTO")
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	/**
	 * @param fechaDeNacimiento the fechaDeNacimiento to set
	 */
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	/**
	 * @return the dni
	 */
	@Column(name = "C_CLIENT_DNI")
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * To string
	 */
	@Override
	public String toString() {
		return "Client \n\t[id=" + id + ", \n\tnombre=" + nombre + ", \n\tapellidos=" + apellidos + ", \n\tfechaDeNacimiento="
				+ fechaDeNacimiento + ", \n\tdni=" + dni + "]";
	}
	
	
	
	
}
