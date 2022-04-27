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
public class AutoDeCarreras extends Automovil {
    @Override
    public void setPasajeros(int pasajeros){
        if(pasajeros >= 1)
            this.pasajeros = 1;
        else
            this.pasajeros = 0;
    }
}
