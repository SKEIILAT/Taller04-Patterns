package factorymethod;

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
}
