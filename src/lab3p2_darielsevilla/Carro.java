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
public class Carro extends Vehiculo{
    private int puertas;
    private String motor;
    private double velocidad;

    public Carro() {
       super(); 
    }

    public Carro(int puertas, String motor, double velocidad) {
        this.puertas = puertas;
        this.motor = motor;
        this.velocidad = velocidad;
    }

    public Carro(int puertas, String motor, double velocidad, Color color, String marca, String modelo, int year, double precio) {
        super(color, marca, modelo, year, precio, 4);
        this.puertas = puertas;
        this.motor = motor;
        this.velocidad = velocidad;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Carro{" + "\npuertas=" + puertas + "\nmotor=" + motor + "\nvelocidad=" + velocidad + '}';
    }
    
    
    
    
    
}
