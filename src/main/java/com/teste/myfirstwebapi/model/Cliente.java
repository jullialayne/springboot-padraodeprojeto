package com.teste.myfirstwebapi.model;

public class Cliente {
    private Integer id;
    private String login;
    private String password;
    
    public Cliente(){}
    public Cliente(String login,String password){
        this.login = login;
        this.password = password;

        
    }
    @Override
    public String toString(){
        return "User{"+
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
    
}
