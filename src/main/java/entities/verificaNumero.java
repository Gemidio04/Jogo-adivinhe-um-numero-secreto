package entities;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class verificaNumero {

    private Set<Integer> numerosTentados = new HashSet<>();

    public boolean verificaSeONumeroERepetido(int numero){
        Scanner sc = new Scanner(System.in);
        if(numerosTentados.contains(numero)){
            System.out.println("\nVOCÊ JÁ TENTOU ESSE NÚMERO!");
            System.out.print("DIGITE OUTRO NÚMERO DIFERENTE DOS NÚMEROS DIGITADOS ANTERIORMENTE: ");

            while(true){
                numero = sc.nextInt();
                if(!numerosTentados.contains(numero)){
                    numerosTentados.add(numero);
                    return false;
                }else{
                    System.out.println("VOCÊ JÁ TENTOU ESSE NÚMERO! DIGITE OUTRO NÚMERO:");
                }
            }
        }else{
            numerosTentados.add(numero);
            return false;
        }

    }
}
