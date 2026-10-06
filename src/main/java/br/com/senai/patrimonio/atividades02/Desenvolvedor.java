package br.com.senai.patrimonio.atividades02;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularBonificacao(){
      return this.getSalarioBase() * 0.15;
    }
}
