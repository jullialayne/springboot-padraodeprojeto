package com.teste.myfirstwebapi.model;


public class Banco {
    private String nome;
    private Integer id;

    public Banco(){}
    public Banco(String nome, int id){
        this.nome = nome;
        this.id=id;
        
    }
    @Override
    public String toString(){
        return "Bank{"+
        "nome='"+this.nome+"'\n"+
        "}";
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}
