package com.teste.myfirstwebapi.controller;

import java.util.List;

import com.teste.myfirstwebapi.model.Cliente;
import com.teste.myfirstwebapi.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteRepository repository;
    
    @GetMapping()
    public List<Cliente> getClientes(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getClienteOne(@PathVariable("id") Integer id){
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postCliente(@RequestBody Cliente cliente){
        repository.save(cliente);
    }

    @PutMapping()
    public void putCliente(@RequestBody Cliente cliente){
        repository.save(cliente);
    }

}
