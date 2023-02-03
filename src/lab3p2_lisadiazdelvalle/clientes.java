/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_lisadiazdelvalle;

import java.util.ArrayList;

/**
 *
 * @author HTS
 */
public class clientes {
    private int id;
    private String nombre;
    private ArrayList <vehiculo> vehiculos = new ArrayList ();
    private double saldo;

    public clientes() {
    }

    public clientes(int id, String nombre, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "clientes{" + "id=" + id + ", nombre=" + nombre + ", vehiculos=" + vehiculos + ", saldo=" + saldo + '}';
    }
    
    
    
}
