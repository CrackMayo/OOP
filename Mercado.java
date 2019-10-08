/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Mercado {
    public static void main(String[]args){
        Bebida[] bebidas = new Bebida[10];
        bebidas[0] = new Bebida("Cerveza");
        bebidas[1] = new Bebida("Cerveza");
        bebidas[2] = new Bebida("Cerveza");
        bebidas[3] = new Bebida("Cerveza");
        bebidas[4] = new Bebida("Cerveza");
        bebidas[5] = new Bebida("Cerveza");
        bebidas[6] = new Bebida("Jugo");
        bebidas[7] = new Bebida("Malta");
        bebidas[8] = new Bebida("Jugo");
        bebidas[9] = new Bebida("Coca Cola");
        Nevera nevera = new Nevera(bebidas);
        System.out.println(nevera.toString());
    }
}
