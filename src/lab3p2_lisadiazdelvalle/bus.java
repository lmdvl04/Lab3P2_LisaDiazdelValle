/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_lisadiazdelvalle;

/**
 *
 * @author HTS
 */
public class bus extends vehiculo{
    private int pasajeros;
    private String tipo;

    public bus() {
        super();
    }

    public bus(int pasajeros, String tipo, String color, String marca, int anio, double precio, int llantas) {
        super(color, marca, anio, precio, llantas);
        this.pasajeros = pasajeros;
        if (pasajeros > 50){
           this.tipo = "De Ruta"; 
        }else{
            this.tipo = "Rapidito";
        }
        
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBus" +"\n{" + "Pasajeros:" + pasajeros + ", Tipo:" + tipo + '}';
    }
    
    
    
}
