
package entidades;

public class ListaEnlazadaDColores {
    private Nodo primero;
    private Nodo ultimo;
    
    public ListaEnlazadaDColores(){
        primero = null;
        ultimo = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean esVacia(){
        if(primero==null && ultimo==null)
            return true;
        else 
            return false;
    }
    
    public void agregarAlFinal(int v){
        Nodo nv = new Nodo(v);
        if(primero==null){
            nv.setSgte(null);
            nv.setAnt(null);
            primero=nv;
            ultimo=nv;
        }
        else{
            nv.setSgte(null);
            nv.setAnt(ultimo);
            ultimo.setSgte(nv);
            ultimo=nv;
        }
    }
    
    public void agregarAlInicio(int v){
        Nodo nv = new Nodo(v);
        if(primero==null){
            nv.setSgte(null);
            nv.setAnt(null);
            primero=nv;
            ultimo=nv;
        }
        else{
            nv.setSgte(primero);
            nv.setAnt(null);
            primero.setAnt(nv);
            primero=nv;
        }
    }

    public Nodo buscarColor (int numero){
        Nodo p=primero;
        while(p!=null){
            if(p.getInfo()==numero)
                return p;
            p=p.getSgte();
        }
        return null;
    }
}
