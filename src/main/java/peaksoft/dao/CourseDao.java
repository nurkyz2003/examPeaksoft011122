package peaksoft.dao;

import peaksoft.model.Course;

public interface CourseDao {
    void save(Course course);
    void deleteCourseById(Long id);


}
