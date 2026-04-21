package dao;

import model.StudentMM;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentMMDAO {
    public void saveStudent(StudentMM student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(student);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public StudentMM getStudent(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            return session.get(StudentMM.class, id);
        } finally {
            session.close();
        }
    }
}
