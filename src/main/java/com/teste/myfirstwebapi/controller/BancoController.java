package com.teste.myfirstwebapi.controller;

import java.util.List;

import com.teste.myfirstwebapi.model.Banco;
import com.teste.myfirstwebapi.repository.BancoRepository;

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
@RequestMapping("/banco")
public class BancoController {
    
    @Autowired
    private BancoRepository repository;
    
    @GetMapping()
    public List<Banco> getBancos(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Banco getBancoOne(@PathVariable("id") Integer id){
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBanco(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postBanco(@RequestBody Banco banco){
        repository.save(banco);
    }

    @PutMapping()
    public void putBanco(@RequestBody Banco banco){
        repository.save(banco);
    }


}
