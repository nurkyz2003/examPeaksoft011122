package peaksoft.dao.daoiml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.dao.TeacherDao;
import peaksoft.model.Teacher;
import peaksoft.util.Util;

public class TeacherDaoImpl implements TeacherDao {
    private final SessionFactory sessionFactory = Util.createSessionFactory();

    @Override
    public void save(Teacher teacher) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.persist(teacher);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
