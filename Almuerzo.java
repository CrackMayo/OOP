/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Almuerzo {
    public static void main(String[]args){
        Comida comida = new Comida(new Bebida("Pepsi"), new Postre("Gelatina"));
        System.out.println(comida.toString());
        if(comida.Consumir()){
            System.out.println("Consumiste la comida");
        }else{
            System.out.println("No consumiste la comida");
        }
    }
}
