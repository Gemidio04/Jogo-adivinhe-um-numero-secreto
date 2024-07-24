package entities;

import java.util.Random;

public class numeroSecreto {

    private static int geraNumeroSecreto(int minimo, int maximo){
        if(minimo > maximo){
            throw new IllegalArgumentException("O VALOR MÍNIMO DEVE SER MENOR OU IGUAL AO VALOR MÁXIMO.");
        }
        Random numeroSecreto = new Random();
        return numeroSecreto.nextInt((maximo - minimo) + 1) + minimo;
    }
}
