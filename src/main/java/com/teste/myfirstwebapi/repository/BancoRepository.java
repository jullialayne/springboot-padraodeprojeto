package com.teste.myfirstwebapi.repository;

import java.util.ArrayList;
import java.util.List;

import com.teste.myfirstwebapi.handler.CampoObrigatorioException;
import com.teste.myfirstwebapi.model.Banco;

import org.springframework.stereotype.Repository;

@Repository
public class BancoRepository {
    public void save(Banco banco){
        if(banco.getId()==null){
            throw new CampoObrigatorioException("id");
        }
        if(banco.getNome()==null){
            throw new CampoObrigatorioException("nome do banco");
        }
        if(banco.getId()==null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }else{
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(banco);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE - Recebendo o id: %d na camada de repositório", id));
    }

    public List<Banco> findAll(){
        System.out.println("LIST - Listando os bancos do sistema");
        List<Banco> bancos = new ArrayList<>();
        bancos.add(new Banco("Carrefour",15));
        bancos.add(new Banco("Santander",20));
        return bancos;

    }

    public Banco findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d",id));
        return new Banco("Carrefour",15);
    }

    public Banco findByBancoName(String bancoName){
        System.out.println(String.format("FIND/banconame - Recebendo o banconame: %s",bancoName));
        return new Banco("Carrefour",15);
    }

}
