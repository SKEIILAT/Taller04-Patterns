/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author USUARIO
 */
public abstract class InformeFeature implements Informe {
    protected Informe informe;

    public InformeFeature(Informe informe) {
        this.informe = informe;
    }
    
    @Override
    public void agregarCaracteristica(){
        this.informe.agregarCaracteristica();
    }
    
}
