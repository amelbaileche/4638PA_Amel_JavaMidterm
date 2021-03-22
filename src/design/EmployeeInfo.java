//package design;
//
//import org.bson.io.BsonOutput;
//
//import java.util.Scanner;
//
//public class EmployeeInfo extends AbEmployee implements Employee {
//
//
//    /*
//       This class should implement the Employee interface. You can do that by directly implementing it, however you must
//        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
//        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
//        go to FortuneEmployee class to apply all the fields and attributes.
//
//    Important: YOU MUST USE:
//        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
//        -COMPOSITION
//        - Use all kind of keywords (super, this, static, final, etc)
//        - Implement nested class below (DateConversion)
//        - Use Exception Handling
//     */
//
//    /*
//     * Make sure to declare and use static, non-static & final fields
//     */
//    static String companyName;
//
//    /*
//     You must implement the logic for below 2 methods and
//        following 2 methods are prototype as well for other methods need to be design,
//        as you will come up with the new ideas.
//     */
//
//    /*
//     You must have/use multiple constructors
//     */
//
//
//    public EmployeeInfo(int employeeId) {
//    String employeeBadgeColor= "blue badge";
//     String employeeName ="Laura Davis";
//     String employeeShift = "Morning shift";
//        System.out.println(employeeName + " works" + employeeShift + " and she has a "  + employeeBadgeColor);
//
//
//    }
//
//    public EmployeeInfo(String name, int employeeId) {
//        name = "Stacy Rangold";
//        String companyName = "Children's Hospital of Philadelphia";
//        int numOfYearsWorking = 5 ;
//        System.out.println( name + " has been working for the " + companyName + "the last " + numOfYearsWorking + "years");
//
//
//
//
//
//    }
//
//    /*
//     You need to implement the logic of this method as such:
//        It should calculate Employee bonus based on salary and performance.
//        It should return the total yearly bonus.
//            Example: 10% of salary for best performance, 8% of salary for average performance and so on.
//            You can set arbitrary number for performance, so you probably need to send 2 arguments.
//     *
//     */
//    public static int calculateEmployeeBonus(int numberOfYearsWithCompany) {
//        int total = 0;
//        return total;
//    }
//    public void fmla (){
//        System.out.println( " The employee has 6 weeks of Family Leave of Absence ");
//    }
//
//    /*
//     You need to implement the logic of this method as such:
//        It should calculate Employee pension based on salary and numbers of years with the company.
//        It should return the total pension amount.
//            Example: Employee will receive 5% of salary as pension for every year they are with the company
//     *
//     */
//    public static int calculateEmployeePension() {
//        int total = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter start date in format (example: May,2015): ");
//        String joiningDate = sc.nextLine();
//        System.out.println("Please enter today's date in format (example: August,2017): ");
//        String todaysDate = sc.nextLine();
//        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
//        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
//
//
//        public static double calculateEmployeeBonus(double salary, int numYearEmployment) {
//            double bonus=0;
//            if (numYearEmployment>= 10) {
//                bonus = salary* 0.10;
//                System.out.println("I'm getting a bonus of : "+bonus);
//            } else if (numYearEmployment >= 5 &&(numYearEmployment<10)) {
//                bonus = salary*00.5;
//                System.out.println("I'm getting a bonus of : "+bonus);
//            } else {
//                bonus = 0;
//                System.out.println("Bonus is not applied");
//            }
//
//            return bonus;
//        }
//
//        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
//        // Calculate pension
//
//        public static double calculateEmployeePension() {
//            double result = 0;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Please enter start date in format (example: May,2015): ");
//            String joiningDate = sc.nextLine();
//            System.out.println("Please enter today's date in format (example: August,2017): ");
//            String todaysDate = sc.nextLine();
//            String convertedJoiningDate = DateConversion.convertDate(joiningDate);
//            String convertedTodaysDate = DateConversion.convertDate(todaysDate);
//            int startDate=Integer.parseInt(joiningDate);
//            int nowDate=Integer.parseInt(todaysDate);
//            numYearEmployment=nowDate-startDate;
//            if (numYearEmployment > 3) {
//                result = (salary * 0.20);
//            } else if (numYearEmployment == 2) {
//                result = (salary * 0.10);
//            } else if (numYearEmployment == 1) {
//                result =(salary * 0.05);
//            } else if (numYearEmployment == 0) {
//                result = 0;
//            }
//            return result;
//        }
//        @Override
//        public void assignDepartment() {
//    }
//
//
//
//    private static class DateConversion {
//
//        public DateConversion(Months months) {
//        }
//
//        public static String convertDate(String date) {
//            String[] extractMonth = date.split(",");
//            String givenMonth = extractMonth[0];
//            int monthDate = whichMonth(givenMonth);
//            String actualDate = monthDate + "/" + extractMonth[1];
//            return actualDate;
//        }
//
//        public static int whichMonth(String givenMonth) {
//
//            Months months = Months.valueOf(givenMonth);
//            int date = 0;
//            switch (months) {
//                case January:
//                    date = 1;
//                    break;
//                case February:
//                    date = 2;
//                    break;
//                case March:
//                    date = 3;
//                    break;
//                case April:
//                    date = 4;
//                    break;
//                case May:
//                    date = 5;
//                    break;
//                case June:
//                    date = 6;
//                    break;
//                case July:
//                    date = 1;
//                    break;
//                case August:
//                    date = 1;
//                    break;
//                case September:
//                    date = 1;
//                    break;
//                case October:
//                    date = 1;
//                    break;
//                case November:
//                    date = 1;
//                    break;
//                case December:
//                    date = 1;
//                    break;
//                default:
//                    date = 0;
//                    break;
//            }
//            return date;
//
//        }
//        public class  NestedClass {
//            public void currency(){
//                try{ System.out.println( "I am creating a nested class");
//
//                }catch( Exception e){
//
//                    e.printStackTrace();
//                }
//
//                }
//
//
//        }
//    }
//}
