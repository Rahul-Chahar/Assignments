package Inheritance_Polymorphism_Abstract_Interface_Lambda.Vivek_Furnitures_Polymorphism;

abstract class Bero {
    protected String beroType;
    protected String beroColour;
    protected double price;

    public Bero(String beroType, String beroColour) {
        this.beroType = beroType;
        this.beroColour = beroColour;
    }

    public String getBeroType() {
        return beroType;
    }

    public void setBeroType(String beroType) {
        this.beroType = beroType;
    }

    public String getBeroColour() {
        return beroColour;
    }

    public void setBeroColour(String beroColour) {
        this.beroColour = beroColour;
    }

    public abstract void calculatePrice();
}
