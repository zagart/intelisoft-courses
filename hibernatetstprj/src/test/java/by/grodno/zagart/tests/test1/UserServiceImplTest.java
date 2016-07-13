package by.grodno.zagart.tests.test1;

import by.grodno.zagart.java.intelisoft.DAO.EmployeeDao;
import by.grodno.zagart.java.intelisoft.Entities.Employee;
import by.grodno.zagart.java.intelisoft.Service.Impl.UserServiceImpl;
import by.grodno.zagart.java.intelisoft.Service.UserService;
import org.hibernate.criterion.Restrictions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

/**
 * Created by intelisoft on 13.07.2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    @Mock
    private EmployeeDao dao;
    private UserService service;

    @Before
    public void init() {
        service = new UserServiceImpl(dao);
        Mockito.when(dao.getByCriteria(Restrictions.gt("id",0L))).thenReturn(new ArrayList<Employee>());
    }

    @Test
    public void getUsersTest() {
        Assert.assertEquals(service.getUsers().size(), 0);
    }

}
