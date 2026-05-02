package cesde.service;

import cesde.domain.Course;
import java.util.List;

public interface CourseService {
    void createCourseService();
    void updateCourseService(int id);
    void getCourseById(int id);
    List<Course> getAllCourses();
    void deleteCourse(int id);
}