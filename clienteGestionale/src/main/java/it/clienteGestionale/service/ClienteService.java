package it.clienteGestionale.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.clienteGestionale.exception.UserNotFoundException;
import it.clienteGestionale.model.Cliente;
import it.clienteGestionale.repository.ClienteRepository;

@Service
public class ClienteService {
private ClienteRepository clienteRepository;

	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente addCliente(Cliente cliente) {
		return clienteRepository.save(cliente);		
	}
	
	public Cliente updateCliente(Cliente cliente) {
		return clienteRepository.save(cliente);		
	}
	
	public List<Cliente> findAllClienti() {
		return clienteRepository.findAll();		
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteClienteById(id);		
	}
	
	public Cliente findClienteById(Long id) {
		return clienteRepository.findClienteById(id)
				.orElseThrow(() -> new UserNotFoundException("Cliente per id:"+id+"non trovato"));		
	}
	
}
