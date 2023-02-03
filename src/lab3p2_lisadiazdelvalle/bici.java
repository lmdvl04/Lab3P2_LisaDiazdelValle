/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_lisadiazdelvalle;

/**
 *
 * @author HTS
 */
public class bici extends vehiculo {

    private String descripcion;
    private int radio;
    private boolean tipo;

    public bici() {
        super();
    }

    public bici(String descripcion, int radio, boolean tipo, String color, String marca, int anio, double precio, int llantas) {
        super(color, marca, anio, precio, llantas);
        this.descripcion = descripcion;
        this.radio = radio;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String s = super.toString() + "bici{" + "descripcion=" + descripcion + ", radio=" + radio;
        if (tipo) {
            s += "tipo= BMX" +"}";
        } else {

            s += "tipo= DE CALLE"+"}";
        }
        
        return s;
    }

}
