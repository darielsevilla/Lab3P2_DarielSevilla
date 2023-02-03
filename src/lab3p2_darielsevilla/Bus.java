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
  

    public Bus() {
        super();
    }

   

    public Bus(int pasajeros, String color, String marca, String modelo, int year, double precio) {
        super(color, marca, modelo, year, precio, 4);
        this.pasajeros = pasajeros;
        
        if(pasajeros <= 50){
            tipo = true;
        }else{
            tipo = false;
        }
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

   
    @Override
    public String toString() {
        String tip;
        if(tipo){
            tip = "Rapidito";
        }else{
            tip = "De ruta";
        }
        return super.toString() + "Bus{" + "\npasajeros=" + pasajeros + "\ntipo=" + tip + '}';
    }
    
    
    
    
}
