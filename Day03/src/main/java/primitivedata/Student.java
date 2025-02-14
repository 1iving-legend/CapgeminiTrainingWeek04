package primitivedata;

public class Student {
    private int rollNumber;
    private String name;
    private double gpa;

    // Constructor
    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }

    // Getters for student details
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Method to display student details
    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa;
    }
}
