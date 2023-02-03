/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_lisadiazdelvalle;

import java.util.Scanner;

/**
 *
 * @author HTS
 */
public class Lab3P2_LisaDiazdelValle {

    static Scanner leer = new Scanner(System.in);

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

        } while (menu != 5);

    }
}
