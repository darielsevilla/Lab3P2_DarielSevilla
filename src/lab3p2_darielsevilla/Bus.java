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
    private boolean tipo;
    private int capacidad;

    public Bus() {
        super();
    }

   

    public Bus(int pasajeros, boolean tipo, int capacidad, String color, String marca, String modelo, int year, double precio) {
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

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if(capacidad <= 50 && capacidad > 0){
            this.capacidad = capacidad;
        }
    }

    @Override
    public String toString() {
        String tip;
        if(tipo){
            tip = "Rapidito";
        }else{
            tip = "De ruta";
        }
        return super.toString() + "Bus{" + "\npasajeros=" + pasajeros + "\ntipo=" + tip + "\ncapacidad=" + capacidad + '}';
    }
    
    
    
    
}
