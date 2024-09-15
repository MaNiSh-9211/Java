class Employee {
    private String name;
    private float salary;
    private long empId;

    Employee() {
        this.name = "";
        this.salary = 0.0f;
        this.empId = 0;
    }

    Employee(String name, float salary, long empId) {
        this.name = name;
        this.salary = salary;
        this.empId = empId;
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public long getEmpId() {
        return empId;
    }
}

class HRManager extends Employee {
    HRManager() {
        
    }

    public Employee addEmployee(long empId, String name, float salary) {
        Employee newEmployee = new Employee(name, salary, empId);
        System.out.println("Employee added: " + name);
        return newEmployee;
    }
}

public class company{
    public static void main(String[] args) {
        HRManager hrManager = new HRManager();

        Employee emp1 = hrManager.addEmployee(1, "Manish", 80000.0f);
        // Employee emp2 = hrManager.addEmployee(2, "Naimish", 75000.0f);
        // Employee emp3 = hrManager.addEmployee(3, "Manjul", 72000.0f);

        emp1.work();
        System.out.println("Salary of " + emp1.getName() + ": " + emp1.getSalary());
        System.out.println("Employee ID of " + emp1.getName() + ": " + emp1.getEmpId());
    }
}
