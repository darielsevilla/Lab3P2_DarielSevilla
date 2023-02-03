/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_darielsevilla;

/**
 *
 * @author HP
 */
public class Camion extends Vehiculo{
    private int volumen;
    private int altura;
    private boolean retroexcavadora;

    public Camion() {
        super();
    }

    public Camion(int volumen, int altura, boolean retroexcavadora, String color, String marca, String modelo, int year, double precio, int llantas) {
        super(color, marca, modelo, year, precio, llantas);
        this.volumen = volumen;
        this.altura = altura;
        this.retroexcavadora = retroexcavadora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetroexcavadora() {
        return retroexcavadora;
    }

    public void setRetroexcavadora(boolean retroexcavadora) {
        this.retroexcavadora = retroexcavadora;
    }

    @Override
    public String toString() {
        return "Camion{" + "\nvolumen=" + volumen + "\naltura=" + altura + "\nretroexcavadora=" + retroexcavadora + '}';
    }
    
    
    
}
