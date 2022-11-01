package peaksoft.dao.daoiml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.dao.CourseDao;
import peaksoft.model.Course;
import peaksoft.util.Util;

public class CourseDaoImpl implements CourseDao {
    private final SessionFactory sessionFactory = Util.createSessionFactory();
    @Override
    public void save(Course course) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.persist(course);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteCourseById(Long id) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Course course = session.get(Course.class, id);
            session.remove(course);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
