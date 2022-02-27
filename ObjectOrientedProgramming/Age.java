package ObjectOrientedProgramming;

public enum Age {
    FIVE(5),
    TEN(10),
    FIFTEEN(15);

    private int age;

    Age(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


