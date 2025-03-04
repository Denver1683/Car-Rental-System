
package carrentalsystem;

public class CarRent {
    private String brand;
    private String model;
    private String color;
    private String id;
    private int fees;
    
    public CarRent(String brand, String model, String color, String id, int fees) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.id = id;
        this.fees = fees;
    }
    
        public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public int getFees() {
        return fees;
    }
}

    