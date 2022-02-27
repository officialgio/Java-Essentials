package ObjectOrientedProgramming;

public class Tiger extends Animal {
    private String name;
    public Tiger(String name, Age age, String color, boolean isPredator) {
        super(name, age, color, isPredator);
    }

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void makeSound() {

    }
}
