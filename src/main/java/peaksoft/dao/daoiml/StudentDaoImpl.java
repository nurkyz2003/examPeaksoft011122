package peaksoft.dao.daoiml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.dao.StudentDao;
import peaksoft.model.Student;
import peaksoft.util.Util;

public class StudentDaoImpl implements StudentDao {
    private final SessionFactory sessionFactory = Util.createSessionFactory();
    @Override
    public void save(Student student) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.persist(student);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
