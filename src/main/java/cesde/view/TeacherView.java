package cesde.view;

import cesde.service.TeacherServiceImpl;

public class TeacherView {
    private final TeacherServiceImpl teacherServiceImpl;

    public TeacherView(TeacherServiceImpl teacherServiceImpl) {
        this.teacherServiceImpl = teacherServiceImpl;
    }

    public void createTeacher() {
        teacherServiceImpl.createTeacherService();
    }

    public void getTeacherById(int id) {
        teacherServiceImpl.getTeacherById(id);
    }

    public void getAllTeachers() {
        teacherServiceImpl.getAllTeachers();
    }

    public void updateTeacher(int id) {
        teacherServiceImpl.updateTeacherService(id);
    }

    public void deleteTeacher(int id) {
        teacherServiceImpl.deleteTeacher(id);
    }
}
