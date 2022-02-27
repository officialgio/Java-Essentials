package ObjectOrientedProgramming;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal("bobby");
        AnimalInterface dog = new Dog("flex", "Bulldog");
        AnimalInterface cat = new Cat("rosie");

        dog.makeSound();
        cat.makeSound();

        Animal tiger = new Tiger("Giovanny", Age.FIFTEEN, "orange", true);
        Animal tiger2 = new Tiger("Giovanny");
        

        System.out.println(tiger);



    }
}
