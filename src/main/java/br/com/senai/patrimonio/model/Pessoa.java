package br.com.senai.patrimonio.model;

public class Pessoa {
    private Long id;
    private String nome;
    private String cpf;

    public Pessoa() {
    }

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa(1L,"Gabriela", "529.384.716-20");

        System.out.println("ID: " + pessoa.getId());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
    }
    public Pessoa(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
