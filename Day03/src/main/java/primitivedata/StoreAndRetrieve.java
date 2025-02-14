package primitivedata;


import java.io.DataInputStream;
import java.io.Serializable;
import java.io.*;

public class StoreAndRetrieve {
    private static final String FILE_NAME = "student_data.dat";

    public static void main(String[] args) {
        // Create some student data
        Student student1 = new Student(101, "Alice", 3.85);
        Student student2 = new Student(102, "Bob", 3.70);
        Student student3 = new Student(103, "Charlie", 3.90);

        // Store student data in binary file
        storeStudentData(student1);
        storeStudentData(student2);
        storeStudentData(student3);

        // Retrieve and display student data
        retrieveStudentData();
    }

    // Method to store student data in a binary file
    public static void storeStudentData(Student student) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME, true))) {
            dos.writeInt(student.getRollNumber());
            dos.writeUTF(student.getName());
            dos.writeDouble(student.getGpa());
            System.out.println("Student data stored: " + student);
        } catch (IOException e) {
            System.out.println("An error occurred while storing student data: " + e.getMessage());
        }
    }

    // Method to retrieve student data from the binary file
    public static void retrieveStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                Student student = new Student(rollNumber, name, gpa);
                System.out.println("Student data retrieved: " + student);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while retrieving student data: " + e.getMessage());
        }
    }
}

