package br.com.senai.patrimonio.recursividade;

public class PotenciaRecursiva {
    public static int potencia (int base, int expoente){
        if(expoente == 0){
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }

    }

