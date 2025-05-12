package model;


import java.io.Serializable;

public class CoffeeAnswer implements Serializable {
    private static final long serialVersionUID = 1L;

    private String scene;        
    private String flavor;       
    private String temperature;  

    public CoffeeAnswer() {}

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
