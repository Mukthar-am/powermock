package com.muks.powermock.employee;

/**
 * Created by 15692 on 04/07/16.
 */
public class EmployeeController {
    public EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public int getProjectedEmployeeCount() {
        int actualEmployeeCount = employeeService.getEmployeeCount();
        return actualEmployeeCount * 2;
    }

    public void saveEmployee(Employee employee) {
        employeeService.saveEmployee(employee);
    }
}
