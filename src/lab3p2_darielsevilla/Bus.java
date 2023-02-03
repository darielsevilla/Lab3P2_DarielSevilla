/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_darielsevilla;

import java.awt.Color;

/**
 *
 * @author HP
 */
public class Bus extends Vehiculo{
    private int pasajeros;
    private String tipo;
    private int capacidad;

    public Bus() {
        super();
    }

    public Bus(int pasajeros, String tipo, int capacidad) {
        this.pasajeros = pasajeros;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public Bus(int pasajeros, String tipo, int capacidad, Color color, String marca, String modelo, int year, double precio) {
        super(color, marca, modelo, year, precio, 4);
        this.pasajeros = pasajeros;
        this.tipo = tipo;
        this.capacidad = capacidad;
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Bus{" + "\npasajeros=" + pasajeros + "\ntipo=" + tipo + "\ncapacidad=" + capacidad + '}';
    }
    
    
    
    
}
