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
public abstract class Terrestre extends Vehiculo {
    protected int num_neumaticos;
    
    public Terrestre(){
        setNumNeumaticos(0);
    }
    
    public abstract void setNumNeumaticos(int num_neumaticos);
    
    public abstract int getNumNeumaticos();

    @Override
    public String toString(){
        return super.toString() + " con " + getNumNeumaticos() + " neumáticos";
    }
}
