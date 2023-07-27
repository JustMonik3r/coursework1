public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public void changeEmployeeData(String fullName, double newSalary, int newDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equalsIgnoreCase(fullName)) {
                employees[i].setSalary(newSalary);
                employees[i].setDepartment(newDepartment);
                break;
            }
        }
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void removeEmployee(long id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    public void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    public void printAllPerDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("id=" + employee.getId() + ", fullName=" + employee.getFullName() + ", salary=" + employee.getSalary());
            }
        }
    }

    public double salarySum() {
        double salarySum = 0.0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    public double salarySumPerDepartment(int department) {
        double salarySum = 0.0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                salarySum += employee.getSalary();
            }
        }
        return salarySum;
    }

    public Employee salaryMin() {
        Employee salaryMinEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < salaryMinEmployee.getSalary()) {
                salaryMinEmployee = employee;
            }
        }
        return salaryMinEmployee;
    }


    public Employee salaryMinPerDepartment(int department) {
        Employee salaryMinEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && (salaryMinEmployee == null || employee.getSalary() < salaryMinEmployee.getSalary())) {
                salaryMinEmployee = employee;
            }
        }
        return salaryMinEmployee;
    }

    public Employee salaryMax() {
        Employee salaryMaxEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > salaryMaxEmployee.getSalary()) {
                salaryMaxEmployee = employee;
            }
        }
        return salaryMaxEmployee;
    }

    public Employee salaryMaxPerDepartment(int department) {
        Employee salaryMaxEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && (salaryMaxEmployee == null || employee.getSalary() > salaryMaxEmployee.getSalary())) {
                salaryMaxEmployee = employee;
            }
        }
        return salaryMaxEmployee;
    }

    public double salaryAverage() {
        double salaryAverage = (salarySum() / employees.length);
        return salaryAverage;
    }

    public double salaryAveragePerDepartment(int department) {
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

    private void printAllNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    private void salaryIndexation(double salaryCoef) {
        for (Employee employee : employees) {
            double salaryIncrease = (employee.getSalary() * salaryCoef);
            employee.setSalary(employee.getSalary() + salaryIncrease);
        }
    }

    private void salaryIndexationPerDepartment(double salaryCoef, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                double salaryIncrease = (employee.getSalary() * salaryCoef);
                employee.setSalary(employee.getSalary() + salaryIncrease);
            }
        }
    }

    private void salariesBelowLimit(double salaryLimit) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salaryLimit) {
                System.out.println(employee);
            }
        }
    }

    private void salariesAboveLimit(double salaryLimit) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salaryLimit) {
                System.out.println(employee);
            }
        }
    }
}
