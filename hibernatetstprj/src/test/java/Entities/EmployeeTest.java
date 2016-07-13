package Entities;

import by.grodno.zagart.java.intelisoft.Entities.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by intelisoft on 13.07.2016.
 */
public class EmployeeTest {
    private Employee employee = new Employee();

    @Before
    public void begin() {
        employee.setName("Name");
        employee.setId(30L);
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Name", employee.getName());
    }


    @Test
    public void getId() {
        Assert.assertEquals(30L, (long) employee.getId());
    }

}
