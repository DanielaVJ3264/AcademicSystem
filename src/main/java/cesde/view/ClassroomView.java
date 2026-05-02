package cesde.view;

import cesde.service.ClassroomServiceImpl;

public class ClassroomView {
    private final ClassroomServiceImpl classroomServiceImpl;

    public ClassroomView(ClassroomServiceImpl classroomServiceImpl) {
        this.classroomServiceImpl = classroomServiceImpl;
    }

    public void createClassroom() {
        classroomServiceImpl.createClassroomService();
    }

    public void getClassroomById(int id) {
        classroomServiceImpl.getClassroomById(id);
    }

    public void getAllClassrooms() {
        classroomServiceImpl.getAllClassrooms();
    }

    public void updateClassroom(int id) {
        classroomServiceImpl.updateClassroomService(id);
    }

    public void deleteClassroom(int id) {
        classroomServiceImpl.deleteClassroom(id);
    }
}
