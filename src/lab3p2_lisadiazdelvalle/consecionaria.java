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
public class consecionaria {
    private String nombre;
    private int id;
    private String direccion;
    private ArrayList <vehiculo> vehiculos = new ArrayList();
    private ArrayList <clientes> cliente = new ArrayList();
    private double saldo;

    public consecionaria() {
    }

    public consecionaria(String nombre, int id, String direccion, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<clientes> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<clientes> cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "consecionaria{" + "nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", vehiculos=" + vehiculos + ", cliente=" + cliente + ", saldo=" + saldo + '}';
    }
    
    
}
