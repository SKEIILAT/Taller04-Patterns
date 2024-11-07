package com.mycompany.facade;

public class CustomizationOptions {
    private String style;
    private String font;
    private String color;

    public CustomizationOptions(String style, String font, String color) {
        this.style = style;
        this.font = font;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Estilo: " + style + ", Fuente: " + font + ", Color: " + color;
    }
}
