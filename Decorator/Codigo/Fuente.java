/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author USUARIO
 */
public class Fuente extends InformeFeature{

    public Fuente(Informe informe) {
        super(informe);
    }
    
    @Override
    public void agregarCaracteristica(){
        super.agregarCaracteristica();
        System.out.println("Agregando fuente...");
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
