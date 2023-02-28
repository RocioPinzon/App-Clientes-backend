package com.rociopinzon.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Size(min=4, max=15, message = "El tamaño debe estar entre 4 y 15 caracteres")
	@Column(nullable = false)
	private String nombre;
	
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Size(min=4, max=15, message = "El tamaño debe estar entre 4 y 15 caracteres")
	@Column(nullable = false)
	private String apellido;
	
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Email(message = "No es una dirección válida")
	@Column(nullable = false)
	private String email;
	
	@NotNull(message = "La fecha no puede estar vacia")
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	
	private String foto;
	/*@PrePersist
	public void prePersist() {
		createAt = new Date();
	}*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
