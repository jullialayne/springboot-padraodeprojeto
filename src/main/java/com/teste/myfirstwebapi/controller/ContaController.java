package com.teste.myfirstwebapi.controller;

import java.util.List;

import com.teste.myfirstwebapi.model.Conta;
import com.teste.myfirstwebapi.repository.ContaRepository;

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
@RequestMapping("/conta")
public class ContaController {
    
    @Autowired
    private ContaRepository repository;
    
    @GetMapping()
    public List<Conta> getContas(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Conta getContaOne(@PathVariable("id") Integer id){
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteConta(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postConta(@RequestBody Conta conta){
        repository.save(conta);
    }

    @PutMapping()
    public void putConta(@RequestBody Conta conta){
        repository.save(conta);
    }

}
