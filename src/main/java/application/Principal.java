package application;

import entities.Descricao;
import entities.numeroSecreto;

public class Principal {

    public static void main(String[] args) {

        Descricao.descricaoJogo();

        numeroSecreto numeroSecreto = new numeroSecreto();
        numeroSecreto.adivinheONumeroSecreto();
    }
}
