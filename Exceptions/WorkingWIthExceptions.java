package Exceptions;

public class WorkingWIthExceptions {
    public static void main(String[] args) {
        String brand = null;

        try {
            System.out.println(brand.length());
        } catch (Exception e) {
            System.out.println("brand was null!" + e);
        }
    }
}
