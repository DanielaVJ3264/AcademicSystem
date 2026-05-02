package cesde.persistence.repository;

import cesde.domain.Classroom;
import java.util.ArrayList;
import java.util.List;

public class ClassroomRepository {
    List<Classroom> classrooms = new ArrayList<>();

    public Classroom createClassroomRepository(Classroom classroom) {
        classrooms.add(classroom);
        for (Classroom c : classrooms) {
            System.out.println(c.getId() + " - Salon: " + c.getClassroom() + " - Piso: " + c.getFloor());
        }
        return classroom;
    }

    public Classroom getClassroomById(int id) {
        for (Classroom classroom : classrooms) {
            if (classroom.getId() == id) {
                return classroom;
            }
        }
        return null;
    }

    public List<Classroom> getAllClassrooms() {
        for (Classroom c : classrooms) {
            System.out.println(c.getId() + " - Salon: " + c.getClassroom() + " - Capacidad: " + c.getAbility());
        }
        return classrooms;
    }

    public void deleteClassroomRepository(int id) {
        for (Classroom classroom : classrooms) {
            if (classroom.getId() == id) {
                classrooms.remove(classroom);
                System.out.println("Salón eliminado");
                return;
            }
        }
        System.out.println("Salón no encontrado");
    }
}