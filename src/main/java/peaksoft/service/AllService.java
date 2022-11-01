package peaksoft.service;

import peaksoft.model.Course;
import peaksoft.model.Student;
import peaksoft.model.Teacher;

public interface AllService {
    void save(Course course);

    void deleteCourseById(Long id);

    void save(Student student);

    void save(Teacher teacher);

}
