package decorator;

/**
 *
 * @author USUARIO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Informe informe_con_fuente = new Fuente(new InformePdf());
        informe_con_fuente.agregarCaracteristica();
        Informe informe_con_fuente_y_estilo = new Fuente (new Estilo(new InformePdf()));
        informe_con_fuente_y_estilo.agregarCaracteristica();
    }
    
}
