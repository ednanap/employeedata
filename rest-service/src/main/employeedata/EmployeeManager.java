import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        employees.getEmployeeList().add(new Employee(1L, "John", "Doe", "johndoe@example.com", "Developer"));
        employees.getEmployeeList().add(new Employee(2L, "Jane", "Smith", "janesmith@example.com", "Manager"));
        employees.getEmployeeList().add(new Employee(3L, "Sam", "Brown", "sambrown@example.com", "Analyst"));
    }

    public Employees getAllEmployees() {
        return employees;
    }
}
