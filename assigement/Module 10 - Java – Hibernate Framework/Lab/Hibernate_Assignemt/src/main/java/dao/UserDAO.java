package dao;

import model.User;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAO {
    public void saveUser(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(user);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public User getUser(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            return session.get(User.class, id);
        } finally {
            session.close();
        }
    }
}
