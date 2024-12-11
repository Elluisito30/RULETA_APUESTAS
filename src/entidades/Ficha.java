package entidades;

public class Ficha {
    private int valor;
    private String color; // Opcional: si las fichas tienen color

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

    @Override
    public String toString() {
        return "Ficha {valor=" + valor + ", color='" + color + "'}";
    }
}
