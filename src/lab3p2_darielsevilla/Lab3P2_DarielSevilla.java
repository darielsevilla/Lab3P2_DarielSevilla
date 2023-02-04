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
            System.out.println("4- compra y venta");
            System.out.println("5- Salida");
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

                    switch (opcion) {
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
                    if (listaConcesionarias.size() != 0) {
                        System.out.println("Que opcion desea:");
                        System.out.println("1-Agregar vehiculo");
                        System.out.println("2-Modificar vehiculo");
                        System.out.println("3-Eliminar vehiculo");
                        int x = lea.nextInt();

                        switch (x) {
                            case 1:
                                crearVehiculo(listaConcesionarias);
                                break;
                            case 2:
                                
                                int pos = -1;
                                do {
                                    System.out.println("De que consecionaria es el vehiculo a modificar:");
                                    int i = 1;
                                    for (Concesionaria concesionaria : listaConcesionarias) {
                                        System.out.println("Consecionaria " + i);
                                        System.out.println(concesionaria);
                                        System.out.println("");
                                        i++;
                                    }
                                    System.out.println("Ingrese opcion:");
                                    pos = lea.nextInt() - 1;
                                } while (pos < 0 && pos > listaConcesionarias.size() - 1);

                                if (listaConcesionarias.get(pos).getVehiculos().size() != 0) {
                                    int pos2 = -1;
                                    do {
                                        int i = 1;
                                        for (Vehiculo z : listaConcesionarias.get(pos).getVehiculos()) {
                                            System.out.println("Vehiculo " + i);
                                            System.out.println(z);
                                            System.out.println("");
                                            System.out.println("");
                                            i++;
                                        }
                                        System.out.println("Ingrese posicion: ");
                                        pos2 = lea.nextInt() - 1;
                                    } while (pos2 < 0 || pos2 > (listaConcesionarias.get(pos).getVehiculos().size() - 1));

                                    Vehiculo temp = listaConcesionarias.get(pos).getVehiculos().get(pos2);
                                    if (temp instanceof Carro) {
                                        crearCarro((Carro) temp, 2);
                                    } else if (temp instanceof Motocicleta) {
                                        crearMoto((Motocicleta) temp, 2);
                                    } else if (temp instanceof Bicicleta) {
                                        crearBicicleta((Bicicleta) temp, 2);
                                    } else if (temp instanceof Camion) {
                                        crearCamion((Camion) temp, 2);
                                    } else {
                                        int cap = 0;
                                        do {
                                            System.out.println("Capacidad actual: " + ((Bus) temp).getPasajeros());
                                            System.out.println("Ingrese nueva capacidad maxima (n para salir); ");
                                            String nuevo = lea.next().toLowerCase();
                                            if (nuevo.equals("n")) {
                                                cap = ((Bus) temp).getPasajeros();
                                                break;
                                            }

                                            if (checkInt(nuevo)) {
                                                cap = Integer.parseInt(nuevo);
                                            } else {
                                                System.out.println("Ingrese un valor valido");
                                            }

                                        } while (cap <= 0);
                                    }
                                } else {
                                    System.out.println("No hay vehiculos en esta concesionaria");

                                }
                                break;
                            case 3:
                                pos = 0;
                                do {
                                    System.out.println("De que consecionaria es el vehiculo a eliminar:");
                                    int i = 1;
                                    for (Concesionaria concesionaria : listaConcesionarias) {
                                        System.out.println("Consecionaria " + i);
                                        System.out.println(concesionaria);
                                        System.out.println("");
                                        i++;
                                    }
                                    System.out.println("Ingrese opcion:");
                                    pos = lea.nextInt() - 1;
                                } while (pos < 0 && pos > listaConcesionarias.size() - 1);

                                listaConcesionarias.get(pos).getVehiculos();
                                if (listaConcesionarias.get(pos).getVehiculos().size() != 0) {
                                    int pos2 = -1;
                                    do {
                                        int i = 1;
                                        for (Vehiculo z : listaConcesionarias.get(pos).getVehiculos()) {
                                            System.out.println("Vehiculo " + i);
                                            System.out.println(z);
                                            System.out.println("");
                                            System.out.println("");
                                            i++;
                                        }
                                        System.out.println("Ingrese vehiculo a eliminar: ");
                                        pos2 = lea.nextInt() - 1;
                                    } while (pos2 < 0 || pos2 > (listaConcesionarias.get(pos).getVehiculos().size() - 1));
                                    listaConcesionarias.get(pos).getVehiculos().remove(pos2);
                                } else {
                                    System.out.println("No hay vehiculos");
                                }
                                break;

                        }

                    } else {
                        System.out.println("No hay concesionarias");
                    }
                    break;
                case 4:
                    if(listaConcesionarias.size() != 0 && clientes.size() != 0){
                    int op4 = 0;

                    do {
                        System.out.println("1-Comprar vehiculo");
                        System.out.println("2-Vender vehiculo");
                        op4 = lea.nextInt();
                    } while (op4 != 1 && op4 != 2);
                    switch (op4) {
                        case 1:
                            int c = -1;
                            int b = -1;
                            do {
                                System.out.println("Concesionarias:");
                                int i = 1;
                                for (Concesionaria con : listaConcesionarias) {
                                    System.out.println("Concesionaria " + con);
                                    i++;
                                    System.out.println(con);
                                }
                                System.out.println("Ingrese concesionaria:");
                                c = lea.nextInt() - 1;

                            } while (c < 0 || c > listaConcesionarias.size() - 1);

                            Concesionaria esta = listaConcesionarias.get(c);

                            if (esta.getVehiculos().size() == 0) {
                                System.out.println("Esta concesionaria no tiene vehiculos");
                            } else {
                                System.out.println("Vehiculos de esta concesionaria:");
                                int cont = 1;
                                for (Vehiculo v : esta.getVehiculos()) {
                                    System.out.println("Vehiculo " + cont);
                                    cont++;
                                    System.out.println(v);
                                    System.out.println("");
                                }
                                System.out.println("Que vehiculo desea comprar?");
                                int compra = lea.nextInt() - 1;
                                if (compra < 0 || compra > esta.getVehiculos().size() - 1) {
                                    System.out.println("Este no es un valor valido");
                                } else {
                                    c = -1;
                                    do {
                                        System.out.println("Clientes:");
                                        int i = 1;
                                        for (Cliente cliente : clientes) {
                                            System.out.println("Cliente " + i);
                                            i++;
                                            System.out.println(cliente);
                                        }
                                        System.out.println("Ingrese cliente:");
                                        c = lea.nextInt();
                                        c--;

                                    } while (c < 0 || c > clientes.size() - 1);
                                    Cliente actual = clientes.get(c);
                                    double pFinal = esta.getVehiculos().get(compra).getPrecio() + (esta.getVehiculos().get(compra).getPrecio() * 0.075);
                                    System.out.println("precio inicial:" + esta.getVehiculos().get(compra).getPrecio());
                                    System.out.println("precio final:" + pFinal);
                                    System.out.println("Desea comprar? (s para comprar):");
                                    String x = lea.next();

                                    //verificacion
                                    if (x.equals("s") || x.equals("S")) {
                                        if (actual.getSaldo() >= pFinal) {
                                            actual.setSaldo(actual.getSaldo() - pFinal);
                                            actual.getVehiculos().add(esta.getVehiculos().get(compra));
                                            esta.setSaldo(esta.getSaldo() + pFinal);
                                            esta.getVehiculos().remove(compra);
                                        } else {
                                            System.out.println("No tiene dinero para esta compra");
                                        }
                                    }
                                }

                            }

                            Cliente actual = clientes.get(c);

                            break;
                        case 2:
                            if (clientes.size() == 0) {
                                System.out.println("No hay clientes");
                                break;
                            }
                            c = -1;
                            do {
                                System.out.println("Clientes:");
                                int i = 1;
                                for (Cliente cliente : clientes) {
                                    System.out.println("Cliente " + i);
                                    i++;
                                    System.out.println(cliente);
                                }
                                System.out.println("Ingrese cliente:");
                                c = lea.nextInt();
                                c--;

                            } while (c < 0 || c > clientes.size() - 1);
                            actual = clientes.get(c);

                            if (actual.getVehiculos().size() == 0) {
                                System.out.println("El cliente no tiene vehiculos");
                                break;
                            }

                            System.out.println("Vehiculos de este cliente:");
                            int cont = 1;
                            for (Vehiculo v : actual.getVehiculos()) {
                                System.out.println("Vehiculo " + cont);
                                cont++;
                                System.out.println(v);
                                System.out.println("");
                            }
                            System.out.println("Que vehiculo desea vender?");
                            int compra = lea.nextInt() - 1;

                            if (compra < 0 || compra > actual.getVehiculos().size() - 1) {
                                System.out.println("Este no es un valor valido");
                                break;
                            }
                            
                            int d = -1;
                            do {
                                System.out.println("Concesionarias:");
                                int i = 1;
                                for (Concesionaria con : listaConcesionarias) {
                                    System.out.println("Concesionaria " + con);
                                    i++;
                                    System.out.println(con);
                                }
                                System.out.println("Ingrese concesionaria en la que lo vendera:");
                                d = lea.nextInt() - 1;

                            } while (d < 0 || d > listaConcesionarias.size() - 1);

                            esta = listaConcesionarias.get(d);
                            
                            if(esta.getSaldo() >= actual.getVehiculos().get(compra).getPrecio()){
                                esta.setSaldo(esta.getSaldo() - actual.getVehiculos().get(compra).getPrecio());
                                esta.getVehiculos().add(actual.getVehiculos().get(compra));
                                actual.setSaldo(actual.getSaldo() + actual.getVehiculos().get(compra).getPrecio());
                                actual.getVehiculos().remove(actual.getVehiculos().get(compra));
                                
                            }else{
                                System.out.println("La concesionaria no tiene saldo para realizar esta compra");
                            }
                            break;
                        }
                    }else{
                        System.out.println("No hay concesionarias y/o clientes");
                    }
                    break;
            }
        } while (op != 5);

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

            if (error > 0) {
                System.out.println("Ingrese valor valido");
            }
        } while (llantas != 2 && llantas != 4);

        if (llantas == 4) {
            int op3 = 0;
            do {
                System.out.println("Que desea crear?");
                System.out.println("1- Carro");
                System.out.println("2- Bus");
                System.out.println("3- Camion");
                System.out.println("Ingrese opcion");
                op3 = lea.nextInt();
            } while (op3 < 1 || op3 > 3);

            switch (op3) {
                case 1:
                    Carro carro = crearCarro(new Carro(), 1);
                    carro.setLlantas(llantas);
                    carro.setMarca(marca);
                    carro.setModelo(modelo);
                    carro.setYear(year);
                    carro.setPrecio(precio);
                    carro.setColor(color);
                    int op = 0;
                    do {
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
                    } while (op < 0 && op > list.size() - 1);

                    list.get(op).getVehiculos().add(carro);
                    break;

                case 2:
                    System.out.println("Ingrese capacidad de pasajeros: ");
                    int capacidad = lea.nextInt();
                    Bus bus = new Bus(capacidad, color, marca, modelo, year, precio);

                    op = 0;
                    do {
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
                    } while (op < 0 && op > list.size() - 1);

                    list.get(op).getVehiculos().add(bus);
                    break;
                case 3:
                    Camion camion = crearCamion(new Camion(), 1);
                    camion.setLlantas(llantas);
                    camion.setMarca(marca);
                    camion.setModelo(modelo);
                    camion.setYear(year);
                    camion.setPrecio(precio);
                    camion.setColor(color);

                    op = 0;
                    do {
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
                    } while (op < 0 && op > list.size() - 1);

                    list.get(op).getVehiculos().add(camion);
                    break;

            }
        } else {
            int op3 = 0;
            do {
                System.out.println("Que desea crear?");
                System.out.println("1- Motocicleta");
                System.out.println("2- Bicicleta");
                System.out.println("Ingrese opcion");
                op3 = lea.nextInt();

                switch (op3) {
                    case 1:
                        Motocicleta moto = crearMoto(new Motocicleta(), 1);
                        moto.setLlantas(llantas);
                        moto.setMarca(marca);
                        moto.setModelo(modelo);
                        moto.setYear(year);
                        moto.setPrecio(precio);
                        moto.setColor(color);

                        int op = 0;
                        do {
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
                        } while (op < 0 && op > list.size() - 1);

                        list.get(op).getVehiculos().add(moto);
                        break;
                    case 2:
                        Bicicleta bici = crearBicicleta(new Bicicleta(), 1);
                        bici.setLlantas(llantas);
                        bici.setMarca(marca);
                        bici.setModelo(modelo);
                        bici.setYear(year);
                        bici.setPrecio(precio);
                        bici.setColor(color);

                        op = 0;
                        do {
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
                        } while (op < 0 && op > list.size() - 1);

                        list.get(op).getVehiculos().add(bici);
                        break;
                }
            } while (op3 < 1 || op3 > 3);
        }

    }

    public static Carro crearCarro(Carro c, int op) {

        String test;

        /**
         * Atributo(s) int
         */
        int puertas = -1;
        do {
            if (op == 2) {
                System.out.println("num de puertas anterior: " + c.getPuertas());
                System.out.println("Ingrese nuevo numero de puertas(n para dejar igual):");

            } else {
                System.out.println("Ingrese numero de puertas:");
            }
            test = lea.next();

            if (op == 2 && test.equals("n") || test.equals("N")) {
                puertas = c.getPuertas();
                break;
            }

            int error = 0;
            if (checkInt(test)) {
                if (Integer.parseInt(test) > 0) {
                    puertas = Integer.parseInt(test);
                } else {
                    error++;
                }
            } else {
                error++;
            }

            if (error > 0) {
                System.out.println("Ingrese valor valido");
            }
        } while (puertas == -1);

        if (op == 2) {
            System.out.println("Motor anterior: " + c.getMotor());
            System.out.println("Ingrese nuevo motor(n para dejar igual):");
        } else {
            System.out.println("Ingrese motor:");
        }
        //lea.next();
        //lea.nextLine();
        String motor = lea.next();
        if (op == 2 && motor.equals("n") || motor.equals("N")) {
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
            if (op == 2) {
                System.out.println("Velocidad anterior: " + c.getVelocidad());
                System.out.println("Ingrese nuevo velocidad(n para dejar igual): ");
            }
            System.out.println("Ingrese velocidad:");
            test = lea.next();

            if (op == 2 && (test.equals("n") || test.equals("N"))) {
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

            if (error > 0) {
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

    public static Camion crearCamion(Camion c, int op) {

        String test;

        /**
         * Atributo(s) int
         */
        int volumen = -1;
        do {
            if (op == 2) {
                System.out.println("volumen anterior: " + c.getVolumen());
                System.out.println("Ingrese nuevo volumen(n para dejar igual):");

            } else {
                System.out.println("Ingrese volumen:");
            }
            test = lea.next();

            if (op == 2 && test.equals("n") || test.equals("N")) {
                volumen = c.getVolumen();
                break;
            }

            int error = 0;
            if (checkInt(test)) {
                if (Integer.parseInt(test) > 0) {
                    volumen = Integer.parseInt(test);
                } else {
                    error++;
                }
            } else {
                error++;
            }

            if (error > 0) {
                System.out.println("Ingrese valor valido");
            }
        } while (volumen == -1);

        int altura = -1;
        do {
            if (op == 2) {
                System.out.println("altura anterior: " + c.getAltura());
                System.out.println("Ingrese nueva altura(n para dejar igual):");

            } else {
                System.out.println("Ingrese altura:");
            }
            test = lea.next();

            if (op == 2 && test.equals("n") || test.equals("N")) {
                altura = c.getAltura();
                break;
            }

            int error = 0;
            if (checkInt(test)) {
                if (Integer.parseInt(test) > 0) {
                    altura = Integer.parseInt(test);
                } else {
                    error++;
                }
            } else {
                error++;
            }

            if (error > 0) {
                System.out.println("Ingrese valor valido");
            }
        } while (altura == -1);

        char bool = 'a';
        boolean tru = false;
        do {
            System.out.println("tiene o no retroexcavadora? (s/n):");
            bool = lea.next().toLowerCase().charAt(0);

        } while (bool != 's' && bool != 'n');

        if (bool == 's') {
            tru = true;
        } else {
            tru = false;
        }
        c.setAltura(altura);
        c.setRetroexcavadora(tru);
        c.setVolumen(volumen);
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

    public static Bicicleta crearBicicleta(Bicicleta c, int op) {

        String test;

        /**
         * Atributo(s) int
         */
        int radio = -1;
        do {
            if (op == 2) {
                System.out.println("radio anterior: " + c.getRadio());
                System.out.println("Ingrese nuevo radio(n para dejar igual):");

            } else {
                System.out.println("Ingrese radio de rueda:");
            }
            test = lea.next();

            if (op == 2 && test.equals("n") || test.equals("N")) {
                radio = c.getRadio();
                break;
            }

            int error = 0;
            if (checkInt(test)) {
                if (Integer.parseInt(test) > 0) {
                    radio = Integer.parseInt(test);
                } else {
                    error++;
                }
            } else {
                error++;
            }

            if (error > 0) {
                System.out.println("Ingrese valor valido");
            }
        } while (radio == -1);

        if (op == 2) {
            System.out.println("Descripcion anterior: " + c.getDescripcion());
            System.out.println("Ingrese nueva descripcion(n para dejar igual):");
        } else {
            System.out.println("Ingrese Descripcion:");
        }
        //lea.next();
        //lea.nextLine();
        String des = lea.next();
        if (op == 2 && des.equals("n") || des.equals("N")) {
            des = c.getDescripcion();
        }

        char bool = 'a';
        boolean tru = false;
        do {
            System.out.println("es o no Bmx? (s/n):");
            bool = lea.next().toLowerCase().charAt(0);

        } while (bool != 's' && bool != 'n');

        if (bool == 's') {
            tru = true;
        } else {
            tru = false;
        }
        /**
         * salida
         */
        c.setBmx(tru);
        c.setDescripcion(des);
        c.setRadio(radio);
        return c;

    }

    public static Motocicleta crearMoto(Motocicleta c, int op) {

        String test;

        /**
         * Atributo(s) int
         */
        if (op == 2) {
            System.out.println("Desplazamiento anterior: " + c.getDesplazamiento());
            System.out.println("Ingrese nueva desplazamiento(n para dejar igual):");
        } else {
            System.out.println("Ingrese desplazamiento:");
        }
        //lea.next();
        //lea.nextLine();
        String des = lea.next();
        if (op == 2 && des.equals("n") || des.equals("N")) {
            des = c.getDesplazamiento();
        }

        char bool = 'a';
        boolean tru = false;
        do {
            System.out.println("es o no electrica? (s/n):");
            bool = lea.next().toLowerCase().charAt(0);

        } while (bool != 's' && bool != 'n');

        if (bool == 's') {
            tru = true;
        } else {
            tru = false;
        }
        /**
         * salida
         */
        c.setElectrica(tru);
        c.setDesplazamiento(des);

        return c;

    }

}
