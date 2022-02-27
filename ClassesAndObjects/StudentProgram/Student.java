package ClassesAndObjects.StudentProgram;

public class Student {
    private Gender gender;
    private int studentID;
    private int studentEnrolledYear;
    //default
    public Student () {}

    // constructor (normal)
    public Student(Gender gender, int studentID, int studentEnrolledYear) {
        this.gender = gender;
        this.studentID = studentID;
        this.studentEnrolledYear = studentEnrolledYear;
    }
    //2nd constructor
    public Student(Gender gender, int studentID) {
        this(gender, studentID, 0); // inner constructor
        this.gender = gender;
        this.studentEnrolledYear = studentEnrolledYear;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;

        if (studentID < 0)
            throw new IllegalArgumentException("Not valid, please enter a valid ID");
    }

    public int getStudentEnrolledYear() {
        return studentEnrolledYear;
    }

    public void setStudentEnrolledYear(int studentEnrolledYear) {
        this.studentEnrolledYear = studentEnrolledYear;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gender=" + gender +
                ", studentID=" + studentID +
                ", studentEnrolledYear=" + studentEnrolledYear +
                '}';
    }
}
