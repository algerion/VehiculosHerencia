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
    public AutoDeCarreras(){
    }
    
    public AutoDeCarreras(int pasajeros, int num_neumaticos){
        super(); //pasajeros, num_neumaticos);
    }
    
    @Override
    public void setPasajeros(int pasajeros){
        if(pasajeros >= 2)
            this.pasajeros = 2;
        else
            this.pasajeros = 0;
    }
}
