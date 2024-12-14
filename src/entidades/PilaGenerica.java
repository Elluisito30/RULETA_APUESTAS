package entidades;

import java.util.EmptyStackException;

public class PilaGenerica<T> {
    private NodoPila<T> cima;
    private int tamaño;

    public PilaGenerica() {
        this.cima = null;
        this.tamaño = 0;
    }
    
    public boolean estaVacia() {
        return cima == null;
    }
    
    public int getTamaño() {
        return tamaño;
    }
    
    public void apilar(T elemento) {
        NodoPila<T> nuevoNodo = new NodoPila<>(elemento, cima);
        cima = nuevoNodo;
        tamaño++;
    }
    
    public T desapilar() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        T elemento = cima.getElemento();
        cima = cima.getSiguiente();
        tamaño--;
        return elemento;
    }
    
    public T cima() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return cima.getElemento();
    }
}
