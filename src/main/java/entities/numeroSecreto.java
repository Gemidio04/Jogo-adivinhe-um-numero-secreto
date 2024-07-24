package entities;

import java.util.Random;
import java.util.Scanner;

public class numeroSecreto {

    private verificaNumero verificaNumero;

    private static int geraNumeroSecreto(int minimo, int maximo){
        if(minimo > maximo){
            throw new IllegalArgumentException("O VALOR MÍNIMO DEVE SER MENOR OU IGUAL AO VALOR MÁXIMO.");
        }
        Random numeroSecreto = new Random();
        return numeroSecreto.nextInt((maximo - minimo) + 1) + minimo;
    }

    public void adivinheONumeroSecreto(){
        Scanner sc = new Scanner(System.in);

        int minimo = -30;
        int maximo = 30;

        int numeroAleatorio =geraNumeroSecreto(minimo, maximo);

        System.out.println("VAMOS COMEÇAR!");
        Dicas.primeiraDica();
        System.out.println("\nDIGITE UM NÚMERO ALEATÓRIO: ");
        int numero = sc.nextInt();

        int tentativas = 0;

        while(tentativas > 0){
            if(numero == numeroAleatorio){
                System.out.println("\nVOCÊ ACERTOU!\nPARABÉNS!\nO NÚMERO É: " + numeroAleatorio);
                break;
            }else{
                if(verificaNumero.verificaSeONumeroERepetido(numero)){
                    continue;
                }
                --tentativas;
                System.out.println("\nVOCÊ ERROU!");
                Tentativas.processarTentativas(tentativas, numeroAleatorio);

                if(tentativas > 0){
                    System.out.print("DIGITE OUTRO NÚMERO ALEATÓRIO: ");
                    numero = sc.nextInt();
                }else{
                    System.out.println("\nVOCÊ PERDEU!");
                    System.out.println("O NÚMERO ERA: "+ numeroAleatorio);
                }
            }
        }
        System.out.println("\nJOGO FINALIZADO!");
    }
}
