package lab3p2_darielsevilla;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Lab3P2_DarielSevilla {

    static Scanner lea = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //no listar
        //id. nombre, y arraylists no se modifican ni n
        //carros - todo menos la super clase
        ArrayList<Concesionaria> listaConcesionarias = new ArrayList();
        
        int op = 0;
        do {
            System.out.println("Ingrese opcion:");
            System.out.println("1-CRUD Concesionaria");
            System.out.println("2-CRUD Clientes");
            System.out.println("3-CRUD Vehiculos");
            System.out.println("4- Salida");
            op = lea.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("1-crear consecionaria");
                    System.out.println("2-Modificar");
                    System.out.println("3-Eliminar consecionaria");
                    int opcion = lea.nextInt();
                    switch(opcion){
                        case 1:
                            Concesionaria nueva = crearConcesionaria(listaConcesionarias, new Concesionaria(), 1);
                            listaConcesionarias.add(nueva);
                            break;
                        case 2:
                            int op2 = -1;
                            do{
                                System.out.println("Que concesionaria desea modificar:");
                                int list = 1;
                                for (Concesionaria con : listaConcesionarias) {
                                    System.out.println("Concesionaria " + list);
                                    list++;
                                    System.out.println(con);
                                    System.out.println("");
                                }
                                System.out.println("Ingrese opcion:");
                                op2 = lea.nextInt() - 1;
                            }while(op2 < 0 && op2 > listaConcesionarias.size() - 1);
                            crearConcesionaria(listaConcesionarias, listaConcesionarias.get(op2), 2);
                            break;
                        case 3:
                            do{
                                System.out.println("Que concesionaria desea eliminar:");
                                int list = 1;
                                for (Concesionaria con : listaConcesionarias) {
                                    System.out.println("Concesionaria " + list);
                                    list++;
                                    System.out.println(con);
                                    System.out.println("");
                                }
                                System.out.println("Ingrese opcion:");
                                op2 = lea.nextInt() - 1;
                            }while(op2 < 0 && op2 > listaConcesionarias.size() - 1);
                            
                            listaConcesionarias.remove(op2);
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (op != 4);

    }

    public static Concesionaria crearConcesionaria(ArrayList<Concesionaria> lista, Concesionaria c, int op) {

        String test;
        /**
         * Ingresar nombre
         */
        if (op == 2) {
            System.out.println("Nombre anterior: " + c.getNombre());
            System.out.println("Ingrese nuevo nombre(n para dejar igual):");
        } else {
            System.out.println("Ingrese nombre:");
        }
        //lea.next();
        //lea.nextLine();

        String nombre = lea.next();
        if (op == 2 && nombre.equals("n") || nombre.equals("N")) {
            nombre = c.getNombre();
        }

        /**
         * Atributo id
         */
        int id = -1;
        do {
            if (op == 2) {
                System.out.println("id anterior: " + c.getId());
                System.out.println("Ingrese nuevo id(n para dejar igual):");

            } else {
                System.out.println("Ingrese id:");
            }
            test = lea.next();

            if (op == 2 && test.equals("n") || test.equals("N")) {
                id = c.getId();
                break;
            }

            int error = 0;
            if (checkInt(test)) {
                if (Integer.parseInt(test) > 0) {
                    int a = Integer.parseInt(test);
                    for (Concesionaria con : lista) {
                        if (con.getId() == a && !con.equals(c)) {
                            error++;
                        }
                    }

                } else {
                    error++;
                }
            } else {
                error++;
            }

            if (error > 0) {
                System.out.println("El valor es repetido / no es valido");
            } else {
                id = Integer.parseInt(test);
            }
        } while (id == -1);

        //Ingrese direccion:
        if (op == 2) {
            System.out.println("Direccion anterior: " + c.getDireccion());
            System.out.println("Ingrese nuevo direccion(n para dejar igual):");
        } else {
            System.out.println("Ingrese direccion:");
        }
        //lea.next();
        //lea.nextLine();
        
        String direccion = lea.next();
        if(op == 2 && (direccion.equals("N") || direccion.equals("n"))){
            
        }
        /**
         * salida
         */
        double saldo = -1;
        do {
            if (op == 2) {
                saldo = c.getSaldo();
                break;

            }
            System.out.println("Ingrese saldo:");
            test = lea.next();

            int error = 0;
            if (checkDouble(test)) {
                if (Double.parseDouble(test) > 0) {

                    saldo = Double.parseDouble(test);
                } else {
                    error++;
                }
            } else {
                error++;
            }

            if (error > 0) {
                System.out.println("Ingrese valor valido");
            } else {

            }
        } while (saldo == -1);

        /**
         * salida
         */
        c.setNombre(nombre);
        c.setDireccion(direccion);
        c.setId(id);
        c.setSaldo(saldo);
        return c;

    }

    public static boolean checkInt(String par) {
        try {
            Integer.parseInt(par);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean checkDouble(String par) {
        try {
            Double.parseDouble(par);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
