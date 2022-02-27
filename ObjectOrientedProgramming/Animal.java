package ObjectOrientedProgramming;

/**
 * Animal is the abstract class
 */
abstract public class Animal {
    private String name;
    private String color;
    private boolean isPredator;
    private Age age;

    public Animal(String name, Age age, String color, boolean isPredator) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isPredator = isPredator;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // everyone needs to implement an abstract method for other sub-classes
    public abstract void makeSound();


    // update toString as you go
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", isPredator=" + isPredator +
                ", age=" + age +
                '}';
    }
}
