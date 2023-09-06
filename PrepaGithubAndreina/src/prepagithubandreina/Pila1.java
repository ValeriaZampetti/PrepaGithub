/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepagithubandreina;


import javax.swing.JOptionPane;

/**
 *
 * @author Luis Stanislao
 */
public class Pila1 {

   private Nodo pInicio;
    private int Size;

    public Nodo getpInicio() {
        return pInicio;
    }

    public void setpInicio(Nodo pInicio) {
        this.pInicio = pInicio;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public boolean EsVacio() {
        return pInicio == null;
    }

    public Object LeerCabeza() {
        return pInicio.getDato();
    }

    public void Desapilar() {
        if (!EsVacio()) {
            pInicio = pInicio.getPnext();
            Size = Size - 1;

        }
    }

    public void Apilar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (EsVacio()) {

            pInicio = nuevo;

        } else {
            Nodo aux = getpInicio();
            nuevo.setPnext(aux);
            pInicio = nuevo;
        }
        Size = Size + 1;
    }

    public Object LeerTope() {
        return pInicio.getDato();
    }

    public void Imprimir() {
        if (EsVacio() == false) {
            Nodo aux = pInicio;
            for (int i = 0; i < getSize(); i++) {
                System.out.print(aux.getDato() + ", ");
                aux = aux.getPnext();
            }
            System.out.println("");
        } else {
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }

    }
    
    static void eliminarMedio(Pila1 stack, int n, int current){
        if(stack.EsVacio() || current == n){
            return;
            
        }
        
        Object dato = stack.LeerTope();
        stack.Desapilar();
        
        eliminarMedio(stack, n, current+1);
        
        if( current != n/2){
            stack.Apilar(dato);
            
        }
        
    }
    
    static void agregarmedio(Pila1 stack, int n, int current){
        if(stack.EsVacio() || current == n){
            return;
            
        }
        
        Object dato = stack.LeerTope();
        stack.Desapilar();
        
        agregarmedio(stack, n, current+1);
        
        
        
        
        if( current != n/2 ){
            stack.Apilar(dato);
            
        }
        
        
        
        
    }
    
    
    
    

    
}
    
    
    
    

