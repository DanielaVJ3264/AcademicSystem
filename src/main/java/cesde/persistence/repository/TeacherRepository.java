package cesde.persistence.repository;

import cesde.domain.Teacher;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {
    List<Teacher> teachers = new ArrayList<>();

    public Teacher createTeacherRepository(Teacher teacher) {
        teachers.add(teacher);
        for (Teacher t : teachers) {
            System.out.println(t.getId() + " " + t.getName() + " " + t.getSpecialty());
        }
        return teacher;
    }

    public Teacher getTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }

    public List<Teacher> getAllTeachers() {
        for (Teacher t : teachers) {
            System.out.println(t.getId() + " " + t.getName() + " " + t.getSpecialty());
        }
        return teachers;
    }

    public void deleteTeacherRepository(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                teachers.remove(teacher);
                System.out.println("Profesor eliminado");
                return;
            }
        }
        System.out.println("Profesor no encontrado");
    }
}
