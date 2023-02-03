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
                break;//fin case 1 principal
                case 2: {
                    int menucliente = 0;
                    do {
                        System.out.println("---CRUD CLIENTE---");
                        System.out.println("1. Anadir");
                        System.out.println("2. Eliminar");
                        System.out.println("3. Volver");
                        System.out.println("Ingrese la opcion: ");
                        menucliente = leer.nextInt();

                        switch (menucliente) {
                            case 1: {
                                cliente.add(newCliente());
                            }
                            break;
                            case 2: {
                                System.out.println(cliente);
                                System.out.println("Que posicion quiere eliminar: ");
                                int posicion = leer.nextInt();
                                if (posicion < cliente.size() && posicion >= 0) {
                                    cliente.remove(posicion);
                                }
                            }
                            break;
                        }

                    } while (menucliente != 3);
                }
                break;//fin case 2 principal
                case 3: {
                    if (!conse.isEmpty()) {
                        int menuvehi = 0;
                        do {
                            System.out.println("---CRUD VEHICULO---");
                            System.out.println("1. Anadir");
                            System.out.println("2. Modificar");
                            System.out.println("3. Eliminar");
                            System.out.println("4. Volver");
                            System.out.println("Ingrese la opcion: ");
                            menuvehi = leer.nextInt();

                            switch (menuvehi) {
                                case 1: {
                                    vehi.add(newVehi());

                                }
                                break;
                                case 2: {
                                    int modvehi = 0;
                                    System.out.println(vehi);
                                    System.out.println("Ingrese la posicion a modificar: ");
                                    int posicion = leer.nextInt();
                                    do {
                                        System.out.println("---QUE QUIERE MODIFICAR---");
                                        System.out.println("1. Color");
                                        System.out.println("2. Marca");
                                        System.out.println("3. Anio");
                                        System.out.println("4. Precio");
                                        System.out.println("5. Llantas");
                                        System.out.println("6. Volver");
                                        System.out.println("Ingrese la opcion: ");
                                        modvehi = leer.nextInt();

                                        switch (modvehi) {
                                            case 1: {
                                                if (posicion >= 0 & posicion < vehi.size()) {
                                                    if (vehi.get(posicion) instanceof vehiculo && posicion >= 0 && posicion < vehi.size()) {
                                                        System.out.println("Elija el nuevo color: ");
                                                        String color = leer.next();
                                                        ((vehiculo) vehi.get(posicion)).setColor(color);
                                                    } else {
                                                        System.out.println("La posicion entregada no es valida");

                                                    }
                                                }
                                            }
                                            break;
                                            case 2: {
                                                if (posicion >= 0 & posicion < vehi.size()) {
                                                    if (vehi.get(posicion) instanceof vehiculo && posicion >= 0 && posicion < vehi.size()) {
                                                        System.out.println("Ingrese la nueva marca: ");
                                                        String m = leer.next();
                                                        ((vehiculo) vehi.get(posicion)).setMarca(m);
                                                    } else {
                                                        System.out.println("La posicion entregada no es valida");

                                                    }
                                                }
                                            }
                                            break;
                                            case 3: {
                                                if (posicion >= 0 & posicion < vehi.size()) {
                                                    if (vehi.get(posicion) instanceof vehiculo && posicion >= 0 && posicion < vehi.size()) {
                                                        System.out.println("Ingrese el nuevo anio: ");
                                                        int anio = leer.nextInt();
                                                        ((vehiculo) vehi.get(posicion)).setAnio(anio);
                                                    } else {
                                                        System.out.println("La posicion entregada no es valida");

                                                    }
                                                }
                                            }
                                            break;
                                            case 4: {
                                                if (posicion >= 0 & posicion < vehi.size()) {
                                                    if (vehi.get(posicion) instanceof vehiculo && posicion >= 0 && posicion < vehi.size()) {
                                                        System.out.println("Ingrese el nuevo precio: ");
                                                        double p = leer.nextDouble();
                                                        ((vehiculo) vehi.get(posicion)).setPrecio(p);
                                                    } else {
                                                        System.out.println("La posicion entregada no es valida");

                                                    }
                                                }
                                            }
                                            break;
                                            case 5: {
                                                if (posicion >= 0 & posicion < vehi.size()) {
                                                    if (vehi.get(posicion) instanceof vehiculo && posicion >= 0 && posicion < vehi.size()) {
                                                        System.out.println("Ingrese la nueva cantidad de llantas: ");
                                                        int llan = leer.nextInt();
                                                        ((vehiculo) vehi.get(posicion)).setLlantas(llan);
                                                    } else {
                                                        System.out.println("La posicion entregada no es valida");

                                                    }
                                                }
                                            }
                                            break;

                                        }

                                    } while (modvehi != 6);
                                }
                                break;
                            }

                        } while (menuvehi != 4);
                    } else {
                        System.out.println("Necesita crear al menos una concesionaria");
                    }
                }
                break; //fin case 3 principal
                case 4: {
                    int compra = 0;
                    do {
                        System.out.println("--COMPRA/VENTA--");
                        System.out.println("Quien compra?");
                        System.out.println("1. Cliente");
                        System.out.println("2. Concensionaria");
                        System.out.println("Ingrese la opcion: ");
                        compra = leer.nextInt();
                        switch (compra) {
                            case 1: {
                                String listav = "";
                                for (Object v : vehi) {
                                    if (v instanceof vehiculo) {
                                        listav += "" + vehi.indexOf(v) + " : " + v + "\n";
                                    }
                                }
                                String listac = "";
                                for (Object c : cliente) {
                                    if (c instanceof clientes) {
                                        listac += "" + cliente.indexOf(c) + " : " + c + "\n";
                                    }
                                }
                                System.out.println(listav);
                                System.out.println(listac);

                                System.out.println("Ingrese el indice del cliente que esta comprando: ");
                                int poscliente = leer.nextInt();
                                System.out.println("Ingrese el indice que quiere comprar");
                                int posicion = leer.nextInt();

                                double saldocliente = ((clientes) cliente.get(poscliente)).getSaldo();
                                double preciocarro = ((vehiculo) vehi.get(posicion)).getPrecio();
                                double dineroc = ((consecionaria) conse.get(posicion)).getSaldo();

                                if (vehi.get(posicion) instanceof vehiculo && posicion >= 0 && posicion < vehi.size() && saldocliente > preciocarro) {
                                    vehi.remove(posicion);
                                    ((clientes) cliente.get(poscliente)).getVehiculos().add(vehi.get(posicion));
                                    System.out.println(cliente);
                                    double nuevodineroconce = dineroc + preciocarro;
                                    ((consecionaria) conse.get(posicion)).setSaldo(nuevodineroconce);
                                } else {
                                    System.out.println("La posicion es incorrecta o su saldo es insuficiente");
                                }
                            }
                            break;
                            case 2: {
                                String listav = "";
                                for (Object v : vehi) {
                                    if (v instanceof vehiculo) {
                                        listav += "" + vehi.indexOf(v) + " : " + v + "\n";
                                    }
                                }
                                String listac = "";
                                for (Object c : conse) {
                                    if (c instanceof consecionaria) {
                                        listac += "" + conse.indexOf(c) + " : " + c + "\n";
                                    }
                                }
                                System.out.println(listav);
                                System.out.println(listac);

                                System.out.println("Ingrese el indice de concesionaria que esta comprando: ");
                                int poscon = leer.nextInt();
                                System.out.println("Ingrese el indice que quiere comprar");
                                int posicion = leer.nextInt();

                              
                                double preciocarro = ((vehiculo) vehi.get(posicion)).getPrecio();
                                double dineroc = ((consecionaria) conse.get(posicion)).getSaldo();

                                if (vehi.get(posicion) instanceof vehiculo && posicion >= 0 && posicion < vehi.size() && dineroc > preciocarro) {
                                    vehi.remove(posicion);
                                    ((consecionaria) conse.get(poscon)).getVehiculos().add(vehi.get(posicion));
                                    System.out.println(conse);
                                    double nuevodineroconce = dineroc - preciocarro;
                                    ((consecionaria) conse.get(posicion)).setSaldo(nuevodineroconce);
                                } else {
                                    System.out.println("La posicion es incorrecta o su saldo es insuficiente");
                                }
                            }
                            break;
                        }

                    } while (compra != 3);
                }
                break;//fin case 4 principal
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
        if (llantas == 2) {
            System.out.println("1. Moto");
            System.out.println("2. Bici");
            System.out.println("Ingrese la opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("--MOTO--");
                    System.out.println("Ingrese el desplazamiento de su motor: ");
                    int des = leer.nextInt();
                    System.out.println("Su moto es electrica?");
                    System.out.println("1. si");
                    System.out.println("2. no");
                    System.out.println("Ingrese la opcion: ");
                    int elec = leer.nextInt();
                    boolean electrica = false;
                    switch (elec) {
                        case 1: {
                            electrica = true;
                        }
                        break;
                        case 2: {
                            electrica = false;
                        }
                        break;
                    }
                    moto nuevamoto;
                    nuevamoto = new moto(des, electrica, color, marca, anio, precio, llantas);
                    vehi.add(nuevamoto);
                    return nuevamoto;
                }
                //break;
                case 2: {
                    System.out.println("--BICICLETA--");
                    System.out.println("Ingrese la descripcion:");
                    String descrip = leer.next();
                    System.out.println("Ingrese el radio de la rueda");
                    int radio = leer.nextInt();
                    System.out.println("Su bici es BMX o de calle?");
                    System.out.println("1. BMX");
                    System.out.println("2. De calle");
                    System.out.println("Ingrese la opcion: ");
                    int tipo = leer.nextInt();
                    boolean bmx = false;
                    switch (tipo) {
                        case 1: {
                            bmx = true;
                        }
                        break;
                        case 2: {
                            bmx = false;
                        }
                        break;
                    }
                    bici nuevabici;
                    nuevabici = new bici(descrip, radio, bmx, color, marca, anio, precio, llantas);
                    vehi.add(nuevabici);
                    return nuevabici;
                }
                default: {
                    System.out.println("Opcion no validad");
                }
            }
        } else if (llantas == 4) {
            System.out.println("1. Carro");
            System.out.println("2. Camion de carga");
            System.out.println("3. Bus");
            System.out.println("Ingrese la opcion: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("--CARRO--");
                    System.out.println("Ingrese la cantidad de puertas: ");
                    int puertas = leer.nextInt();
                    System.out.println("Ingrese la descripcion del motor: ");
                    String descrip = leer.next();
                    System.out.println("Ingrese la velocidad maxima: ");
                    int vel = leer.nextInt();
                    carro nuevocarro;
                    nuevocarro = new carro(puertas, descrip, vel, color, marca, anio, precio, llantas);
                    vehi.add(nuevocarro);
                    return nuevocarro;
                }
                case 2: {
                    System.out.println("--CAMION DE CARGA--");
                    System.out.println("Ingrese el volumen maximo de carga: ");
                    int vol = leer.nextInt();
                    System.out.println("Ingrese la altura: ");
                    int alt = leer.nextInt();
                    System.out.println("Tiene retroexcavadora?");
                    System.out.println("1. si");
                    System.out.println("2. no");
                    System.out.println("Ingrese la opcion: ");
                    int op = leer.nextInt();
                    boolean retro = false;
                    switch (op) {
                        case 1: {
                            retro = true;
                        }
                        break;
                        case 2: {
                            retro = false;
                        }
                        break;
                    }
                    camion nuevocamion;
                    nuevocamion = new camion(vol, alt, retro, color, marca, anio, precio, llantas);
                    vehi.add(nuevocamion);
                    return nuevocamion;
                }
                case 3: {
                    System.out.println("--BUS--");
                    System.out.println("Ingrese la capacidad de pasajeros: ");
                    int pasa = leer.nextInt();
                    String s = "";
                    bus nuevobus;
                    nuevobus = new bus(pasa, s, color, marca, anio, precio, llantas);
                    vehi.add(nuevobus);
                    return nuevobus;
                }

            }
        }

        return new vehiculo();
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

