package cesde.service;

import cesde.domain.Teacher;
import cesde.persistence.repository.TeacherRepository;
import cesde.util.TypeValidator;
import java.util.List;
import java.util.Optional;

public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher createTeacherService() {
        Teacher teacher = new Teacher();
        teacher.setId(TypeValidator.validateInt("Ingrese el id del profesor"));
        teacher.setName(TypeValidator.validateString("Ingrese el nombre del profesor"));
        teacher.setLastname(TypeValidator.validateString("Ingrese el apellido del profesor"));
        teacher.setEmail(TypeValidator.validateString("Ingrese el correo del profesor"));
        teacher.setSpecialty(TypeValidator.validateString("Ingrese la especialidad"));
        // Para el boolean, si no tienes validateBoolean, puedes usar validateString y comparar
        teacher.setStatus(true); // O usar la lógica que prefieras para el estado inicial

        return teacherRepository.createTeacherRepository(teacher);
    }

    @Override
    public Teacher updateTeacherService(int id) {
        Teacher teacher = teacherRepository.getTeacherById(id);
        if (teacher != null) {
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. Nombre \n" +
                    "2. Apellido \n" +
                    "3. Especialidad");
            int option = TypeValidator.validateInt("Opcion: ");
            switch (option) {
                case 1:
                    teacher.setName(TypeValidator.validateString("Nuevo nombre"));
                    break;
                case 2:
                    teacher.setLastname(TypeValidator.validateString("Nuevo apellido"));
                    break;
                case 3:
                    teacher.setSpecialty(TypeValidator.validateString("Nueva especialidad"));
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } else {
            System.out.println("Profesor no encontrado");
        }
        return teacher;
    }

    @Override
    public Optional<Teacher> getTeacherById(int id) {
        Teacher teacher = teacherRepository.getTeacherById(id);
        if (teacher != null) {
            System.out.println("Id: " + teacher.getId() + "\n" +
                    "Nombre: " + teacher.getName() + " " + teacher.getLastname() + "\n" +
                    "Especialidad: " + teacher.getSpecialty());
        } else {
            System.out.println("Profesor no encontrado");
        }
        return Optional.ofNullable(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAllTeachers();
    }

    @Override
    public void deleteTeacher(int id) {
        teacherRepository.deleteTeacherRepository(id);
    }
}