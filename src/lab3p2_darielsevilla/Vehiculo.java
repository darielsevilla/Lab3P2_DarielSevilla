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
    protected String color;
    protected String marca;
    protected String modelo;
    protected int year;
    protected double precio;
    protected int llantas;

    public Vehiculo() {
        
    }

    public Vehiculo(String color, String marca, String modelo, int year, double precio, int llantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

   
    @Override
    public String toString() {
        return "Vehiculo{" + "\ncolor=" + color + "\nmarca=" + marca + "\nmodelo=" + modelo + "\nyear=" + year + "\nprecio=" + precio + "\nllantas=" + llantas + "}\n";
    }
    
    
    
    
    
}
