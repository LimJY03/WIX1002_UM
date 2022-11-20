package L9Q2_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.LinkedHashMap;

public class Lecturer extends PersonProfile {

    protected String courseCode;
    protected LinkedHashMap<String, String> courseName = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> session = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> semester = new LinkedHashMap<>();
    protected LinkedHashMap<String, Double> creditHours = new LinkedHashMap<>();
    protected LinkedHashMap<String, Integer> studentCount = new LinkedHashMap<>();

    // Constructor
    public Lecturer(String name, char gender, String dob, String fileName) {

        super(name, gender, dob);
        try {
            BufferedReader file = new BufferedReader(new FileReader("./L9Q2_3/src/" + fileName));
            while ((this.courseCode = file.readLine()) != null) {
                this.courseName.put(this.courseCode, file.readLine());
                this.session.put(this.courseCode, Integer.parseInt(file.readLine()));
                this.semester.put(this.courseCode, Integer.parseInt(file.readLine()));
                this.creditHours.put(this.courseCode, Double.parseDouble(file.readLine()));
                this.studentCount.put(this.courseCode, Integer.parseInt(file.readLine()));
            }
            file.close();
        }
        catch (FileNotFoundException e) { System.out.println("File Not Found!"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e); }
    }

    // Methods
    private void updateCreditHours() {
        for (String code: this.creditHours.keySet()) {
            double credits = this.creditHours.get(code);
            int count = this.studentCount.get(code);
            this.creditHours.put(code, credits * (count >= 150 ? 3 : count >= 100 ? 2 : count >= 50 ? 1.5 : 1));
        }
    }

    public void displayDetails() {
        this.displayProfile();
        this.updateCreditHours();
        System.out.println("\nCourse Profile:\n===");
        for (String code: this.courseName.keySet()) {
            System.out.printf("%s %s (Semester %d Session %d): %.2f Credit Hours for %d students.\n",
                    code, this.courseName.get(code), this.semester.get(code), this.session.get(code), this.creditHours.get(code), this.studentCount.get(code)
            );
        }
        System.out.println();
    }
}