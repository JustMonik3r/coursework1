// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private final static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Петров Пётр", 1, 35_000);
        employees[1] = new Employee("Иванов Иван", 2, 36_000);
        employees[2] = new Employee("Сергеев Сергей", 3, 37_000);
        employees[3] = new Employee("Михайлов Михаил", 4, 38_000);
        employees[4] = new Employee("Семёнов Семён", 5, 39_000);
        employees[5] = new Employee("Иванова Инна", 5, 40_000);
        employees[6] = new Employee("Сергеева Светлана", 4, 41_000);
        employees[7] = new Employee("Петрова Полина", 3, 42_000);
        employees[8] = new Employee("Михайлова Мария", 2, 43_000);
        employees[9] = new Employee("Семёнова София", 1, 44_000);

        printAll();
        printSeparator();
        System.out.println("Расходы на зарплату сотрудников компании составляют " + salarySum() + " рублей");
        printSeparator();
        System.out.println(salaryMin());
        printSeparator();
        System.out.println(salaryMax());
        printSeparator();
        System.out.println(salaryAverage());
        printSeparator();
        printAllNames();
        printSeparator();
    }

    private static void printSeparator() {
        System.out.println();
    }

    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double salarySum() {
        double salarySum = 0.0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    private static Employee salaryMin() {
        Employee salaryMinEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < salaryMinEmployee.getSalary()) {
                salaryMinEmployee = employee;
            }
        }
        return salaryMinEmployee;
    }

    private static Employee salaryMax() {
        Employee salaryMaxEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > salaryMaxEmployee.getSalary()) {
                salaryMaxEmployee = employee;
            }
        }
        return salaryMaxEmployee;
    }

    private static double salaryAverage() {
        double salaryAverage = (salarySum() / employees.length);
        return salaryAverage;
    }

    private static void printAllNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}