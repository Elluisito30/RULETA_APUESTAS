package entidades;

public class Ficha {
    private int valor;
    private String color; 

    public Ficha(int valor, String color) {
        this.valor = valor;
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
