package Project;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student(114,
//                202,
//                "Giovanny",
//                Gender.MALE, 22, "312222");

        Student student2 = new Student(1,
                2222,
                "Student2",
                Gender.MALE,
                new Date(12,05,2002),
                new Phone("1","1", "888-888-888"));


        listStudents();

    }

    public static Student[] students = new Student[5];
    public static int studentIndex = 0;

    public static void listStudents() {
        for (int i = 0 ; i < studentIndex; i++) {
            System.out.println("-------------------------");
            students[i].studentInfo();
            System.out.println("-------------------------");
        }
    }
}
