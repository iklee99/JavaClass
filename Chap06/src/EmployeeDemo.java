class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is managing");
    }

    void plan() {
        System.out.println("Manager is planning");
    }
}

class Engineer extends Employee {
    @Override
    void work() {
        System.out.println("Engineer is engineering");
    }

    void design() {
        System.out.println("Engineer is designing");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Manager(); // Upcasting
        employee1.work(); // Output: Manager is managing

        if (employee1 instanceof Manager) { // original class = Manager?
            Manager manager = (Manager) employee1; // Downcasting
            manager.plan(); // Output: Manager is planning
        }

        Employee employee2 = new Engineer(); // Upcasting
        employee2.work(); // Output: Engineer is engineering

        if (employee2 instanceof Engineer) { // original class = Engineer?
            Engineer engineer = (Engineer) employee2; // Downcasting
            engineer.design(); // Output: Engineer is designing
        }
    }
}



