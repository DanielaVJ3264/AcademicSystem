package cesde.domain;

import java.util.Scanner;


public class Classroom {

    Scanner sc = new Scanner(System.in);

    // Attributes
    private int id;
    private int classroom;
    private int floor;
    private int ability;
    private Boolean status;

    // Constructor vacío
    public Classroom() {
    }

    // Constructor con todos los argumentos
    public Classroom(int id, int classroom, int floor, int ability, Boolean status) {
        this.id = id;
        this.classroom = classroom;
        this.floor = floor;
        this.ability = ability;
        this.status = status;
    }

// Methods

    public Classroom createClassroom(Classroom classroom) {

        System.out.println("Ingrese el id del salón:");
        int id = sc.nextInt();
        classroom.setId(id);

        System.out.println("Ingrese el número del salón:");
        classroom.setClassroom(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese el piso:");
        classroom.setFloor(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese la capacidad:");
        classroom.setAbility(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese el estado del salón (true/false):");
        classroom.setStatus(sc.nextBoolean());

        return classroom;
    }

    public void getClassroomById(int id) {
        if (id == this.id) {
            System.out.println(
                    "Id: " + this.id + "\n" +
                            "Salón: " + this.classroom + "\n" +
                            "Piso: " + this.floor + "\n" +
                            "Capacidad: " + this.ability + "\n" +
                            "Estado: " + this.status
            );
        } else {
            System.out.println("Id no encontrado");
        }
    }

    public Classroom updateClassroom(Classroom classroom) {
        return classroom;
    }

    public void deleteClassroom(int id) {
    }

// Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;

    }
}
