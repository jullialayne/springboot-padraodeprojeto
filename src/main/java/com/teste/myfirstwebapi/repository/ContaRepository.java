package com.teste.myfirstwebapi.repository;

import java.util.ArrayList;
import java.util.List;

import com.teste.myfirstwebapi.model.Cliente;
import com.teste.myfirstwebapi.model.Conta;

import org.springframework.stereotype.Repository;

@Repository
public class ContaRepository {
    public void save(Conta conta){
        if(conta.getNumeroConta()==null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }else{
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(conta);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE - Recebendo o id: %d na camada de repositório", id));
    }

    public List<Conta> findAll(){
        System.out.println("LIST - Listando os contas do sistema");
        List<Conta> contas = new ArrayList<>();
        Cliente c = new Cliente("Jullia","ju@gmail.com", "senha");

        contas.add(new Conta(c,"CORRENTE"));
        contas.add(new Conta(c,"POUPANCA"));
        System.out.println(contas);
        return contas;

    }

    public Conta findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d",id));
        return null;
    }

    public Conta findByContaName(String contaname){
        System.out.println(String.format("FIND/contaname - Recebendo o contaname: %s",contaname));
        return null;
    }

    
}