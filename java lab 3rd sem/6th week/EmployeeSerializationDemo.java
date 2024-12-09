import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{name='" + name + "', dateOfBirth=" + dateOfBirth + ", department='" + department + "', designation='" + designation + "', salary=" + salary + "}";
    }
}

public class EmployeeSerializationDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", new Date(), "Engineering", "Software Engineer", 75000);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data"))) {
            out.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data"))) {
            Employee deserializedEmployee = (Employee) in.readObject();
            System.out.println(deserializedEmployee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
