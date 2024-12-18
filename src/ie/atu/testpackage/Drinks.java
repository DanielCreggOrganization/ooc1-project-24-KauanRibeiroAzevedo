package ie.atu.testpackage;

public class Drinks {
    private int serialNumber;
    private String brand;
    private float price;
    private boolean isSold;

    // Constructor
    public Drinks(int serialNumber, String brand, float price, boolean isSold) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.price = price;
        this.isSold = isSold;
    }

    // Getters
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public String getBrand() {
        return this.brand;
    }

    public float getPrice() {
        return this.price;
    }

    public boolean getIsSold() {
        return this.isSold;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setIsSold(boolean isSold) {
        this.isSold = isSold;
    }
}