package design;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main method where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes
     * <p>
     * Demonstrate as many methods as possible to use with proper business work flow.
     * Try to think like a Software Architect/Developer.
     * This application should provide basic employee information services
     * </p>
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     * </p>
     **/
    public static void main(String[] args) { // create an object showing methods pensions..

        // .
        EmployeeInfo employeeInfo = new EmployeeInfo();
        System.out.println(employeeInfo.isFullTimeEmployee(36));
        System.out.println(employeeInfo.getNumberOfhours(40));
        employeeInfo.vacation();

        EmployeeInfo.calculateEmployeePension();



    }


}



