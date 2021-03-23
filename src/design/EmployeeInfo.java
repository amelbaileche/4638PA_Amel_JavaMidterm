package design;

import org.bson.io.BsonOutput;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeInfo extends AbEmployee implements Employee {
    static String companyName="Children's Hospital of Philadelphia";
    private static double salary;
    private static double bonus;
    private static double numYearEmployment;
    int employeeId;
    String department;
    private int id;
    private String benefit;
    private int wage;
    String emailAddress;
    int numOfHours;
    /*
       This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.

    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        -COMPOSITION
        - Use all kind of keywords (super, this, static, final, etc)
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */

    /*
     * Make sure to declare and use static, non-static & final fields
     */



    /*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */

    /*
     You must have/use multiple constructors
     */
public EmployeeInfo(){}

    public EmployeeInfo(int id, int salary) {
    this.employeeId = id;
    this.salary = salary;
    }

    public EmployeeInfo(String name, int id) {
    this.name = name;
    this.id = id;
//        name = "Stacy Rangold";
//        String companyName = "Children's Hospital of Philadelphia";
//        int numOfYearsWorking = 5 ;
//        System.out.println( name + " has been working for the " + companyName + "the last " + numOfYearsWorking + "years");





    }



    /*
     You need to implement the logic of this method as such:
        It should calculate Employee bonus based on salary and performance.
        It should return the total yearly bonus.
            Example: 10% of salary for best performance, 8% of salary for average performance and so on.
            You can set arbitrary number for performance, so you probably need to send 2 arguments.
     *
     */
    public  void vacation(){
        System.out.println("I have a 30 days payed vacation");
    }
    public int getNumberOfhours(int numOfHours ){
        System.out.println(" I worked 40 hours this week");
        return numOfHours;
    }
    public static int calculateEmployeeBonus(int numberOfYearsWithCompany) {
        int total = 0;
        return total;
    }
    public void fmla (){
        System.out.println( " The employee has 6 weeks of Family Leave of Absence ");
    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *
     */

    public static int calculateEmployeePension() {

        double result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
        int startDate=Integer.parseInt(joiningDate);
        int nowDate=Integer.parseInt(todaysDate);
        numYearEmployment=nowDate-startDate;
        if (numYearEmployment > 3) {
            result = (salary * 0.20);
        } else if (numYearEmployment == 2) {
            result = (salary * 0.10);
        } else if (numYearEmployment == 1) {
            result =(salary * 0.05);
        } else if (numYearEmployment == 0) {
            result = 0;

        }
        return (int) result;

    }

        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        // Calculate pension



    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }

    private static class DateConversion {

        public DateConversion(Months months) {
        }


        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public int findNumYearDifference(LocalDate startDate, LocalDate endDate) {
             int difference =0;
             return difference;

        }
            public int calculateNumOfYearsWorked() {
                int dif = 0;



            try {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter start year in format (example 2021): ");
                int year = scanner.nextInt();
                System.out.print("Enter start month in format (example 3): ");
                int month = scanner.nextInt();
                System.out.print("Enter start day in format (25): ");
                int day = scanner.nextInt();
                System.out.print("Enter end year in format (example 2021): ");
                int endYear = scanner.nextInt();
                System.out.print("Enter end month in format (5): ");
                int endMonth = scanner.nextInt();
                System.out.print("Enter end day in format (4): ");
                int endDay = scanner.nextInt();

                LocalDate startDate = LocalDate.of(year, month, day);
                LocalDate endDate = LocalDate.of(endYear, endMonth, endDay);
                dif = findNumYearDifference(startDate, endDate);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return dif;
        }


    }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }


