package object_output_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "Engineering", 75000));
        employees.add(new Employee(2, "Jane Smith", "Marketing", 68000));
        employees.add(new Employee(3, "Mike Johnson", "Finance", 72000));

        // Serialize the employee list
        serializeEmployeeList(employees);

        // Deserialize and display the employee list
        List<Employee> deserializedEmployees = deserializeEmployeeList();
        if (deserializedEmployees != null) {
            System.out.println("\nDeserialized Employee List:");
            for (Employee emp : deserializedEmployees) {
                System.out.println(emp);
            }
        }
    }

    public static void serializeEmployeeList(List<Employee> employee)
    {
        try {
            String file = "output.ser";
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(employee);
            System.out.println("Employee list serialized successfully.");
        } catch (IOException e) {
            System.out.println("Exception occured :"+e.getMessage());
        }

    }

    public  static List<Employee> deserializeEmployeeList()
    {
        try{
            String file= "output.ser";
            ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));
            return (List<Employee>) ois.readObject();

        } catch (Exception e) {
            System.out.println("Exception occured :"+ e.getMessage());
            return null;
        }
    }
}
