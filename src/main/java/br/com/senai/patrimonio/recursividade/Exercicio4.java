package br.com.senai.patrimonio.recursividade;

public class Exercicio4 {
    public static int somaVetor(int[] vet, int index) {
        if (index >= vet.length) {
            return 0;
        }
        return vet[index] + somaVetor(vet, index + 1);

    }
 }
