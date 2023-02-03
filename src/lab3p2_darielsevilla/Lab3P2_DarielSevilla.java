package lab3p2_darielsevilla;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        ArrayList<Cliente> clientes = new ArrayList();

        int op = 0;
        do {
            System.out.println("Ingrese opcion:");
            System.out.println("1-CRUD Concesionaria");
            System.out.println("2-CRUD Clientes");
            System.out.println("3-CRUD Vehiculos");
            System.out.println("4- Salida");
            op = lea.nextInt();

            switch (op) {
                case 1:
                    System.out.println("1-crear consecionaria");
                    System.out.println("2-Modificar");
                    System.out.println("3-Eliminar consecionaria");
                    int opcion = lea.nextInt();
                    switch (opcion) {
                        case 1:
                            Concesionaria nueva = crearConcesionaria(listaConcesionarias, new Concesionaria(), 1);
                            listaConcesionarias.add(nueva);
                            break;
                        case 2:
                            int op2 = -1;
                            do {
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
                            } while (op2 < 0 && op2 > listaConcesionarias.size() - 1);
                            crearConcesionaria(listaConcesionarias, listaConcesionarias.get(op2), 2);
                            break;
                        case 3:
                            do {
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
                            } while (op2 < 0 && op2 > listaConcesionarias.size() - 1);

                            listaConcesionarias.remove(op2);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Que opcion desea:");
                    System.out.println("1- Agregar cliente");
                    System.out.println("2- Eliminar cliente");
                    System.out.println("Ingrese opcion:");
                    opcion = lea.nextInt();
                    
                    switch(opcion){
                        case 1:
                            Cliente cliente = new Cliente();
                            cliente = crearCliente(clientes, cliente);
                            clientes.add(cliente);
                            break;
                        case 2:
                            int op2 = -1;
                            do {
                                System.out.println("Que cliente desea eliminar:");
                                int list = 1;
                                for (Cliente con : clientes) {
                                    System.out.println("Cliente " + list);
                                    list++;
                                    System.out.println(con);
                                    System.out.println("");
                                }
                                System.out.println("Ingrese opcion:");
                                op2 = lea.nextInt() - 1;
                            } while (op2 < 0 && op2 > clientes.size() - 1);

                            clientes.remove(op2);
                            break;
                    }
                    
                    break;
                case 3:
                    if(listaConcesionarias.size() != 0){
                        System.out.println("Que opcion desea:");
                        System.out.println("1-Agregar vehiculo");
                        System.out.println("2-Modificar vehiculo");
                        int x = lea.nextInt();
                        
                        switch(x){
                            case 1:
                                crearVehiculo(listaConcesionarias);
                                break;
                        }
                       
                    
                    }else{
                        System.out.println("No hay concesionarias");
                    }
                    break;
            }
        } while (op != 4);

    }

    public static Concesionaria crearConcesionaria(ArrayList<Concesionaria> lista, Concesionaria c, int op) {

        String test;
        /**
         * Ingresar nombre
         */
        String nombre;
        if (op == 2) {
            nombre = c.getNombre();

        } else {
            System.out.println("Ingrese nombre:");
            lea.nextLine();
            nombre = lea.nextLine();
        }
        //lea.next();
        //lea.nextLine();

        /**
         * Atributo id
         */
        int id = -1;
        do {
            if (op == 2) {
                id = c.getId();
                break;

            } else {
                System.out.println("Ingrese id:");
            }
            test = lea.next();

            

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
            System.out.println("Ingrese nueva direccion(n para dejar igual):");
        } else {
            System.out.println("Ingrese direccion:");
        }
        //lea.next();
        //lea.nextLine();

        String direccion = lea.next();
        if (op == 2 && (direccion.equals("N") || direccion.equals("n"))) {

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

    public static Cliente crearCliente(ArrayList<Cliente> lista, Cliente c) {

        String test;
        /**
         * Ingresar nombre
         */
        String nombre;

        System.out.println("Ingrese nombre:");
        lea.nextLine();
        nombre = lea.nextLine();

        //lea.next();
        //lea.nextLine();
        /**
         * Atributo id
         */
        int id = -1;
        do {
            
            System.out.println("Ingrese id: ");  
            test = lea.next();

            

            int error = 0;
            if (checkInt(test)) {
                if (Integer.parseInt(test) > 0) {
                    int a = Integer.parseInt(test);
                    for (Cliente con : lista) {
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
        
        
        //lea.next();
        //lea.nextLine();
        
        
        /**
         * salida
         */
        double saldo = -1;
        do {
            
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
        
        c.setId(id);
        c.setSaldo(saldo);
        return c;

    }
    
    public static void crearVehiculo(ArrayList<Concesionaria> list) {
        
        String test;
        /**
         * Atributos cadena
         */
        System.out.println("Ingrese color:");
        
        String color = lea.next();
        
        System.out.println("Ingrese marca:");
        
        String marca = lea.next();
        
        System.out.println("Ingrese modelo:");
        
        String modelo = lea.next();
        
        System.out.println("Ingrese año de creacion:");
        
        int year = lea.nextInt();
        
        System.out.println("Ingrese precio:");
        
        double precio = lea.nextDouble();
        
        
        

        /**
         * Atributo(s) int
         */
        int llantas = -1;
        do {
            System.out.println("Ingrese llantas(2 o 4):");
            test = lea.next();

            int error = 0;
            if (checkInt(test)) {
                
                llantas = Integer.parseInt(test);
               
            } else {
                error++;
            }
            
            if (error > 0){
                System.out.println("Ingrese valor valido");
            }
        } while (llantas != 2 && llantas != 4);

        if(llantas == 4){
            int op3 = 0;
            do{
                System.out.println("Que desea crear?");
                System.out.println("1- Carro");
                System.out.println("2- Bus");
                System.out.println("3- Camion");
                System.out.println("Ingrese opcion");
                op3 = lea.nextInt();
            }while(op3 < 1 || op3 > 3);
            
            switch(op3){
                case 1: {
                    Carro carro = crearCarro(new Carro(), 1);
                    carro.setLlantas(llantas);
                    carro.setMarca(marca);
                    carro.setModelo(modelo);
                    carro.setYear(year);
                    carro.setPrecio(precio);
                    carro.setColor(color);
                    int op = 0;
                    do{
                        System.out.println("A que concesionaria desea agregarlo:");
                        int i = 1;
                        for (Concesionaria concesionaria : list) {
                            System.out.println("Consecionaria " + i);
                            System.out.println(concesionaria);
                            System.out.println("");
                            i++;
                        }
                        System.out.println("Ingrese opcion:");
                        op = lea.nextInt() - 1;
                    }while(op < 0 && op > list.size()-1);
                    
                    list.get(op).getVehiculos().add(carro);
      
                }
                case 2:
                    break;
                case 3:
                    break;
                    
            }
        }

        
        
       
    }
    
    public static Carro crearCarro(Carro c, int op) {
       
        String test;
       
        
        /**
         * Atributo(s) int
         */
        int puertas = -1;
        do {
            if(op == 2){
                System.out.println("num de puertas anterior: " + c.getPuertas());
                System.out.println("Ingrese nuevo numero de puertas(n para dejar igual):");
                
            }else{
               System.out.println("Ingrese numero de puertas:"); 
            }
            test = lea.next();
            
            if(op == 2 && test.equals("n") || test.equals("N")){
                puertas = c.getPuertas();
                break;
            }   

            int error = 0;
            if (checkInt(test)) {
                if(Integer.parseInt(test) > 0){
                    puertas = Integer.parseInt(test);
                }else{ 
                    error++;
                }
            } else {
                error++;
            }
            
            if (error > 0){
                System.out.println("Ingrese valor valido");
            }
        } while (puertas == -1);

        if(op == 2){
            System.out.println("Motor anterior: " + c.getMotor());
            System.out.println("Ingrese nuevo motor(n para dejar igual):");
        }else{
            System.out.println("Ingrese motor:");
        }
        //lea.next();
        //lea.nextLine();
        String motor = lea.next();
        if(op == 2 && motor.equals("n") || motor.equals("N")){
           motor = c.getMotor();
        }
        /**
         * Atributo(s) char
         */
        

        /**
         * Objeto compuesto
         */
        //Object compuesto = newObject();
        
        /**
         * Atributo(s) double
         */
        double velocidad = -1;
        do {
            if(op == 2){
                System.out.println("Velocidad anterior: " + c.getVelocidad());
                System.out.println("Ingrese nuevo velocidad(n para dejar igual): ");
            }
            System.out.println("Ingrese velocidad:");
            test = lea.next();
            
            if(op == 2 && (test.equals("n") || test.equals("N"))){
               velocidad = c.getVelocidad();
               break;
            }

            int error = 0;
            if (checkDouble(test)) {
                //if(Integer.parseInt(test) > 0){
                velocidad = Double.parseDouble(test);
                //else{ error ++}
            } else {
                error++;
            }
            
            if (error > 0){
                System.out.println("Ingrese valor valido");
            }
        } while (velocidad == -1);

        /**
         * salida
         */
        c.setVelocidad(velocidad);
        c.setModelo(motor);
        c.setPuertas(puertas);
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
