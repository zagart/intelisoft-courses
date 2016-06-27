package by.grodno.zagart.java.intelisoft.DAO.Impl;

import by.grodno.zagart.java.intelisoft.DAO.EmployeeDao;
import by.grodno.zagart.java.intelisoft.Util.HibernateUtil;
import by.grodno.zagart.java.intelisoft.Entities.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;

import java.util.List;

import static by.grodno.zagart.java.intelisoft.Util.HibernateUtil.getSession;

/**
 * Created by intelisoft on 27.06.2016.
 */
public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public Employee getById(Long id) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        transaction.commit();
        session.close();
        return employee;
    }

    @Override
    public List<Employee> getByCriteria(Criterion criterion) {
        Criteria criteria = getSession().createCriteria(Employee.class);
        criteria.add(criterion);
        return criteria.list();
    }

    @Override
    public boolean saveOrUpdate(Employee employee) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean delete(Employee employee) {
        return false;
    }
}
