package cesde.service;

import cesde.domain.Classroom;
import java.util.List;
import java.util.Optional;

public interface ClassroomService {
    Classroom createClassroomService();
    Classroom updateClassroomService(int id);
    Optional<Classroom> getClassroomById(int id);
    List<Classroom> getAllClassrooms();
    void deleteClassroom(int id);
}