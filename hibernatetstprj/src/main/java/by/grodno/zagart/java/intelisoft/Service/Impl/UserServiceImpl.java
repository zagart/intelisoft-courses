package by.grodno.zagart.java.intelisoft.Service.Impl;

import by.grodno.zagart.java.intelisoft.DAO.EmployeeDao;
import by.grodno.zagart.java.intelisoft.DAO.Impl.EmployeeDaoImpl;
import by.grodno.zagart.java.intelisoft.Entities.Employee;
import by.grodno.zagart.java.intelisoft.Service.UserService;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by intelisoft on 11.07.2016.
 */
public class UserServiceImpl implements UserService {

    private EmployeeDao dao = new EmployeeDaoImpl();

    @Override
    public List<Employee> getUsers() {
        return dao.getByCriteria(Restrictions.gt("id",0L));
    }

    @Override
    public boolean deleteLast(List<Employee> employees) {
        int last = employees.size() - 1;
        Employee employee = employees.remove(last);
        return dao.delete(employee);
    }

    @Override
    public List<Employee> filterByName(List<Employee> employees, String name) {
        return employees
                .stream()
                .filter(employee -> employee.getName().equals(name))
                .collect(Collectors.toList());
    }

}
