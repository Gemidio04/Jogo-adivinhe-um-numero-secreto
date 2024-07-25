package entities;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class verificaNumero {

    private Set<Integer> numerosTentados;
    public verificaNumero() {
        this.numerosTentados = new HashSet<>();
    }

    public boolean verificaSeONumeroERepetido(int numero) {
        if (numerosTentados.contains(numero)) {
            return true;
        } else {
            numerosTentados.add(numero);
            return false;
        }
    }
}
