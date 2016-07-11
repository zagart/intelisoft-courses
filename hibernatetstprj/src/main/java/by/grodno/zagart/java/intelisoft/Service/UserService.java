package by.grodno.zagart.java.intelisoft.Service;

import by.grodno.zagart.java.intelisoft.Entities.Employee;

import java.util.List;

/**
 * Created by intelisoft on 11.07.2016.
 */
public interface UserService {

    List<Employee> getUsers();

    boolean deleteLast(List<Employee> employees);

    List<Employee> filterByName(List<Employee> employees, String name);

}
