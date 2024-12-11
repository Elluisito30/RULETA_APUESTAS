/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Random;
/**
 *
 * @author Dell
 */
public class ListaCircularAleatoria {
    private Nodo cabeza;

    private class Nodo {
        int numero;
        Nodo siguiente;

        public Nodo(int numero) {
            this.numero = numero;
        }
    }

    public void agregar(int numero) {
        Nodo nuevo = new Nodo(numero);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    public int girar() {
        if (cabeza == null) return -1;

        Random random = new Random();
        int pasos = random.nextInt(37); // Números de la ruleta

        Nodo temp = cabeza;
        for (int i = 0; i < pasos; i++) {
            temp = temp.siguiente;
        }
        return temp.numero;
    }
}
