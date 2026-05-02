package cesde.service;

import cesde.domain.School;
import cesde.persistence.repository.SchoolRepository;
import cesde.util.TypeValidator;
import java.util.List;
import java.util.Optional;

public class SchoolServiceImpl implements SchoolService {
    private final SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public School createSchoolService() {
        School school = new School();
        school.setId(TypeValidator.validateInt("Ingrese el id de la escuela"));
        school.setNameSchool(TypeValidator.validateString("Ingrese el nombre de la escuela"));
        school.setHeadMaster(TypeValidator.validateString("Ingrese el nombre del rector/director"));
        return schoolRepository.createSchoolRepository(school);
    }

    @Override
    public School updateSchoolService(int id) {
        School school = schoolRepository.getSchoolById(id);
        if (school != null) {
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Rector");
            int option = TypeValidator.validateInt("Opcion: ");
            switch (option) {
                case 1:
                    school.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    school.setNameSchool(TypeValidator.validateString("Actualizar nombre"));
                    break;
                case 3:
                    school.setHeadMaster(TypeValidator.validateString("Actualizar rector"));
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }
        } else {
            System.out.println("Escuela no encontrada");
        }
        return school;
    }

    @Override
    public Optional<School> getSchoolById(int id) {
        School school = schoolRepository.getSchoolById(id);
        if (school != null) {
            System.out.println("Id: " + school.getId() + "\n" +
                    "Nombre: " + school.getNameSchool() + "\n" +
                    "Rector: " + school.getHeadMaster());
        } else {
            System.out.println("Escuela no encontrada");
        }
        return Optional.ofNullable(school);
    }

    @Override
    public List<School> getAllSchools() {
        return schoolRepository.getAllSchools();
    }

    @Override
    public void deleteSchool(int id) {
        schoolRepository.deleteSchoolRepository(id);
    }
}
