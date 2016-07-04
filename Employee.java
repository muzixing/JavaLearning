
/**
 * This is a Employee class.
 *
 *
 * Created by muzi on 6/19/16.
 */


public class Employee {
    String name;
    Integer age;
    String designation;
    Double salary;

    //constructor
    public Employee(String name){
        this.name = name;
    }

    public void empAge(int empAge){
        age = empAge;
    }

    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    public void empSalary(double empSalary){
            salary = empSalary;
    }

    /*print information */
    public void printEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.printf("Salary: %s%n", salary);
    }
}
