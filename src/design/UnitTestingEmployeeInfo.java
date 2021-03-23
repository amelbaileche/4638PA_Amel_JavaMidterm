package design;

public class UnitTestingEmployeeInfo {

    public static void main(String[] args) {
        // Use this class to write unit tests for all user-defined methods that you have implemented in this package.


        EmployeeInfo e=new EmployeeInfo();
        System.out.println(e.isFullTimeEmployee(36));
        System.out.println(e.getNumberOfhours(40));
        System.out.println(e.isFullTimeEmployee(36));
        System.out.println(e.getNumberOfhours(40));
        e.vacation();
        EmployeeInfo.calculateEmployeePension();

    }
}




