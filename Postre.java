/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Postre {
    private String nombre;
    private boolean contenido;
    
    public Postre(String nombre){
        this.nombre = nombre;
        this.contenido = true;
    }
    
    public boolean Consumir(){
        if(isContenido()){
            this.contenido = false;
            return true;
        }
        return false;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the contenido
     */
    public boolean isContenido() {
        return contenido;
    }
}
