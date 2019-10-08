
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Nevera {
    private Bebida[] bebidas = new Bebida[10];
    public Nevera(Bebida[] bebidas){
        this.bebidas = bebidas;
    }    

    /**
     * @return the bebidas
     */
    public Bebida[] getBebidas() {
        return bebidas;
    }
    
    public String toString(){
        Map<String,Integer> map;
        map = new HashMap<String,Integer>();
        ArrayList<String> lista = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            if(!map.containsKey(this.bebidas[i].getNombre())){
                map.put(this.bebidas[i].getNombre(), 1);
                lista.add(this.bebidas[i].getNombre());
            }else{
                map.put(this.bebidas[i].getNombre(), map.get(this.bebidas[i].getNombre())+1);
            }
        }
        String retorno = "";
        for (int i = 0; i < lista.size(); i++) {
            retorno += lista.get(i) + " " + map.get(lista.get(i)) + "\n";
        }
        return retorno;
    }
}
