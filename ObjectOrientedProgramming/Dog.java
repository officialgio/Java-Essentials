package ObjectOrientedProgramming;

/**
 * Inheritance
 */

public class Dog implements AnimalInterface{
    private String breed;
    private String name;

    public Dog(String name, String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof ");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
