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
public class vehiculo {
    protected String color;
    protected String marca;
    protected int anio;
    protected double precio;
    protected int llantas;

    public vehiculo() {
    }

    public vehiculo(String color, String marca, int anio, double precio, int llantas) {
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    @Override
    public String toString() {
        return "\nVEHICULO"+"\n{" + "Color:" + color + ", Marca:" + marca + ", Anio:" + anio + ", Precio: Lps. " + precio + ", Llantas:" + llantas + '}';
    }
    
    
    
}
