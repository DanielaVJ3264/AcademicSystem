package cesde;

import java.util.Scanner;

public class Teacher {

    Scanner sc = new Scanner(System.in);

    // Attributes
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String specialty;
    private boolean status;

    // Constructor vacío
    public Teacher() {
    }

    // Constructor con todos los argumentos
    public Teacher(int id, String name, String lastname,
                   String email, String specialty, boolean status) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.specialty = specialty;
        this.status = status;
    }

    // Methods

    public Teacher createTeacher(Teacher teacher) {

        System.out.println("Ingrese el id del profesor:");
        int id = sc.nextInt();
        teacher.setId(id);

        System.out.println("Ingrese el nombre del profesor:");
        teacher.setName(sc.nextLine());

        System.out.println("Ingrese el apellido del profesor:");
        teacher.setLastname(sc.nextLine());

        System.out.println("Ingrese el correo del profesor:");
        teacher.setEmail(sc.nextLine());

        System.out.println("Ingrese la especialidad del profesor:");
        teacher.setSpecialty(sc.nextLine());

        System.out.println("¿El profesor está activo? (true/false):");
        teacher.setStatus(sc.nextBoolean());

        return teacher;
    }

    public void getTeacherById(int id) {
        if (id == this.id) {
            System.out.println(
                    "Id: " + this.id + "\n" +
                            "Nombre: " + this.name + "\n" +
                            "Apellido: " + this.lastname + "\n" +
                            "Correo: " + this.email + "\n" +
                            "Especialidad: " + this.specialty + "\n" +
                            "Estado: " + this.status
            );
        } else {
            System.out.println("Id no encontrado");
        }
    }

    public Teacher updateTeacher(Teacher teacher) {
        return teacher;
    }

    public void deleteTeacher(int id) {
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
