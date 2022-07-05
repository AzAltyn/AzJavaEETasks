package az.bitlab.bd;

public class HrPersons {
    private String name;
    private String surname;
    private String department;
    private int salary;

    public HrPersons(){
        this.name = "No Name";
        this.surname = "No Surname";
        this.department = "No Department";
        this.salary = 0;
    }
    public HrPersons(String name, String surname,String department,int salary){
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
