public class Employee {
    private String surnameEmployee;
    private String nameEmployee;
    private String patronymicEmployee;
    private int department;
    private int wages;
    private int id;
    static int counter = 1;

    public Employee(String surnameEmployee, String nameEmployee, String patronymicEmployee,int department, int wages) {
        id = counter++;

        this.surnameEmployee = surnameEmployee;
        this.nameEmployee = nameEmployee;
        this.patronymicEmployee = patronymicEmployee;
        this.department = department;
        this.wages = wages;
    }

    public String getSurnameEmployee() {
        return surnameEmployee;
    }

    public String getFullName() {
        return surnameEmployee + nameEmployee + patronymicEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public String getPatronymicEmployee() {
        return patronymicEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public int getWages() {
        return wages;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int newDepartment) {
        this.department = newDepartment;
    }

    public void setWages(int newWages) {
        this.wages = newWages;
    }

    public String toString() {
        return "iD сотрудника " + id + ". ФИО: " + surnameEmployee + " " + nameEmployee + " " + patronymicEmployee + ". Отдел номер " + department + ", зарплата сотрудника " + wages;
    }
}
