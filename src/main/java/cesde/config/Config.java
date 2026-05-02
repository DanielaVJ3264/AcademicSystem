package cesde.config;

import cesde.domain.Student;
import cesde.persistence.repository.StudentRepository;
import cesde.service.StudentServicelmpl;
import cesde.userinterface.MenuApp;
import cesde.view.StudentView;

public class Config {
    public static MenuApp createMenuApp(){

        Student student = new Student();
        StudentRepository studentRepository = new StudentRepository();
        StudentServicelmpl studentService = new StudentServicelmpl(student,studentRepository);
        StudentView studentView = new StudentView(student,studentService);

        return new MenuApp(studentView);
    }
}
