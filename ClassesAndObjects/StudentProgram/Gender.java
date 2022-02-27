package ClassesAndObjects.StudentProgram;

public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    private String genderStr;

    Gender(String gender) {
        this.genderStr = gender;
    }

    public String getGenderStr() {
        return genderStr;
    }
}




