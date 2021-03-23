package design;

public abstract class AbEmployee implements Employee {
    String name;
    String address;
    int numberOfHours;
    private int ssn;
    private static double salary;

    String DepName = "departmentName";
    String hospitality = "Hospitality";



    public AbEmployee(){

    }


    public void AbEmployee(String name, int numberOfHours){
        this.name = name;
        this.numberOfHours = numberOfHours;
    }





    public AbEmployee(String name) {
            this.name = name;}



    public AbEmployee (String name, String address) {
                this.name = name;
                this.address = address;
            }

    public AbEmployee(String name, String address, int numberOfHours) {
                      this.name = name;
                    this.address = address;
                    this.numberOfHours = numberOfHours;
                }

                public int isFullTimeEmployee (int numberOfHours){
                this.numberOfHours= numberOfHours;

                return numberOfHours;

    }
        }









