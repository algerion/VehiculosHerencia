/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Angel
 */
public class Acuatico extends Vehiculo {
    protected int tonelaje;
    
    public Acuatico() {
        this.setTonelaje(0);
    }

    public Acuatico(int tonelaje) {
        this.setTonelaje(tonelaje);
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public final void setTonelaje(int tonelaje) {
            this.tonelaje = tonelaje;
    }
    
    @Override
    public String toString(){
        return super.toString() + " con tonelaje de " + getTonelaje()+ " toneladas";
    }
}
