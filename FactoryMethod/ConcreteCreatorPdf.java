package factorymethod;

/**
 *
 * @author USUARIO
 */
public class ConcreteCreatorPdf extends CreatorInforme{
    
    @Override
    public Informe factoryMethod(){
        return new InformePdf();
    }
}
