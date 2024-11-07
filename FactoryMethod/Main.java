package factorymethod;

/**
 *
 * @author USUARIO
 */
public class Main {
    
    public static void main(String[] args) {
        CreatorInforme creator;
        creator = new ConcreteCreatorPdf();
        Informe informe = creator.factoryMethod();
        informe.crearInforme();
        informe.visualizarInforme();
        
    }
}
