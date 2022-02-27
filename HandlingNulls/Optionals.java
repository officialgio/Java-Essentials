package HandlingNulls;

import java.util.Optional;
public class Optionals {
    public static void main(String[] args) {
        String brand = "ww";
        String theBrand = Optional.ofNullable(brand)
                .map(String::toUpperCase)
                .orElseGet(() -> {
            return "Samsung";
        });

        System.out.println(theBrand);
    }
}
