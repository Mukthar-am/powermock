package com.muks.powermock.employee;


import org.powermock.api.mockito.PowerMockito;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class EmployeeTest {

    @Test
    public void testMyFirst() {
        System.out.println("# My first test.");
        Assert.assertEquals(true, true);
    }

    @Test
    public void testMySecond() {
        System.out.println("# My Second test.");
        Assert.assertEquals(true, true);
    }

    @Test(expectedExceptions = UnsupportedOperationException.class)
    public void shouldGetCountOfEmployeesTest() {
        EmployeeController employeeController =new EmployeeController(new EmployeeService());
        Assert.assertEquals(10,employeeController.getProjectedEmployeeCount());
    }

    @Test
    public void firstMockTest() {
        // create mock
        EmployeeService mock = PowerMockito.mock(EmployeeService.class);
        PowerMockito.when(mock.getEmployeeCount()).thenReturn(8);

        EmployeeController employeeController = new EmployeeController(mock);
        Assert.assertEquals(16, employeeController.getProjectedEmployeeCount());
    }
}
