package main.java.week_6.assignment_problems;

public class CompanyEmployee {
    private String empName;
    private double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        CompanyEmployee emp1 = new CompanyEmployee("Divya", 65000.0);
        CompanyEmployee emp2 = new CompanyEmployee("Arjun", 50000.0);
        CompanyEmployee emp3 = new CompanyEmployee("Rohan", 55000.0);

        // Called directly through class name
        CompanyEmployee.printCompanyInfo();
    }
}
