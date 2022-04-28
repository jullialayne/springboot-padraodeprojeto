package com.teste.myfirstwebapi.model;

public class Cliente {
    private static int idAutoIncrement = 1; 
    
    private Integer id;
    private String login;
    private String password;
    private String nome;
    
    public Cliente(){}
    public Cliente(String nome,String login,String password){
        this.login = login;
        this.password = password;
        this.id=idAutoIncrement++;
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "User{"+
        "nome='"+this.nome+"'\n,"+
        "login='"+this.login+"'\n,"+
        "password='"+this.password+"'\n"+
        "}";
    }

    public Integer getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
