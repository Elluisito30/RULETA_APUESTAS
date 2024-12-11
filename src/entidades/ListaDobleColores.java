/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Dell
 */
public class ListaDobleColores {
    private Nodo cabeza;
    private Nodo cola;

    public void agregar(int numero, String color) {
        Nodo nuevo = new Nodo(numero, color);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public String buscarColor(int numero) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.numero == numero) {
                return temp.color;
            }
            temp = temp.siguiente;
        }
        return null;
    }
}
