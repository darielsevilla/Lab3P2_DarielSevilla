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
public class Motocicleta extends Vehiculo{
    private String desplazamiento;
    private boolean electrica;

    public Motocicleta() {
        super();
    }

    

    public Motocicleta(String desplazamiento, boolean electrica, String color, String marca, String modelo, int year, double precio) {
        super(color, marca, modelo, year, precio, 2);
        this.desplazamiento = desplazamiento;
        this.electrica = electrica;
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        String elec = "";
        if(electrica){
            elec = "Es electrica";
        }else{
            elec = "No es electrica";
        }
        return super.toString() + "Motocicleta{" + "\ndesplazamiento=" + desplazamiento + "\nelectrica=" + elec + '}';
    }
    
    
    
    
    
    
}
