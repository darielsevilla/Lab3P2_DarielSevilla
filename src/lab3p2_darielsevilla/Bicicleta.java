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
public class Bicicleta extends Vehiculo{
    private String descripcion;
    private int radio;
    private boolean bmx;

    public Bicicleta() {
        super();
    }

    public Bicicleta(String descripcion, int radio, boolean bmx, String color, String marca, String modelo, int year, double precio) {
        super(color, marca, modelo, year, precio, 2);
        this.descripcion = descripcion;
        this.radio = radio;
        this.bmx = bmx;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public boolean isBmx() {
        return bmx;
    }

    public void setBmx(boolean bmx) {
        this.bmx = bmx;
    }

    @Override
    public String toString() {
        String tip;
        if(bmx){
            tip = "bmx";
        }else{
            tip = "De calle";
        }
        return super.toString() + "Bicicleta{" + "\ndescripcion=" + descripcion + "\nradio=" + radio + "\nTipo=" + tip+ "}\n";
    }
    
    
    
}
