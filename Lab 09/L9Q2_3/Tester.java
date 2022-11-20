package L9Q2_3;

public class Tester {
    
    public static void main(String[] args) {

        // Test Constructor
        Student s1 = new Student("Ali", 'M', "01-01-2022", "course.txt");
        Lecturer l1 = new Lecturer("Abu", 'F', "01-01-1990", "lecturer.txt");

        // Test Methods
        s1.displayDetails();
        l1.displayDetails();
    }
}