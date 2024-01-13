package Inheritance_Polymorphism_Abstract_Interface_Lambda.Vivek_Furnitures_Polymorphism;

class WoodenBero extends Bero {
    private String woodType;

    public WoodenBero(String beroType, String beroColour, String woodType) {
        super(beroType, beroColour);
        this.woodType = woodType;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    @Override
    public void calculatePrice() {
        switch (woodType) {
            case "Ply Wood":
                price = 15000;
                break;
            case "Teak Wood":
                price = 12000;
                break;
            case "Engineered Wood":
                price = 10000;
                break;
        }
    }
}
