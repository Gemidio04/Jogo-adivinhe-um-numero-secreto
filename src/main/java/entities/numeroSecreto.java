package entities;

import java.util.Random;
import java.util.Scanner;

public class numeroSecreto {

    private Scanner sc;
    private verificaNumero verificaNumero;

    public numeroSecreto() {
        this.sc = new Scanner(System.in);
        this.verificaNumero = new verificaNumero();
    }

    private static int geraNumeroSecreto(int minimo, int maximo){
        if(minimo > maximo){
            throw new IllegalArgumentException("O VALOR MÍNIMO DEVE SER MENOR OU IGUAL AO VALOR MÁXIMO.");
        }
        Random numeroSecreto = new Random();
        return numeroSecreto.nextInt((maximo - minimo) + 1) + minimo;
    }

    public void adivinheONumeroSecreto() {
        int minimo = -30;
        int maximo = 30;

        int numeroAleatorio = geraNumeroSecreto(minimo, maximo);

        System.out.println("VAMOS COMEÇAR!");
        Dicas.primeiraDica();
        System.out.print("\nDIGITE UM NÚMERO ALEATÓRIO: ");
        int numero = sc.nextInt();

        int tentativas = 4;

        while (tentativas > 0) {
            if (verificaNumero.verificaSeONumeroERepetido(numero)) {
                System.out.println("\nVOCÊ JÁ TENTOU ESSE NÚMERO!");
                System.out.print("DIGITE OUTRO NÚMERO DIFERENTE DOS NÚMEROS DIGITADOS ANTERIORMENTE: ");
                numero = sc.nextInt();
                continue;
            }

            if (numero == numeroAleatorio) {
                System.out.println("\nVOCÊ ACERTOU!\nPARABÉNS!\nO NÚMERO É: " + numeroAleatorio);
                break;
            } else {
                tentativas--;
                System.out.println("\nVOCÊ ERROU!");
                Tentativas.processarTentativas(tentativas, numeroAleatorio);

                if (tentativas > 0) {
                    System.out.print("DIGITE OUTRO NÚMERO ALEATÓRIO: ");
                    numero = sc.nextInt();
                } else {
                    System.out.println("VOCÊ PERDEU!");
                    System.out.println("O NÚMERO É: "+numeroAleatorio);
                }
            }
        }
        System.out.println("\nJOGO FINALIZADO!");
    }
}
