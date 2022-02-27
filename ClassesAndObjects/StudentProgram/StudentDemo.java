package ClassesAndObjects.StudentProgram;

/**
 * Applied everything I learned in ClassesAndObjects on a Student Program Demo
 *
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student(Gender.MALE, -3, 2025);

        Student student2 = new Student(Gender.FEMALE, 444);




        System.out.println(student1);
    }
}
