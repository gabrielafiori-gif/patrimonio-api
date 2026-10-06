package br.com.senai.patrimonio.atividades02;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularBonificacao(){
        return this.getSalarioBase() * 0.20;
    }
}
