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
public class Camion extends Terrestre {
    public Camion(){
        
    }
    
    public Camion(int num_neumaticos){
        setNumNeumaticos(num_neumaticos);
    }
    
    @Override
    public void setPasajeros(int pasajeros){
        if(pasajeros > cupoMaximo())
            this.pasajeros = cupoMaximo();
        else
            this.pasajeros = pasajeros;
        super.setPasajeros(pasajeros);
    }

    public int cupoMaximo(){
        return 25;
    }

    @Override
    public int getNumNeumaticos() {
        return num_neumaticos;
    }

    @Override
    public void setNumNeumaticos(int num_neumaticos) {
        int multiplo = 4;
        if(num_neumaticos < multiplo * 2)
            this.num_neumaticos = multiplo * 2;
        else if(num_neumaticos > multiplo * 8)
            this.num_neumaticos = multiplo * 8;
        else if(num_neumaticos % multiplo != 0)
            this.num_neumaticos = num_neumaticos + multiplo - (num_neumaticos % multiplo);
/*
            while(num_neumaticos % 4 != 0)
                this.num_neumaticos = ++num_neumaticos;
*/
        else
            this.num_neumaticos = num_neumaticos;
    }
}
