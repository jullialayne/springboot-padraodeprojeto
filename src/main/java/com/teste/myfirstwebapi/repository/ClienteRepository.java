package com.teste.myfirstwebapi.repository;

import java.util.ArrayList;
import java.util.List;

import com.teste.myfirstwebapi.handler.CampoObrigatorioException;
import com.teste.myfirstwebapi.model.Cliente;

import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository {
    public void save(Cliente cliente){
        if(cliente.getLogin()==null){
            throw new CampoObrigatorioException("login");
        }
        if(cliente.getPassword()==null){
            throw new CampoObrigatorioException("senha");
        }

        if(cliente.getId()==null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }else{
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(cliente);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE - Recebendo o id: %d na camada de repositório", id));
    }

    public List<Cliente> findAll(){
        System.out.println("LIST - Listando os clientes do sistema");
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Jullia","juu", "123"));
        clientes.add(new Cliente("Layne","la", "123"));
        clientes.add(new Cliente("Jordanna","jo", "123"));
        return clientes;

    }

    public Cliente findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d",id));
        return new Cliente("Jordanna","jo", "123");
    }

    public Cliente findByClienteName(String clientename){
        System.out.println(String.format("FIND/clientename - Recebendo o clientename: %s",clientename));
        return new Cliente("Jordanna","jo", "123");
    }

    
}