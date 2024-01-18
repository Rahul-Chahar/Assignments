package Annotations.MobiHub;

public class UserInterface {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter Model");
        String model = sc.nextLine();

        System.out.println("Enter display (in inches)");
        double display = sc.nextDouble();

        System.out.println("Enter Price");
        double price = sc.nextDouble();

        IphoneSeries iphone = new IphoneSeries(model, display, price);

        System.out.println("iPhone Details");
        System.out.println("Model : " + iphone.getModel());
        System.out.println("Display in (inches): " + iphone.getDisplay());
        System.out.println("Price : " + iphone.getPrice());
        System.out.println("Amount to be paid : " + iphone.calculateDiscount());
        System.out.println("OS : " + iphone.os());
        System.out.println("Version : " + iphone.version());
    }
}