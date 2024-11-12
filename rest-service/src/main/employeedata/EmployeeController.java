import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping
    public Employees getAllEmployees() {
        return employeeManager.getAllEmployees();
    }
    @PostMapping
    public Employee addEmployee(@RequestBody Employee newEmployee) {
        employeeManager.getAllEmployees().getEmployeeList().add(newEmployee);
        return newEmployee;
    }
}
