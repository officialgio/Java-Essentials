package ClassesAndObjects;

public enum IphoneModel {
    IPHONE_7_PLUS("Iphone 7+"),
    IPHONE_7("Iphone 7"),
    IPHONE_X("Iphone X"),
    IPHONE_13("Iphone 13");

    private String modelStr;

    // Consider the enum as a string using a constructor
    IphoneModel(String model) {
        this.modelStr = model;
    }

    public String getModelStr() {
        return modelStr;
    }
}
