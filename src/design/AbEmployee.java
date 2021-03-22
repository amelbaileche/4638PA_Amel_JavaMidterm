package design;

public abstract class AbEmployee implements Employee {
    String name = "departmentName";
    String departments = "Departments";
    String hospitality = "Hospitality";
    String languageServices = "sales";
    String informationTechnology = "IT";

    public void AbEmployee(String departments) {
        this.departments = departments;
    }

    public void AbsEmployee(String name, String hospitality) {
        this.name = name;
        this.hospitality = hospitality;
    }

    public AbEmployee(String name, String languageServices, String informationTechnology) {
        this.name = name;
        this.languageServices = languageServices;
        this.informationTechnology = informationTechnology;


        }
    public AbEmployee(){

    }
}








