package Collections_Generics_and_Stream_API.Fresh_Farm_Streams;

class Carton {
    private String productName;
    private int quantity;
    private double productCost;

    public Carton(String productName, int quantity, double productCost) {
        this.productName = productName;
        this.quantity = quantity;
        this.productCost = productCost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }
}

