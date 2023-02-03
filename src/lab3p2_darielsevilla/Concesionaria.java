/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_darielsevilla;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Concesionaria {

    
    private String nombre;
    private int id;
    private String direccion;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes;
    private double saldo;

    public Concesionaria() {
    }
    
    public Concesionaria(String nombre, int id, String direccion, ArrayList<Vehiculo> vehiculos, ArrayList<Cliente> clientes, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.vehiculos = vehiculos;
        this.clientes = clientes;
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

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "\nnombre=" + nombre + "\nid=" + id + "\ndireccion=" + direccion + "\nvehiculos=" + vehiculos + "\nclientes=" + clientes + "\nsaldo=" + saldo + '}';
    }
    
    
    
    
    
    
}
