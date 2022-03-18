import java.io.*;

public class EmployeeTest{
    public static void main(String[] args){
        Employee empOne = new Employee("RUNOOB1");
        Employee emptwo = new Employee("RUNOOB2");

        empOne.empAge(26);
        empOne.empDesignation("sb");
        empOne.empSalary(1000);
        empOne.printEmployee();
    }
}