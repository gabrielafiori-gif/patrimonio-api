package br.com.senai.patrimonio.recursividade;

public class  Exercicio1 {
    public static int fatorial(int n){
        if (n ==0 || n ==1){
            return 1;
        }
        return n * fatorial(n-1);
    }

    }
