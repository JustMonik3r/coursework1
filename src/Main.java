// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private final static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Петров Пётр", 1, 34_000);
        employees[1] = new Employee("Иванов Иван", 2, 32_000);
        employees[2] = new Employee("Сергеев Сергей", 3, 47_000);
        employees[3] = new Employee("Михайлов Михаил", 4, 58_000);
        employees[4] = new Employee("Семёнов Семён", 5, 29_000);
        employees[5] = new Employee("Иванова Инна", 5, 60_000);
        employees[6] = new Employee("Сергеева Светлана", 4, 21_000);
        employees[7] = new Employee("Петрова Полина", 3, 52_000);
        employees[8] = new Employee("Михайлова Мария", 2, 73_000);
        employees[9] = new Employee("Семёнова София", 1, 14_000);

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

        System.out.println("Повышенная сложность");

        printSeparator();
        salaryIndexation(0.015);
        printAll();

        printSeparator();
        System.out.println(salaryMinPerDepartment(1));

        printSeparator();
        System.out.println(salaryMaxPerDepartment(1));

        printSeparator();
        System.out.println(salarySumPerDepartment(2));

        printSeparator();
        System.out.println(salaryAveragePerDepartment(4));

        printSeparator();
        salaryIndexationPerDepartment(0.5, 2);
        printAll();

        printSeparator();
        printAllPerDepartment(4);

        printSeparator();
        salariesBelowLimit(50_000);

        printSeparator();
        salariesAboveLimit(50_000);


    }

    private static void printSeparator() {
        System.out.println();
    }

    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void printAllPerDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("id=" + employee.getId() + ", fullName=" + employee.getFullName() + ", salary=" + employee.getSalary());
            }
        }
    }

    private static double salarySum() {
        double salarySum = 0.0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    private static double salarySumPerDepartment(int department) {
        double salarySum = 0.0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                salarySum += employee.getSalary();
            }
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


    private static Employee salaryMinPerDepartment(int department) {
        Employee salaryMinEmployee = employees[0];
        for (Employee employee : employees) {
            if ((employee.getSalary() < salaryMinEmployee.getSalary()) && (employee.getDepartment() == department)) {
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

    private static Employee salaryMaxPerDepartment(int department) {
        Employee salaryMaxEmployee = employees[0];
        for (Employee employee : employees) {
            if ((employee.getSalary() > salaryMaxEmployee.getSalary()) && (employee.getDepartment() == department)) {
                salaryMaxEmployee = employee;
            }
        }
        return salaryMaxEmployee;
    }

    private static double salaryAverage() {
        double salaryAverage = (salarySum() / employees.length);
        return salaryAverage;
    }

    private static double salaryAveragePerDepartment(int department) {
        int employeesPerDepartment = 0;
        double salaryAveragePerDepartment = 0.0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                salaryAveragePerDepartment = salaryAveragePerDepartment + employee.getSalary();
                employeesPerDepartment++;
            }
        }
        return salaryAveragePerDepartment / employeesPerDepartment;
    }

    private static void printAllNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    private static void salaryIndexation(double salaryCoef) {
        for (Employee employee : employees) {
            double salaryIncrease = (employee.getSalary() * salaryCoef);
            employee.setSalary(employee.getSalary() + salaryIncrease);
        }
    }

    private static void salaryIndexationPerDepartment(double salaryCoef, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                double salaryIncrease = (employee.getSalary() * salaryCoef);
                employee.setSalary(employee.getSalary() + salaryIncrease);
            }
        }
    }

    private static void salariesBelowLimit(double salaryLimit) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salaryLimit) {
                System.out.println(employee);
            }
        }
    }

    private static void salariesAboveLimit(double salaryLimit) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salaryLimit) {
                System.out.println(employee);
            }
        }
    }
}