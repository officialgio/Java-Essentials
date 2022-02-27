package Project;


public class Student {
    private int number, classNumber;
    private String name;
    private Gender gender;
    private Date birthday;
    private Phone phone;

    //constructor
    public Student(int number, int classNumber, String name, Gender gender, Date birthday, Phone phone) {
        this.number = number;
        this.classNumber = classNumber;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
    }

    public void studentInfo() {
        System.out.println("Student Number  :" + number);
        System.out.println("Student Name    :" + name);
        System.out.println("Stundent Birthday   :" + birthday);
        System.out.println("Student Gender  :" + gender);
        System.out.println("Student class   :" + classNumber);
        System.out.println("Student Phone   :" + phone);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
