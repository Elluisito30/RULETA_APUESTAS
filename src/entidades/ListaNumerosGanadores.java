
package entidades;

import java.util.ArrayList;

public class ListaNumerosGanadores {
    private ArrayList<Integer> numerosGanadores;

    public ListaNumerosGanadores() {
        numerosGanadores = new ArrayList<>();
    }

    public void agregarNumeroGanador(int numero) {
        numerosGanadores.add(numero);
    }

    public ArrayList<Integer> obtenerNumerosGanadores() {
        return numerosGanadores;
    }

}
