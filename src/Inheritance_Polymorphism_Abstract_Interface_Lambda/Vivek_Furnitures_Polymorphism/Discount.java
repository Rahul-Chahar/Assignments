package Inheritance_Polymorphism_Abstract_Interface_Lambda.Vivek_Furnitures_Polymorphism;

class Discount {
    public double calculateDiscount(Bero bObj) {
        if (bObj instanceof SteelBero) {
            return (bObj.price * 10) / 100;
        } else if (bObj instanceof WoodenBero) {
            return (bObj.price * 15) / 100;
        }
        return 0;
    }
}
