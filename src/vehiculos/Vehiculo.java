/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import implementos.Combustible;
import implementos.Motor;

/**
 *
 * @author Angel
 */
public abstract class Vehiculo {
    protected int pasajeros;
    protected Motor motor;

    public Vehiculo() {
        this.pasajeros = 1;
        this.motor = new Motor(0, 0, Combustible.GASOLINA);
    }

    public Vehiculo(int pasajeros) {
        this.pasajeros = pasajeros;
        this.motor = new Motor(0, 0, Combustible.GASOLINA);
    }

    public Vehiculo(int pasajeros, Motor motor) {
        this.pasajeros = pasajeros;
        this.motor = motor;
    }

    public Vehiculo(int pasajeros, int cilindros, int potencia, Combustible combustible) {
        this.pasajeros = pasajeros;
        this.motor = new Motor(cilindros, potencia, combustible);
    }

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
        return "Soy un " + this.getClass() + 
                ".\n" + motor + 
                "\nLlevo " + pasajeros + " pasajeros, ";
    }
}
