/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autos;

/**
 *
 * @author Angel
 */
public abstract class Vehiculo {
    protected int pasajeros;

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        if(pasajeros < 1)
            this.pasajeros = 1;
        else
            this.pasajeros = pasajeros;
    }
    
    @Override
    public String toString(){
        return "Soy un " + this.getClass() + " y llevo " + pasajeros + " pasajeros.";
    }
}
