package entities;

public class Tentativas {

    public static void processarTentativas(int tentativas, int numeroAleatorio){
        System.out.println("NÚMERO DE TENTATIVAS = " + tentativas + "\n");
        switch (tentativas){
            case 3 -> Dicas.segundaDica(numeroAleatorio);
            case 2 -> Dicas.terceiraDica(numeroAleatorio);
            case 1 -> System.out.println(Dicas.quartaDica(numeroAleatorio));
        } if(tentativas > 0 ){
            System.out.println("\nTENTE NOVAMENTE");
        }
    }
}
