/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author henry
 */
public class ReportGenerator {
    private static ReportGenerator instance;
    private String format;
    private String styleOptions;
    private String content;
    
    private ReportGenerator(){
        this.format = "PDF";
        this.styleOptions = "Estilo por defecto";
        this.content = "Contenido por defecto";
    }
    
    public static ReportGenerator getInstance(){
        if(instance == null){
            instance = new ReportGenerator();
        }
        return instance;
    }
    
    public void generateReport(String format, String content){
        this.format = format;
        this.content = content;
        System.out.println("Reporte generado en formato: " + format);
    }
    
    public void customizeStyle(String styleOptions){
        this.styleOptions = styleOptions;
        System.out.println("Reporte personalizado con estilo: " + styleOptions);
    }
    
    public void sendReport(NotificationType notificationType){
        notificationType.send(content);
    }
}
