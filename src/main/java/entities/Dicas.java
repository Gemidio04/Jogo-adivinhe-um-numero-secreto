package entities;

public class Dicas {

    public static void primeiraDica(){
        System.out.println("PRIMEIRA DICA: O NÚMERO É INTEIRO!");
    }

    public static void segundaDica(int numero){
        primeiraDica();
        System.out.print("SEGUNDA DICA: ");
        if(numero > 0){
            System.out.print("O NÚMERO É POSITIVO!");
        }else if (numero < 0){
            System.out.print("O NÚMERO É NEGATIVO!");
        }else{
            System.out.print("O NÚMERO É NEUTRO!");
        }
    }
    public static void terceiraDica(int numero){
       segundaDica(numero);
       System.out.print("\nTERCEIRA DICA: ");
       if(numero % 2 == 0){
       System.out.print("O NÚMERO É PAR!");
       }else{
           System.out.print("O NÚMERO É ÍMPAR!");
       }
    }
    public static void quartaDica(int numero){
        terceiraDica(numero);
        System.out.print("\nQUARTA E ÚLTIMA DICA: ");
        if (numero >= -30 && numero < -10) {
            System.out.print("O NÚMERO ESTÁ NO INTERVALO [-30, -10]!");
        } else if (numero >= -10 && numero < 10) {
            System.out.print("O NÚMERO ESTÁ NO INTERVALO [-10, 10]!");
        } else if (numero >= 10 && numero < 30) {
            System.out.print("O NÚMERO ESTÁ NO INTERVALO [10, 30]!");
        } else {
            System.out.print("O NÚMERO ESTÁ FORA DOS INTERVALOS DEFINIDOS!");
        }
    }
}
