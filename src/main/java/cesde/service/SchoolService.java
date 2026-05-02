package cesde.service;

import cesde.domain.School;
import java.util.List;
import java.util.Optional;

public interface SchoolService {
    School createSchoolService();
    School updateSchoolService(int id);
    Optional<School> getSchoolById(int id);
    List<School> getAllSchools();
    void deleteSchool(int id);
}
