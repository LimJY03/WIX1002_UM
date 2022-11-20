package L9Q2_3;

public class PersonProfile {

    protected final String NAME, DOB;
    protected final char GENDER;

    // Constructor
    public PersonProfile(String name, char gender, String dob) {
        this.NAME = name;
        this.GENDER = gender;
        this.DOB = dob;
    }

    // Method
    public void displayProfile() {
        System.out.printf("Name: %s\nGender: %s\nBirth: %s\n", this.NAME, this.GENDER, this.DOB);
    }
}