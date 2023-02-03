/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_lisadiazdelvalle;

/**
 *
 * @author HTS
 */
public class moto extends vehiculo {
    private int desplazamiento;
    private boolean electrica;

    public moto() {
        super();
    }

    public moto(int desplazamiento, boolean electrica, String color, String marca, int anio, double precio, int llantas) {
        super(color, marca, anio, precio, llantas);
        this.desplazamiento = desplazamiento;
        this.electrica = electrica;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return super.toString()+"moto{" + "desplazamiento=" + desplazamiento + ", electrica=" + electrica + '}';
    }
    
    
    
}
