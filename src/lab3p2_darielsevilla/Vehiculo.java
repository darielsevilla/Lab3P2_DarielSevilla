/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_darielsevilla;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Vehiculo {
    protected Color color;
    protected String marca;
    protected String modelo;
    protected int year;
    protected double precio;
    protected int llantas;

    public Vehiculo() {
        
    }

    public Vehiculo(Color color, String marca, String modelo, int year, double precio, int llantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.llantas = llantas;
    }

   
    @Override
    public String toString() {
        return "Vehiculo{" + "\ncolor=" + color + "\nmarca=" + marca + "\nmodelo=" + modelo + "\nyear=" + year + "\nprecio=" + precio + "\nllantas=" + llantas + '}';
    }
    
    
    
    
    
}
