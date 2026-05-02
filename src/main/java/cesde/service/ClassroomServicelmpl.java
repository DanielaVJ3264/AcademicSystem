package cesde.service;

import cesde.domain.Classroom;
import cesde.repository.ClassroomRepository;
import cesde.util.TypeValidator;
import java.util.List;
import java.util.Optional;

public class ClassroomServiceImpl implements ClassroomService {
    private final ClassroomRepository classroomRepository;

    public ClassroomServiceImpl(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    @Override
    public Classroom createClassroomService() {
        Classroom classroom = new Classroom();
        classroom.setId(TypeValidator.validateInt("Ingrese el id del salón"));
        classroom.setClassroom(TypeValidator.validateInt("Ingrese el número del salón"));
        classroom.setFloor(TypeValidator.validateInt("Ingrese el piso"));
        classroom.setAbility(TypeValidator.validateInt("Ingrese la capacidad (aforo)"));
        classroom.setStatus(true); // Por defecto activo, o puedes usar un validador si tienes uno para booleanos

        return classroomRepository.createClassroomRepository(classroom);
    }

    @Override
    public Classroom updateClassroomService(int id) {
        Classroom classroom = classroomRepository.getClassroomById(id);
        if (classroom != null) {
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. Número de salón \n" +
                    "2. Piso \n" +
                    "3. Capacidad");
            int option = TypeValidator.validateInt("Opcion: ");
            switch (option) {
                case 1:
                    classroom.setClassroom(TypeValidator.validateInt("Nuevo número de salón"));
                    break;
                case 2:
                    classroom.setFloor(TypeValidator.validateInt("Nuevo piso"));
                    break;
                case 3:
                    classroom.setAbility(TypeValidator.validateInt("Nueva capacidad"));
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } else {
            System.out.println("Salón no encontrado");
        }
        return classroom;
    }

    @Override
    public Optional<Classroom> getClassroomById(int id) {
        Classroom classroom = classroomRepository.getClassroomById(id);
        if (classroom != null) {
            System.out.println("Id: " + classroom.getId() + "\n" +
                    "Salón: " + classroom.getClassroom() + "\n" +
                    "Piso: " + classroom.getFloor() + "\n" +
                    "Capacidad: " + classroom.getAbility());
        } else {
            System.out.println("Salón no encontrado");
        }
        return Optional.ofNullable(classroom);
    }

    @Override
    public List<Classroom> getAllClassrooms() {
        return classroomRepository.getAllClassrooms();
    }

    @Override
    public void deleteClassroom(int id) {
        classroomRepository.deleteClassroomRepository(id);
    }
}