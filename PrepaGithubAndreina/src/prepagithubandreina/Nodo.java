/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepagithubandreina;

/**
 *
 * @author valeriazampetti
 */
public class Nodo {
    private Object dato;
    private Nodo pNext;

    public Nodo(Object dato) {
        this.dato = dato;
        pNext = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getPnext() {
        return pNext;
    }

    public void setPnext(Nodo pnext) {
        this.pNext = pnext;
    }
    
    
    
    
    
}
