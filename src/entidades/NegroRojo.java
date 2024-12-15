package entidades;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NegroRojo {
    private String colorApuesta;
    private Ficha ficha;
    
    private static final List<Integer> N_NEGROS = Arrays.asList(2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35);
    private static final List<Integer> N_ROJOS = Arrays.asList(1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36);

    public NegroRojo(String colorApuesta, Ficha ficha) {
        this.colorApuesta = colorApuesta.toLowerCase();
        this.ficha = ficha;
    }

    public String getColorApuesta() {
        return colorApuesta;
    }

    public void setColorApuesta(String colorApuesta) {
        this.colorApuesta = colorApuesta;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    
    public boolean esGanador(ListaNumerosGanadores numerosGanadores){
        for (int numero : numerosGanadores.obtenerNumerosGanadores()) {
            if (colorApuesta.equals("negro") && N_NEGROS.contains(numero)) {
                return true;
            }
            
            if (colorApuesta.equals("rojo") && N_ROJOS.contains(numero)) {
                return true;
            }
        }
        return false;
    }
    
    public int calcularGanancia(){
        return ficha.getValor()*2;
    }
}
