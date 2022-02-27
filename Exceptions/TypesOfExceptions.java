package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


// simple way
//public static void main(String[] args) throws FileNotFoundException

public class TypesOfExceptions {
    public static void main(String[] args)  {
        // Checked Exceptions (compile time)
        try {
            FileInputStream inputStream =
                    new FileInputStream("src/example.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Uncheck Exceptions (not compile time)

        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException | NullPointerException | NumberFormatException e) { // if you don't know the exception include only "Exception"
            System.out.println("cannot divide number by zero");
        } finally {
            System.out.println("cleaning up...");
        }

        //performDivision(1, 0);
        //performSomething(1, 5);
        performDivisionTwo(10,0);


    }

    //Custom Exception
    static double performDivision(double a, double b ) {
        if (b == 0) {
            throw new MyException("cannot divide by zero");
        }
        return a / b;
    }

    // use constructor to throw new exception
    static class MyException extends RuntimeException{
        public MyException(String message) { // override method
            super(message);
        }
    }


    //Second way
    static class NotAble extends RuntimeException {
        public NotAble(String message) {
            super(message);
        }
    }

    static double performSomething(int a, int b) {
        if (b == 5) {
            throw new NotAble("B can't be 5!");
        }
        return a / b;
    }

    // third method (ehh)
    public static int performDivisionTwo(int a, int b) {
        try {
            return a + b;
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero!@");
        } finally {
            System.out.println("Please try again.");
        }
        return -1;
    }
}
