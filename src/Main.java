// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private final static Employee[] employees = new Employee[10];

    private static void printSeparator() {
        System.out.println();
    }

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee(new Employee("Петров Пётр", 1, 34_000));
        employeeBook.addEmployee(new Employee("Иванов Иван", 2, 32_000));
        employeeBook.addEmployee(new Employee("Сергеев Сергей", 3, 47_000));
        employeeBook.addEmployee(new Employee("Михайлов Михаил", 4, 58_000));
        employeeBook.addEmployee(new Employee("Семёнов Семён", 5, 29_000));
        employeeBook.addEmployee(new Employee("Иванова Инна", 5, 60_000));
        employeeBook.addEmployee(new Employee("Сергеева Светлана", 4, 21_000));
        employeeBook.addEmployee(new Employee("Петрова Полина", 3, 52_000));
        employeeBook.addEmployee(new Employee("Михайлова Мария", 2, 73_000));
        employeeBook.addEmployee(new Employee("Семёнова София", 1, 14_000));

        employeeBook.printAll();
        printSeparator();

        employeeBook.removeEmployee(3);

        employeeBook.printAll();
        printSeparator();

        employeeBook.addEmployee(new Employee("Коновалов Евлампий", 4, 55_000));
        employeeBook.printAll();
        printSeparator();

        employeeBook.changeEmployeeData("Петров Пётр", 37_000, 2);
        employeeBook.printAll();
        printSeparator();

        employeeBook.printAllPerDepartment(5);
        printSeparator();
    }
}