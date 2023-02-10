package com.rociopinzon.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.rociopinzon.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {

	// Get - TOdos los clientes
	public List<Cliente> findAll();
	
	// Page - paginacion
	public Page<Cliente> findAll(Pageable pageable);

	// Cliente por ID
	public Cliente findById(Long id);
	
	// Cliente retorna un cliente | Save -> Recibe el cliente que vamos a guardar y retorna un cliente guardado (con id)
	public Cliente save(Cliente cliente);
	
	//Eliminar
	public void delete(Long id);
}
