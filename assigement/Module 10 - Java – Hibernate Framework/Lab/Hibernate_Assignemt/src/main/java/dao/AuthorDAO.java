package dao;

import model.Author;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AuthorDAO {
    public void saveAuthor(Author author) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(author);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Author getAuthor(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            return session.get(Author.class, id);
        } finally {
            session.close();
        }
    }
}
