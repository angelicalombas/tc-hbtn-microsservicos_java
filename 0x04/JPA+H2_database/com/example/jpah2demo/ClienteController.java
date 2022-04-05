package com.example.jpah2demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

  @Autowired
  private ClienteRepository clienteRepository;

  @PostMapping("/addClient")
  public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
    cliente.setId(null);
    Cliente criarCliente = clienteRepository.save(cliente);
    return ResponseEntity.status(HttpStatus.CREATED).body(criarCliente);
  }

  @GetMapping("/findAllClients")
  public ResponseEntity<List<Cliente>> findAllClients() {
    List<Cliente> clientes = clienteRepository.findAll();
    return ResponseEntity.ok(clientes);
  }

  @GetMapping("/findClientById/{id}")
  public ResponseEntity<Cliente> findClientById(@PathVariable("id") Long idClient) {
	  Optional<Cliente> clientes = clienteRepository.findById(idClient);
	  return ResponseEntity.status(HttpStatus.CREATED).body(clientes.get());
  }
  

  @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient){
	  clienteRepository.deleteById(idClient);
    }

  @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
	  Cliente clienteId = clienteRepository.getById(id);
	  clienteId.setNome(cliente.getNome());
	  clienteId.setEmail(cliente.getEmail());
	  clienteId.setEnderecos(cliente.getEnderecos());
	  clienteId.setTelefones(cliente.getTelefones());
	  
	  clienteRepository.save(clienteId);
     
    }
}