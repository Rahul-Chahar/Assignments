package Annotations.MobiHub;


class IphoneSeries implements Type {
    private String model;
    private double display;
    private double price;

    // Constructors
    public IphoneSeries(String model, double display, double price) {
        this.model = model;
        this.display = display;
        this.price = price;
    }

    // Getter and setter methods
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to calculate discount
    public double calculateDiscount() {
        double discountPercentage = 0;

        // Determine discount percentage based on iPhone series and display size
        if ((getModel().equals("iPhoneSE") || getModel().equals("iPhone13"))
                && (getDisplay() >= 5.0 && getDisplay() <= 6.0)) {
            discountPercentage = 8;
        } else if ((getModel().equals("iPhoneSE") || getModel().equals("iPhone13"))
                && (getDisplay() > 6.0 && getDisplay() <= 7.0)) {
            discountPercentage = 12;
        } else if ((getModel().equals("iPhone13ProMax") || getModel().equals("iPhone13Pro"))
                && (getDisplay() >= 5.0 && getDisplay() <= 6.0)) {
            discountPercentage = 6;
        } else if ((getModel().equals("iPhone13ProMax") || getModel().equals("iPhone13Pro"))
                && (getDisplay() > 6.0 && getDisplay() <= 7.0)) {
            discountPercentage = 9;
        }

        // Calculate amount to be paid
        double amountToBePaid = getPrice() - (getPrice() * discountPercentage / 100);
        return amountToBePaid;
    }
}
