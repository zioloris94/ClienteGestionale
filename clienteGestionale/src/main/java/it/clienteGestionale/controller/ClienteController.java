package it.clienteGestionale.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.clienteGestionale.model.Cliente;
import it.clienteGestionale.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	private final ClienteService clienteService;
	public ClienteController (ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	@GetMapping("/all")
	public ResponseEntity<List<Cliente>> getAllClienti(){
		List<Cliente> clienti = clienteService.findAllClienti();
		return new ResponseEntity<>(clienti, HttpStatus.OK );
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable("id") Long id){
		Cliente cliente = clienteService.findClienteById(id);
		return new ResponseEntity<>(cliente, HttpStatus.OK );
	}
	
	@PostMapping("/add")
	public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente){
		Cliente newcliente = clienteService.addCliente(cliente);
		return new ResponseEntity<>(newcliente, HttpStatus.CREATED );
	}
	
	@PutMapping("/update")
	public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente){
		Cliente newcliente = clienteService.updateCliente(cliente);
		return new ResponseEntity<>(newcliente, HttpStatus.OK );
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteCliente(@PathVariable("id") Long id){
		clienteService.deleteCliente(id);
		return new ResponseEntity<>(HttpStatus.OK );
	}
	
}
