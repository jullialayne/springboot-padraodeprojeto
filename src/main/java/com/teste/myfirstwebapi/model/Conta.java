package com.teste.myfirstwebapi.model;


public  class Conta {
    private static final Integer AGENCIA_PADRAO =1;
    private static Integer SEQUENCIAL = 1;
    
    protected Integer agencia;
    protected Integer numeroConta;
    protected static String[] padraoConta= {"CORRENTE","POUPANCA"};
    protected String tipoDeConta;
    protected double saldo;
    protected Cliente cliente;
   
    public Conta(){}
    public Conta(Cliente cliente, String tipoDeConta){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta=SEQUENCIAL++;
        setTipoDeConta(tipoDeConta);
        
    }
public Cliente getCliente() {
    return cliente;
}
public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}
    public void setTipoDeConta(String tipoDeConta) {
        for(int i = 0;i<padraoConta.length;i++){
            if(tipoDeConta==padraoConta[i]){
                this.tipoDeConta = padraoConta[i];
            }
        }
    }
    public String getTipoDeConta() {
        return tipoDeConta;
    }
    public Integer getAgencia(){
        return this.agencia;
    }
    public void setAgencia(Integer agencia){
        this.agencia= agencia;
    }
    public Integer getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(Integer numeroConta){
        this.numeroConta= numeroConta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo= saldo;
    }

    public void transferir(Conta contaDestino, double valor){
        double valorSacar=valor;
        if(this.tipoDeConta.equals("CORRENTE")){
            valorSacar+=2;
         }    
        if (saldo >= valorSacar){ 
            sacar(valorSacar);    
            contaDestino.depositar(valor);
         }else{
             System.out.println( "Não consegue transferir");
     }}
     
     public void sacar(double valor){
         if(valor<=this.saldo){
             this.saldo -=valor;
         }else{
             System.out.println("Não foi possível fazer o saque");
         }
          
     }
        
     public void depositar(double valor){
         this.saldo += valor;
     }
   
    

}
