package peaksoft;

import peaksoft.model.Course;
import peaksoft.model.Student;
import peaksoft.model.Teacher;
import peaksoft.service.AllService;
import peaksoft.service.serviceImpl.AllServiceImpl;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final AllService allService = new AllServiceImpl();
    public static void main( String[] args )
    {
        Student student1 = new Student("Nurkyz",19);
        Student student2 = new Student("Erzhigit",22);
        Student student3 = new Student("Zhazgul",19);
        Student student4 = new Student("Dastan",21);

        Teacher teacher1 = new Teacher("Zhanarbek","Abdurasulov");
        Teacher teacher2 = new Teacher("Nurmat","Zhumabekov");

        Course course1 = new Course("Peaksoft","01.01.2020", Arrays.asList(student1,student2),teacher1);
        Course course2 = new Course("Motion Web","01.10.2019", Arrays.asList(student3,student4),teacher2);

        allService.save(student1);
        allService.save(student2);
        allService.save(student3);
        allService.save(student4);
        allService.save(teacher1);
        allService.save(teacher2);
        allService.save(course1);
        allService.save(course2);


    }
}
