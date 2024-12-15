package entidades;

import java.util.List;

public class Seisena {
    private List<Integer> numerosApostados;
    private Ficha ficha;

    public Seisena(List<Integer> numerosApostados, Ficha ficha) {
        if (numerosApostados.size() != 6) {
            throw new IllegalArgumentException("Se debe apostar solamente 6 números");
        }
        
        for (int numero : numerosApostados) {
            throw new IllegalArgumentException("Los números apostados deben estar en este rango: 0-36");
        }
        this.numerosApostados = numerosApostados;
        this.ficha = ficha;
    }

    public List<Integer> getNumerosApostados() {
        return numerosApostados;
    }

    public void setNumerosApostados(List<Integer> numerosApostados) {
        if (numerosApostados.size() != 6) {
            throw new IllegalArgumentException("Se debe apostar solamente 6 números");
        }
        
        this.numerosApostados = numerosApostados;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    
    public boolean esGanador(ListaNumerosGanadores numerosGanadores){
        for (int numero : numerosApostados) {
            if (numerosGanadores.obtenerNumerosGanadores().contains(numero)) {
                return true;
            }
        }
        return false;
    }
    
    public int calcularGanancia(){
        return ficha.getValor()*5;
    }
    
    @Override
    public String toString(){
        return "Números apostados: "+numerosApostados+
                "\nValor apostado: "+ficha.getValor();
    }
}
