/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_lisadiazdelvalle;

import java.awt.Color;

/**
 *
 * @author HTS
 */
public class carro extends vehiculo{
    private int puertas;
    private String descMotor;
    private int velMax;

    public carro() {
       super();
    }

    public carro(int puertas, String descMotor, int velMax, String color, String marca, int anio, double precio, int llantas) {
        super(color, marca, anio, precio, llantas);
        this.puertas = puertas;
        this.descMotor = descMotor;
        this.velMax = velMax;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getDescMotor() {
        return descMotor;
    }

    public void setDescMotor(String descMotor) {
        this.descMotor = descMotor;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

   
    @Override
    public String toString() {
        return super.toString()+"\nCARRO"+"\n{" + "Puertas:" + puertas + ", Descripcion del motor: " + descMotor + ", Velocidad maxima:" + velMax + '}';
    }

    
    
    
    
    
}
