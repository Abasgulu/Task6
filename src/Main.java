public class Car {
    public String model;
    public String brand;
    public int year;
    public double price;
    public String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model=model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }


    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
