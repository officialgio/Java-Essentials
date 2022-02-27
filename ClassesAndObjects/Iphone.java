package ClassesAndObjects;

public class Iphone {
    // private = encapsulation
    // Properties
    private IphoneModel model;
    private double price;
    private boolean isWaterResistant;

    //default constructor
    public Iphone() {}

    //second constructor
    public Iphone(IphoneModel model,
                  double price,
                  boolean isWaterResistant) {
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    /**
     * You can use the "this" keyword to invoke other constructors as well
     * you can set constructors with default values by
     * reusing a constructor "model" inside a constructor
     * @param model
     */
    public Iphone(IphoneModel model) {
        this(model, 0.0, false); // default values
        this.model = model;
    }

    public Iphone(IphoneModel model, double price) {
        this(model, price, false); // default values
        this.model = model;
        this.price = price;
    }

    public IphoneModel getModel() {
        return model;
    }

    public void setModel(IphoneModel model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        this.isWaterResistant = waterResistant;
    }

    // representation of the object
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}
