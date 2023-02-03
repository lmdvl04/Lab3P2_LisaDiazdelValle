/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_lisadiazdelvalle;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HTS
 */
public class Lab3P2_LisaDiazdelValle {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<consecionaria> conse = new ArrayList();
    static ArrayList<clientes> cliente = new ArrayList();
    static ArrayList<vehiculo> vehi = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 0;
        do {
            System.out.println("---MENU---");
            System.out.println("1. CRUD Concesionaria");
            System.out.println("2. CRUD Clientes");
            System.out.println("3. CRUD Vehiculos");
            System.out.println("4. Compra/Venta");
            System.out.println("5. Salir");
            System.out.println("Ingrese su opcion: ");
            menu = leer.nextInt();

            switch (menu) {
                case 1: {
                    int menuconce = 0;
                    do {
                        System.out.println("---CRUD CONCESIONARIA---");
                        System.out.println("1. Anadir");
                        System.out.println("2. Modificar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Volver");
                        System.out.println("Ingrese la opcion: ");
                        menuconce = leer.nextInt();

                        switch (menuconce) {
                            case 1: {
                                conse.add(newConce());
                            }
                            break;
                            case 2: {
                                System.out.println(conse);
                                System.out.println("Ingrese la posicion a modificar: ");
                                int posicion = leer.nextInt();
                                if (posicion >= 0 & posicion < conse.size()) {
                                    if (conse.get(posicion) instanceof consecionaria && posicion >= 0 && posicion < conse.size()) {
                                        System.out.println("Ingrese la nueva direccion: ");
                                        String dir = leer.next();
                                        ((consecionaria) conse.get(posicion)).setDireccion(dir);
                                    } else {
                                        System.out.println("La posicion entregada no es valida");

                                    }
                                }

                            }
                            break;
                            case 3: {
                                System.out.println(conse);
                                System.out.println("Que posicion quiere eliminar: ");
                                int posicion = leer.nextInt();
                                if (posicion < conse.size() && posicion >= 0) {
                                    conse.remove(posicion);
                                }

                            }
                            break;
                        }

                    } while (menuconce != 4);
                }
                break;
                case 2: {
                    int menucliente = 0;
                    do {
                        System.out.println("---CRUD CLIENTE---");
                        System.out.println("1. Anadir");
                        System.out.println("2. Modificar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Volver");
                        System.out.println("Ingrese la opcion: ");
                        menucliente = leer.nextInt();

                        switch (menucliente) {
                            case 1: {
                                cliente.add(newCliente());
                            }
                            break;
                            case 2: {
                                System.out.println(cliente);
                                System.out.println("Ingrese la posicion a modificar: ");
                                int posicion = leer.nextInt();
                                if (posicion >= 0 & posicion < cliente.size()) {
                                    if (cliente.get(posicion) instanceof clientes && posicion >= 0 && posicion < cliente.size()) {
                                        System.out.println("Ingrese la nueva direccion: ");
                                        String dir = leer.next();
                                        ((consecionaria) conse.get(posicion)).setDireccion(dir);
                                    } else {
                                        System.out.println("La posicion entregada no es valida");

                                    }
                                }

                            }
                            break;
                            case 3: {
                                System.out.println(conse);
                                System.out.println("Que posicion quiere eliminar: ");
                                int posicion = leer.nextInt();
                                if (posicion < conse.size() && posicion >= 0) {
                                    conse.remove(posicion);
                                }

                            }
                            break;
                        }

                    } while (menucliente != 4);
                }
                break;
            }
        } while (menu != 5);
    }

    static vehiculo newVehi() {
        System.out.println("---NUEVO VEHICULO---");
        System.out.println("Ingrese el color: ");
        String color = leer.next();
        System.out.println("Ingrese la marca: ");
        String marca = leer.next();
        System.out.println("Ingrese el anio:");
        int anio = leer.nextInt();
        System.out.println("Ingrese el precio: ");
        double precio = leer.nextDouble();
        System.out.println("Ingrese la cantidad de llantas: ");
        int llantas = leer.nextInt();
        vehiculo nuevoveh;
        nuevoveh = new vehiculo(color, marca, anio, precio, llantas);
        return nuevoveh;
    }

    static clientes newCliente() {
        System.out.println("---NUEVO CLIENTE---");
        int id = cliente.size() + 1;
        System.out.println("Ingrese su numbre: ");
        String nom = leer.next();
        System.out.println("Ingrese su saldo: ");
        double saldo = leer.nextDouble();
        clientes nuevocliente;
        nuevocliente = new clientes(id, nom, saldo);
        return nuevocliente;
    }

    static consecionaria newConce() {
        System.out.println("---NUEVA CONCESIONARIA---");
        System.out.println("Ingrese el nombre");
        String nom = leer.next();
        int id = conse.size() + 1;
        System.out.println("Ingrese la direccion: ");
        String direc = leer.next();
        System.out.println("Ingrese el saldo: ");
        double saldo = leer.nextDouble();
        consecionaria nuevaconce;
        nuevaconce = new consecionaria(nom, id, direc, saldo);
        return nuevaconce;
    }
}

//    static carro newCarro(){
//        System.out.println("--CARRO--");
//        System.out.println("Ingrese la cantidad de puertas: ");
//        int puertas = leer.nextInt();
//        System.out.println("Ingrese la descripcion del motor: ");
//        String desc = leer.next();
//        System.out.println("Ingrese la velocidad maxima: ");
//        int vel = leer.nextInt();
//        carro nuevocarro;
//        nuevocarro = new carro (puertas, desc, vel);
//        return nuevocarro;

