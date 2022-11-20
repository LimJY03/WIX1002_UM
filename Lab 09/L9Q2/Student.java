package L9Q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.LinkedHashMap;

public class Student extends PersonProfile {

    // Declaration
    protected String courseCode;
    protected LinkedHashMap<String, String> courseName = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> semester = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> session = new LinkedHashMap<>();
    protected LinkedHashMap<String, Double> mark = new LinkedHashMap<>();
    
    // Constructor
    public Student(String name, char gender, String dob, String fileName) {
        
        super(name, gender, dob);
        
        try {
            BufferedReader file = new BufferedReader(new FileReader("./L9Q2/src/" + fileName));

            while ((this.courseCode = file.readLine()) != null) {
                
                this.courseName.put(this.courseCode, file.readLine());
                this.semester.put(this.courseCode, Integer.parseInt(file.readLine()));
                this.session.put(this.courseCode, Integer.parseInt(file.readLine()));
                this.mark.put(this.courseCode, Double.parseDouble(file.readLine()));
            }

            file.close();
        }
        catch (FileNotFoundException e) { System.out.println("File Not Found!"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e); }
    }

    // Methods
    private String getGrade(double mark) {
        if (mark >= 85) { return "A"; }
        if (mark >= 75) { return "A-"; }
        if (mark >= 70) { return "B+"; }
        if (mark >= 65) { return "B"; }
        if (mark >= 60) { return "B-"; }
        if (mark >= 55) { return "C+"; }
        if (mark >= 45) { return "D"; }
        if (mark >= 35) { return "E"; }
        else { return "F"; }
    }

    public void displayDetails() {
        this.displayProfile();
        System.out.println("\nCourse Details:\n===");
        for (String code: this.courseName.keySet()) {
            System.out.printf("%s %s (Semester %d Session %d): Grade %s.\n", 
                code, this.courseName.get(code), this.semester.get(code), this.session.get(code), getGrade(this.mark.get(code))
            );
        }
    }
}