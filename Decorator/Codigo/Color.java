/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author USUARIO
 */
public class Color extends InformeFeature{

    public Color(Informe informe) {
        super(informe);
    }
    
    @Override
    public void agregarCaracteristica(){
        super.agregarCaracteristica();
        System.out.println("Agregando color...");
    }
    
    @Override
    public void visualizarInforme(){
        System.out.println("Visualizando informe ..");
    }
    
    @Override
    public void crearInforme(){
        System.out.println("Creando informe...");
    }
}
