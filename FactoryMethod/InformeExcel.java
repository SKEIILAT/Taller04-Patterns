package factorymethod;

/**
 *
 * @author USUARIO
 */
public class InformeExcel implements Informe {
    
    @Override
    public void crearInforme(){
        System.out.println("Creando informe en formato excel...");
    }
    
    @Override
    public void visualizarInforme(){
        System.out.println("Visualizando informe en formato excel...");
    }
}
