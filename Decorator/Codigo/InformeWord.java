/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author USUARIO
 */
public class InformeWord implements Informe {
    
    @Override
    public void crearInforme(){
        System.out.println("Creando informe en formato word...");
    }
    
    @Override
    public void visualizarInforme(){
        System.out.println("Visualizando informe en formato word...");
    }
    
    @Override
    public void agregarCaracteristica(){
        System.out.println("Agregando caracteristica...");
    }
}