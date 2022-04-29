/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementos;

/**
 *
 * @author Angel
 */
public class Motor {
    private int num_cilindros;
    private int potencia;
    private Combustible tipo_combustible;

    public Motor(int num_cilindros, int potencia, Combustible tipo_combustible) {
        this.setNumCilindros(num_cilindros);
        this.setPotencia(potencia);
        this.setTipoCombustible(tipo_combustible);
    }

    public final void setNumCilindros(int num_cilindros) {
        if(num_cilindros > 0)
            this.num_cilindros = num_cilindros;
        else
            this.num_cilindros = 1;
    }

    public final void setPotencia(int potencia) {
        if(potencia > 0)
            this.potencia = potencia;
        else
            this.potencia = 1;
    }

    public final void setTipoCombustible(Combustible tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public int getNumCilindros() {
        return num_cilindros;
    }

    public int getPotencia() {
        return potencia;
    }

    public Combustible getTipoCombustible() {
        return tipo_combustible;
    }

    @Override
    public String toString(){
        return "El motor tiene " + num_cilindros + " cilindros, con una potencia de " +
                potencia + " HP y usa combustible de " + tipo_combustible.name().toLowerCase();
    }
}
