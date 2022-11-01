package peaksoft.service.serviceImpl;

import peaksoft.dao.CourseDao;
import peaksoft.dao.StudentDao;
import peaksoft.dao.TeacherDao;
import peaksoft.dao.daoiml.CourseDaoImpl;
import peaksoft.dao.daoiml.StudentDaoImpl;
import peaksoft.dao.daoiml.TeacherDaoImpl;
import peaksoft.model.Course;
import peaksoft.model.Student;
import peaksoft.model.Teacher;
import peaksoft.service.AllService;

public class AllServiceImpl implements AllService {
    CourseDao courseDao = new CourseDaoImpl();
    TeacherDao teacherDao = new TeacherDaoImpl();
    StudentDao studentDao = new StudentDaoImpl();


    @Override
    public void save(Course course) {
        courseDao.save(course);
    }

    @Override
    public void deleteCourseById(Long id) {
        courseDao.deleteCourseById(id);
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public void save(Teacher teacher) {
        teacherDao.save(teacher);
    }
}
