public class EmployeeManagementSystem{
    private Employee[] employees;
    private int count;
    public EmployeeManagementSystem(int size){
        employees = new Employee[size];
        count = 0;
    }
    // Add Employee
    public void addEmployee(Employee employee){
        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Employee Added Successfully");
        } else {
            System.out.println("Employee Array is Full");
        }
    }
    // Search Employee
    public Employee searchEmployee(int employeeId){
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }
    // Traverse Employees
    public void traverseEmployees() {
        if (count == 0) {
            System.out.println("No Employees Found");
            return;
        }
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }
    // Delete Employee
    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == employeeId) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Employee Not Found");
            return;
        }
        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[count - 1] = null;
        count--;
        System.out.println("Employee Deleted Successfully");
    }
    public static void main(String[] args) {
        EmployeeManagementSystem system =
                new EmployeeManagementSystem(10);

        system.addEmployee(
                new Employee(101, "John", "Manager", 50000));

        system.addEmployee(
                new Employee(102, "Alice", "Developer", 40000));

        system.addEmployee(
                new Employee(103, "David", "Tester", 35000));

        System.out.println("\nEmployee Records:");
        system.traverseEmployees();

        System.out.println("\nSearching Employee ID 102");
        Employee employee = system.searchEmployee(102);

        if (employee != null) {
            employee.display();
        }
        System.out.println("\nDeleting Employee ID 101");
        system.deleteEmployee(101);
        System.out.println("\nUpdated Employee Records:");
        system.traverseEmployees();
    }
}