package it.clienteGestionale.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.clienteGestionale.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
void deleteClienteById(Long id); //implementato un nuovo metodo da utilizzare nella classe ClienteService
Optional<Cliente> findClienteById(Long id);
}
