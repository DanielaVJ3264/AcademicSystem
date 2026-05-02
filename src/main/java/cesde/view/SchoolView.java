package cesde.view;

import cesde.service.SchoolServiceImpl;

public class SchoolView {
    private final SchoolServiceImpl schoolServiceImpl;

    public SchoolView(SchoolServiceImpl schoolServiceImpl) {
        this.schoolServiceImpl = schoolServiceImpl;
    }

    public void createSchool() {
        schoolServiceImpl.createSchoolService();
    }

    public void getSchoolById(int id) {
        schoolServiceImpl.getSchoolById(id);
    }

    public void getAllSchools() {
        schoolServiceImpl.getAllSchools();
    }

    public void updateSchool(int id) {
        schoolServiceImpl.updateSchoolService(id);
    }

    public void deleteSchool(int id) {
        schoolServiceImpl.deleteSchool(id);
    }
}
