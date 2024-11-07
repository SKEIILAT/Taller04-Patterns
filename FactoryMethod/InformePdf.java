package factorymethod;

/**
 *
 * @author USUARIO
 */
public class InformePdf implements Informe {
    
    @Override
    public void crearInforme(){
        System.out.println("Creando informe en formato pdf...");
    }
    
    @Override
    public void visualizarInforme(){
        System.out.println("Visualizando informe en formato pdf...");
    }
}
