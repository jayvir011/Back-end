package dao;

import model.Employee;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class EmployeeDAO {
    public void saveEmployee(Employee emp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(emp);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public List<Employee> getAllEmployees() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query<Employee> query = session.createQuery("from Employee", Employee.class);
            return query.list();
        } finally {
            session.close();
        }
    }

    public Employee getEmployee(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            return session.get(Employee.class, id);
        } finally {
            session.close();
        }
    }

    public void updateEmployee(Employee emp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.update(emp);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteEmployee(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            Employee emp = session.get(Employee.class, id);
            if (emp != null) {
                session.delete(emp);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
