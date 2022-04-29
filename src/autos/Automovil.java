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
public class Automovil extends Terrestre {
    public Automovil(){
    }
    
    public Automovil(int pasajeros, int num_neumaticos){
        setPasajeros(pasajeros);
        setNumNeumaticos(num_neumaticos);
    }
    
    @Override
    public void setPasajeros(int pasajeros){
        if(pasajeros > 8)
            this.pasajeros = 8;
        else
            this.pasajeros = pasajeros;
        super.setPasajeros(pasajeros);
    }

    @Override
    public int getNumNeumaticos() {
        return num_neumaticos;
    }

    @Override
    public void setNumNeumaticos(int num_neumaticos) {
        if(num_neumaticos < 4)
            this.num_neumaticos = 4;
        else if(num_neumaticos > 12)
            this.num_neumaticos = 12;
        else if(num_neumaticos % 2 != 0)
            this.num_neumaticos = num_neumaticos + 1;
        else
            this.num_neumaticos = num_neumaticos;
    }
    
    
}
