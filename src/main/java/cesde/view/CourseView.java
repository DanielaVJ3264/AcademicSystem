package cesde.view;

import cesde.domain.Course;
import cesde.service.CourseServicelmpl;
import java.util.List;
import java.util.Scanner;

public class CourseView {

    Scanner sc = new Scanner(System.in);
    private final CourseServicelmpl courseServicelmpl;

    public CourseView(CourseServicelmpl courseServiceImpl) {
        this.courseServicelmpl = courseServiceImpl;
    }

    public void createCourse() {
        courseServicelmpl.createCourseService();
    }

    public void getCourseById(int id) {
        courseServicelmpl.getCourseById(id);
    }

    public List<Course> getAllCourses() {
        return courseServicelmpl.getAllCourses();
    }

    public void updateCourse(int id) {
        courseServicelmpl.updateCourseService(id);
    }

    public void deleteCourse(int id) {
        System.out.println("estoy en el view");
        courseServicelmpl.deleteCourse(id);
    }
}
