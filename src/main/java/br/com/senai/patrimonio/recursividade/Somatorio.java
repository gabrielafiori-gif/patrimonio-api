package br.com.senai.patrimonio.recursividade;

public class Somatorio {
    public static int somaAteN (int n){
        if (n <=0){
            return 0;
        }
        return n + somaAteN(n-1);
    }

    }

