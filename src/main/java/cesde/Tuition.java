package cesde;

import java.util.Scanner;

public class Tuition {

    Scanner sc = new Scanner(System.in);

    // Attributes
    private int id;
    private String date;
    private Student student;
    private Course course;
    private School school;
    private boolean status;

    // Constructor vacío
    public Tuition() {
    }

    // Constructor con todos los argumentos
    public Tuition(int id, String date, Student student,
                   Course course, School School, boolean status) {
        this.id = id;
        this.date = date;
        this.student = student;
        this.course = course;
        this.school = school;
        this.status = status;
    }

    // Methods

    public Tuition createTuition(Tuition tuition) {

        System.out.println("Ingrese el id de la matrícula:");
        int id = sc.nextInt();
        tuition.setId(id);

        System.out.println("Ingrese la fecha de la matrícula:");
        tuition.setDate(sc.nextLine());

        System.out.println("¿La matrícula está activa? (true/false):");
        tuition.setStatus(sc.nextBoolean());

        return tuition;
    }

    public void getTuitionById(int id) {
        if (id == this.id) {
            System.out.println(
                    "Id: " + this.id + "\n" +
                            "Fecha: " + this.date + "\n" +
                            "Estudiante: " + this.student + "\n" +
                            "Curso: " + this.course + "\n" +
                            "Aula: " + this.school + "\n" +
                            "Estado: " + this.status
            );
        } else {
            System.out.println("Id no encontrado");
        }
    }

    public Tuition updateTuition(Tuition tuition) {
        return tuition;
    }

    public void deleteTuition(int id) {
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public School getLounge() {
        return school;
    }

    public void setLounge(School school) {
        this.school = school;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
