public class Main {
    public static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EmploeeBook emploeeBook = new EmploeeBook();
        emploeeBook.addEmploee("Иванов", "Иван", "Иванович", 1, 14500);
        emploeeBook.addEmploee(new Employee("Петров", "Иван", "Васильевич", 5, 15500));
        emploeeBook.addEmploee(new Employee("Пупкин", "Василий", "Петрович", 3, 15685));
        emploeeBook.addEmploee(new Employee("Васильева", "Марфа", "Петровна", 4, 16524));
        emploeeBook.addEmploee(new Employee("Сидоров", "Александр", "Иванович", 3, 14327));
        emploeeBook.addEmploee(new Employee("Пупенко", "Ольга", "Владимировна", 2, 15458));
        emploeeBook.addEmploee(new Employee("Дудка", "Николай", "Александрович", 3, 16895));
        emploeeBook.addEmploee(new Employee("Иванова", "Марина", "Николаевна", 1, 15855));
        emploeeBook.addEmploee(new Employee("Петрова", "Любовь", "Александровна", 5, 14252));
        emploeeBook.addEmploee(new Employee("Сидорова", "Елена", "Львовна", 2, 15328));

        emploeeBook.printFullInfo();
        emploeeBook.printEmployeesByDepartments();
        System.out.println();
        emploeeBook.printFullInfo();
        System.out.println("Сумма зарплат: " + emploeeBook.totalWages());
        System.out.println("Сотрудник с минимальной зарплатой: " + emploeeBook.findEmployeeWithMinWages());
        System.out.println("Сотрудник с максимальной зарплатой: " + emploeeBook.findEmployeeWithMaxWages());
        System.out.println("Седняя зарплата: " + emploeeBook.findAverageWages());
        emploeeBook.printFullNameInfo();

        int indexPercent = 15;
        emploeeBook.indexWages(15);
        System.out.printf("Заработная плата после индексации на %d%%%n",indexPercent);
        emploeeBook.printFullInfo();

        int department = 2;
        System.out.printf("Сотрудник с минимальной зарплатой из отдела %d: %s%n", department, emploeeBook.findEmployeeWithMinWages(department));
        System.out.printf("Сотрудник с максимальной зарплатой из отдела %d: %s%n",department, emploeeBook.findEmployeeWithMaxWages(department));
        System.out.printf("Сумма зарплат отдела %d: %s%n",department, emploeeBook.totalWages(department));
        System.out.printf("Седняя зарплата отдела %d: %s%n",department, emploeeBook.findAverageWages(department));
        emploeeBook.indexWages(10, 3);
        System.out.printf("Заработная плата после индексации на %d%% отдела %d%n",indexPercent, department);
        emploeeBook.printFullInfo();
        System.out.printf("Данные всех сотрудников отдела %d%n",department);
        emploeeBook.printFullNameInfo(5);
        int wags = 19000;
        emploeeBook.printEmploeeesWagsLessThen(wags);
        emploeeBook.printEmploeeesWagsMoreThen(wags);




    }

  



}