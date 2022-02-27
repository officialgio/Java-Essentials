package ClassesAndObjects;

public class Classes {
    public static void main(String[] args) {
        Iphone iphone13 = new Iphone(IphoneModel.IPHONE_7_PLUS,
                150.00);

        Iphone iPhoneX = new Iphone(IphoneModel.IPHONE_X,
                799.99);

        System.out.println(iphone13.getModel()); // IPHONE_7_PLUS
        System.out.println(iphone13.getModel().getModelStr()); // Iphone 7+

//        System.out.println("Iphone 13");
//        iphone13.setModel("13");
//        iphone13.setPrice(999.99);
//        iphone13.setWaterResistant(false);

        //Don't need it because toString
//        System.out.println(iphone13.getModel());
//        System.out.println(iphone13.getPrice());
//        System.out.println(iphone13.isWaterResistant());

        System.out.println(iphone13); // Iphone{model='IPHONE_7_PLUS', price=150.0, isWaterResistant=false}

    }
}
