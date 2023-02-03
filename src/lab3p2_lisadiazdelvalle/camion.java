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
public class camion extends vehiculo {

    private int volumen;
    private int altura;
    private boolean retroexcavadora;

    public camion() {
        super();
    }

    public camion(int volumen, int altura, boolean retroexcavadora, String color, String marca, int anio, double precio, int llantas) {
        super(color, marca, anio, precio, llantas);
        this.volumen = volumen;
        this.altura = altura;
        this.retroexcavadora = retroexcavadora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetroexcavadora() {
        return retroexcavadora;
    }

    public void setRetroexcavadora(boolean retroexcavadora) {
        this.retroexcavadora = retroexcavadora;
    }

    @Override
    public String toString() {
        return super.toString() + "camion{" + "volumen=" + volumen + ", altura=" + altura + ", retroexcavadora=" + retroexcavadora + '}';
    }

}
