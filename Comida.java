/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Comida {
    private Postre postre;
    private Bebida bebida;
    
    public Comida(Bebida bebida,Postre postre){
        this.bebida = bebida;
        this.postre = postre;
    }

    /**
     * @return the postre
     */
    public Postre getPostre() {
        return postre;
    }

    /**
     * @return the bebida
     */
    public Bebida getBebida() {
        return bebida;
    }
    
    public String toString(){
        return "La bebida lleva " + getPostre().getNombre() + " y " + getBebida().getNombre();
    }   
    
    public boolean Consumir(){
        if(this.bebida.isContenido() && this.postre.isContenido()){
            this.bebida.Consumir();
            this.postre.Consumir();
            return true;
        }
        return false;
    }
}