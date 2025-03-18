import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee1 {
    private String name;
    private int age;
    private double salary;

    public Employee1(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class javaexseven {
    private static List<Employee1> employees = new ArrayList<>();

    public static void main(String[] args) {
        employees.add(new Employee1("ramlal", 30, 70000));
        employees.add(new Employee1("ramukaka", 25, 50000));
        employees.add(new Employee1("rama", 35, 80000));
        employees.add(new Employee1("ramkali", 28, 60000));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Sort by Name");
            System.out.println("2. Sort by Age");
            System.out.println("3. Sort by Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Collections.sort(employees, Comparator.comparing(Employee1::getName));
                    System.out.println("Sorted by name:");
                    employees.forEach(System.out::println);
                    break;
                case 2:
                    Collections.sort(employees, Comparator.comparingInt(Employee1::getAge));
                    System.out.println("Sorted by age:");
                    employees.forEach(System.out::println);
                    break;
                case 3:
                    Collections.sort(employees, Comparator.comparingDouble(Employee1::getSalary));
                    System.out.println("Sorted by salary:");
                    employees.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
