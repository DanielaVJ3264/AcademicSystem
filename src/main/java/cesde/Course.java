package cesde;

import java.util.Scanner;

public class Course {

     Scanner sc = new Scanner(System.in);
    //Attributes
    private int id;
    private String name;
    private String program;
    private School school;
    private String teacher;
    private String startDate;
    private String endDate;

    // Constructores:

    // Constructor vacio:

    public Course(){

    }
   // Constructor con todos los argumentos

    public Course(int id, String name, String program, School school, String teacher, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.program = program;
        this.school = school;
        this.teacher = teacher;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    //Methods


    public Course createCourse(Course course){


        System.out.println("Ingrese el id del estudiante");
        int id = sc.nextInt();
        course.setId(id);


        System.out.println("Ingrese el nombre del curso:");
        String name = sc.nextLine();
        course.setName(sc.nextLine());

        System.out.println("Ingrese el programa:");
        course.setProgram(sc.nextLine());

        System.out.println("Ingrese el profesor:");
        course.setTeacher(sc.nextLine());

        System.out.println("Ingrese la fecha de inicio:");
        course.setStartDate(sc.nextLine());

        System.out.println("Ingrese la fecha de fin:");
        course.setEndDate(sc.nextLine());

        return course;
    }

    public void getCourseById(int id){
        if (id == this.id) {
            System.out.println(
                    "Id: " + this.id + "\n" +
                            "Nombre: " + this.name + "\n" +
                            "Programa: " + this.program + "\n" +
                            "Profesor: " + this.teacher + "\n" +
                            "Fecha inicio: " + this.startDate + "\n" +
                            "Fecha fin: " + this.endDate
            );
        } else {
            System.out.println("Id no encontrado");
        }

    }

    public Course updateCourse(Course course){
        return course;
    }

    public void deleteCourse(int id){

    }
    // Getters and Setters


    public Scanner getSc() {
        return sc;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public School getSchool() {
        return school;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
