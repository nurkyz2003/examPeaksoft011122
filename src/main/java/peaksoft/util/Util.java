package peaksoft.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import peaksoft.model.Course;
import peaksoft.model.Student;
import peaksoft.model.Teacher;

import java.util.Properties;

public class Util {
    public static SessionFactory createSessionFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "org.postgresql.Driver");
        properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/examDb");
        properties.put(Environment.USER, "postgres");
        properties.put(Environment.PASS, "nurkyz200319yearsss");
        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        properties.put(Environment.SHOW_SQL, "true");


        org.hibernate.cfg.Configuration configuration = new Configuration();
        configuration.addProperties(properties);
        configuration.addAnnotatedClass(Course.class);
        configuration.addAnnotatedClass(Teacher.class);
        configuration.addAnnotatedClass(Student.class);

        return configuration.buildSessionFactory();
    }
}
