/**
 * Created by muzi on 7/2/16.
 */

public class EmployeeTest {
    public static void main(String agrs[]){
        /*construct two objects.*/
        Employee empOne  = new Employee("Li Cheng");
        Employee empTwo  = new Employee("Distance");

        empOne.empAge(24);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(42);
        empOne.empDesignation("Chief Software Engineer");
        empOne.empSalary(9000);
        empOne.printEmployee();
    }
}
