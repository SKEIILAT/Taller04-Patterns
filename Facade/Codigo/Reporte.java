package com.mycompany.facade;

public abstract class Reporte {
    public void applyCustomization(CustomizationOptions options) {
        System.out.println("Aplicando personalización: " + options);
    }
}