package com.muks.employee;


import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTests{
    @Test
    public void testMyFirst() {
        System.out.println("# First test");
        Assert.assertEquals(true, true);
    }
}
