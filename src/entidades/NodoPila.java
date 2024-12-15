/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jerss
 */
public class NodoPila<T> {
    private T info;
    private NodoPila<T> sgte;

    public NodoPila(T info) {
        this.info = info;
        this.sgte = null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodoPila<T> getSgte() {
        return sgte;
    }

    public void setSgte(NodoPila<T> sgte) {
        this.sgte = sgte;
    }
}
