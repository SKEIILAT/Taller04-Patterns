package factorymethod;

/**
 *
 * @author USUARIO
 */
public class ConcreteCreatorWord extends CreatorInforme{
    
    @Override
    public Informe factoryMethod(){
        return new InformeWord();
    }
}
