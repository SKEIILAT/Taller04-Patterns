package factorymethod;

/**
 *
 * @author USUARIO
 */
public class ConcreteCreatorExcel extends CreatorInforme{
    
    @Override
    public Informe factoryMethod(){
        return new InformeExcel();
    }
}
