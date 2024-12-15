package entidades;

public class Pleno {
    private int numeroApostado;
    private Ficha ficha;
    
    public Pleno(int numeroApostado, Ficha ficha) {
        if (numeroApostado < 0 || numeroApostado > 36) {
            throw new IllegalArgumentException("El número apostado se debe enconrar entre 0 y 3.");
        }
        this.numeroApostado = numeroApostado;
        this.ficha = ficha;
    }

    public int getNumeroApostado() {
        return numeroApostado;
    }

    public void setNumeroApostado(int numeroApostado) {
        if (numeroApostado < 0 || numeroApostado > 36) {
            throw new IllegalArgumentException("El número apostado se debe enconrar entre 0 y 3.");
        }
        this.numeroApostado = numeroApostado;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    
    public boolean esGanador(ListaNumerosGanadores numerosGanadores){
        return numerosGanadores.obtenerNumerosGanadores().contains(numeroApostado);
    }
    
    public int calcularGanancia(){
        return ficha.getValor()*35;
    }
    
    public String toString(){
        return "Número apostado: "+numeroApostado+
                "\nValor Apostado: "+ficha.getValor();
    }
}
