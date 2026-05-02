package cesde.service;

import cesde.domain.Student;
import cesde.persistence.repository.StudentRepository;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class StudentServicelmpl {

    private final StudentRepository studentRepository;

    // Inyección de dependencias
    public StudentServicelmpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    // ✅ CREATE
    public Student createStudentService(){

        Student student = new Student();

        student.setId(TypeValidator.validateInt("Ingrese el id del estudiante"));
        student.setName(TypeValidator.validateString("Ingrese el nombre del estudiante"));
        student.setLastName(TypeValidator.validateString("Ingrese el apellido del estudiante"));
        student.setEmail(TypeValidator.validateString("Ingrese el email"));
        student.setStatus(TypeValidator.validateBoolean("Ingrese el estado (true/false)"));

        return studentRepository.createStudentRepository(student);
    }

    // ✅ UPDATE
    public Student updateStudentService(int id){

        Student student = studentRepository.getStudentById(id);

        if (student == null){
            System.out.println("Estudiante no encontrado");
            return null;
        }

        System.out.println("Seleccione el dato a actualizar:\n" +
                "1. id\n" +
                "2. Nombre\n" +
                "3. Apellido\n" +
                "4. Email\n" +
                "5. Estado");

        int option = TypeValidator.validateInt("Opción: ");

        switch (option){
            case 1:
                student.setId(TypeValidator.validateInt("Nuevo id"));
                break;
            case 2:
                student.setName(TypeValidator.validateString("Nuevo nombre"));
                break;
            case 3:
                student.setLastName(TypeValidator.validateString("Nuevo apellido"));
                break;
            case 4:
                student.setEmail(TypeValidator.validateString("Nuevo email"));
                break;
            case 5:
                student.setStatus(TypeValidator.validateBoolean("Nuevo estado"));
                break;
            default:
                System.out.println("Opción inválida");
        }

        return student;
    }

    // ✅ GET BY ID
    public Optional<Student> getStudentById(int id){

        Student student = studentRepository.getStudentById(id);

        if (student != null){
            System.out.println("ID: " + student.getId());
            System.out.println("Nombre: " + student.getName());
            System.out.println("Apellido: " + student.getLastName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Estado: " + student.isStatus());
        } else {
            System.out.println("Estudiante no encontrado");
        }

        return Optional.ofNullable(student);
    }

    // ✅ GET ALL
    public List<Student> getAllStudents(){
        return studentRepository.getAllStudents();
    }

    // ✅ DELETE
    public void deleteStudent(int id){
        studentRepository.deleteStudentRepository(id);
        System.out.println("Estudiante eliminado correctamente");
    }
}
