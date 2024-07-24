package entities;

public class Dicas {

    public static void primeiraDica(){
        System.out.println("PRIMEIRA DICA: O NÚMERO É INTEIRO!");
    }

    public static void segundaDica(int numero){
        primeiraDica();
        System.out.println("SEGUNDA DICA: ");
        if(numero > 0){
            System.out.println("O NÚMERO É POSITIVO!");
        }else if (numero < 0){
            System.out.println("O NÚMERO É NEGATIVO!");
        }else{
            System.out.println("O NÚMERO É NEUTRO!");
        }
    }
    public static void terceiraDica(int numero){
       segundaDica(numero);
       System.out.println("TERCEIRA DICA: ");
       if(numero % 2 == 0){
       System.out.println("O NÚMERO É PAR!");
       }else{
           System.out.println("O NÚMERO É ÍMPAR!");
       }
    }
    public static String quartaDica(int numero){
        terceiraDica(numero);
        if (numero >= -30 && numero < -10) {
            return "O NÚMERO ESTÁ NO INTERVALO [-30, -10]!";
        } else if (numero >= -10 && numero < 10) {
            return "O NÚMERO ESTÁ NO INTERVALO [-10, 10]!";
        } else if (numero >= 10 && numero < 30) {
            return "O NÚMERO ESTÁ NO INTERVALO [10, 30]!";
        } else {
            return "O NÚMERO ESTÁ FORA DOS INTERVALOS DEFINIDOS!";
        }
    }
}
