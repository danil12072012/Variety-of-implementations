import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EmploeeBook {
    private static final int SIZE = 10;

    private final Map<String, Employee> employees;

    public EmploeeBook() {

        employees = new HashMap<>();
    }
    private String getKey (Employee employee) {
        return employee.getNameEmployee() + " " + employee.getSurnameEmployee() + " " + employee.getPatronymicEmployee();
    }

    public void printFullInfo() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }

    public   int totalWages() {
        int sum = 0;
        for (Employee employee : employees.values()) {
            if (employee != null) {

                sum += employee.getWages();
            }
        }
        return sum;

    }

    public Employee findEmployeeWithMinWages() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : employees.values()) {
            if (Objects.nonNull(employee) && emp.getWages() < min) {
                min = emp.getWages();
                employee = emp;
            }
        }
        return employee;
    }

    public  Employee findEmployeeWithMaxWages() {
        int min = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : employees.values()) {
            if (Objects.nonNull(employee) && emp.getWages() > min) {
                min = emp.getWages();
                employee = emp;
            }
        }
        return employee;
    }

    public  double findAverageWages() {
        return totalWages()/(double)employees.size();
    }
    public  void printFullNameInfo() {
        for (Employee employee : employees.values()) {
            if (employee != null) {
                System.out.println(employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getPatronymicEmployee());
            }
        }
    }

    public  void indexWages(int percent) {
        double coeff = 1+ percent/100D;
        for (Employee employee : employees.values()) {
            if (Objects.nonNull(employee)) {
                employee.setWages((int) (employee.getWages() * coeff));

            }
        }
    }
    public  Employee findEmployeeWithMinWages(int department) {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : employees.values()) {
            if (Objects.nonNull(employee) && emp.getWages() < min && emp.getDepartment() == department) {
                min = emp.getWages();
                employee = emp;
            }
        }
        return employee;
    }
    public  Employee findEmployeeWithMaxWages(int department) {
        int min = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : employees.values()) {
            if (Objects.nonNull(employee) && emp.getWages() > min && emp.getDepartment() == department) {
                min = emp.getWages();
                employee = emp;
            }
        }
        return employee;
    }
    public  int totalWages(int dpartment) {
        int sum = 0;
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getDepartment() == dpartment) {
                sum += employee.getWages();
            }

        }
        return sum;

    }
    public  double findAverageWages(int department) {
        int count = 0;
        int sum = 0;
        for (Employee employee : employees.values()) {
            if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                count++;
                sum+= employee.getWages();
            }
        }
        if (count != 0) {
            return sum / (double) count;
        } else {
            return 0;
        }
    }
    public  void indexWages(int percent, int department) {
        double coeff = 1+ percent/100D;
        for (Employee employee : employees.values()) {
            if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                employee.setWages((int)(employee.getWages()* coeff));
            }
        }
    }
    public  void printFullNameInfo(int department) {
        System.out.println("Сотрудники отдела " + department);
        for (Employee employee : employees.values()) {
            if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                System.out.println("ID " + employee.getId() + " ФИО: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getPatronymicEmployee() + ", зарплата сотрудника " + employee.getWages());
            }
        }
    }

    public  void printEmploeeesWagsLessThen(int wages) {
        System.out.println("Сотрудники с зарплатой меньше " + wages + ":");
        for (Employee employee : employees.values()) {
            if (Objects.nonNull(employee) && employee.getWages() < wages) {
                System.out.println("ID " + employee.getId() + " ФИО: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getPatronymicEmployee() + ", зарплата сотрудника " + employee.getWages());
            }
        }
    }
    public  void printEmploeeesWagsMoreThen(int wages) {
        System.out.println("Сотрудники с зарплатой больше " + wages);
        for (Employee employee : employees.values()) {
            if (Objects.nonNull(employee) && employee.getWages() > wages) {
                System.out.println("ID " + employee.getId() + " ФИО: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getPatronymicEmployee() + ", зарплата сотрудника " + employee.getWages());
            }
        }
    }

    public void addEmploee (Employee employee) {
        employees.put(getKey(employee), employee);

    }
    public void addEmploee (String surnameEmployee, String nameEmployee, String patronymicEmployee,int department, int wages) {
        addEmploee(new Employee(surnameEmployee, nameEmployee, patronymicEmployee, department, wages));
    }

    public void removeEmploee (Employee employee) {
        employees.remove(getKey(employee));

    }
    public void removeEmploee (int id) {
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee employee = entry.getValue();
            String key = entry.getKey();
            if (employee.getId() == id) {
                employees.remove(key);
                break;
            }
        }

    }

    public void changeWages(Employee employee, int newWages) {
        String key = getKey(employee);
        if (employees.containsKey(key)) {
            employees.get(key).setWages(newWages);
        }
    }
    public void changeDepartment(Employee employee, int newDepartment) {
        String key = getKey(employee);
        if (employees.containsKey(key)) {
            employees.get(key).setDepartment(newDepartment);
        }

    }
    public void printEmployeesByDepartments() {
        for (int department = 1; department < 5; department++) {
            System.out.println("Сотрудники отдела " + department);
            for (Employee employee : employees.values()) {
                if (Objects.nonNull(employee) && employee.getDepartment() == department) {
                    System.out.println(employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " +
                            employee.getPatronymicEmployee());
                }
            }
        }
    }

}
