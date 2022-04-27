/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import autos.Camion;
import autos.Automovil;
import autos.AutoDeCarreras;

/**
 *
 * @author Angel
 */
public class Instanciador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil carrito = new Automovil();
        Camion camionsote = new Camion(), citibus = new Camion(), guajolojet = new Camion();
        AutoDeCarreras checoperez = new AutoDeCarreras();
        
        checoperez.setPasajeros(10);
        //llenaDePasajeros(carrito);
        //llenaDePasajeros(camionsote);
        carrito.setNumNeumaticos(2);
        camionsote.setPasajeros(-7);
        camionsote.setNumNeumaticos(20);
        citibus.setNumNeumaticos(25);
        guajolojet.setNumNeumaticos(4);
        System.out.println(carrito);
        System.out.println(camionsote);
        System.out.println(citibus);
        System.out.println(guajolojet);
        System.out.println(checoperez);
    }
    
    public static void llenaDePasajeros(Automovil a){
        int actual = a.getPasajeros(), anterior;
        
        do{
            anterior = actual;
            actual++;
            a.setPasajeros(actual);
        }while(anterior != a.getPasajeros());
    }

    public static void llenaDePasajeros(Camion c){
        c.setPasajeros(c.cupoMaximo());
    }
}
