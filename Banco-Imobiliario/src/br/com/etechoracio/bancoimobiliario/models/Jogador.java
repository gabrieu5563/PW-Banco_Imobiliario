package br.com.etechoracio.bancoimobiliario.models;

public class Jogador {
    private String nome;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibeSaldo(){
        System.out.println("Jogador: " + this.nome + "  Saldo: " + this.saldo);
    }

    public Jogador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void debitar(double valor){
        this.saldo -= valor;
    }

    public void creditar(double valor){
        this.saldo += valor;
    }

    public void alugar(double valor, Jogador jogador){
        this.saldo += valor;
        jogador.debitar(valor);
    }

    public void jogar(String operacao, double valor){
        if(operacao.equalsIgnoreCase("C")){
            this.debitar(valor);
        } else if (operacao.equalsIgnoreCase("V")) {
            this.creditar(valor);
        }
    }

    public void jogar(String operacao, double valor, Jogador jogador){
        if(operacao.equalsIgnoreCase("A")){
            alugar(valor, jogador);
        } else {
            jogar(operacao, valor);
        }
    }

}
