package cesde;

import java.util.List;
import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);

    //Atributes

    private int id;
    private String name;
    private String lastname;
    private String email;
    private boolean status;


    // Constructores:

    // Constructor Vacio

    public Student(){

    }
    // Constructor con email

    public Student(String email){
        this.email = email;

    }
    // Constructor con todos los argumentos (alt+insert) para todos shift flecha abajo, para el vacio ( select none ) o selecciono el que deseo

    public Student(int id, String name,String lastname, String email, boolean status) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.status = status;
    }


    // Methods

    public Student createStudent(Student student){
        System.out.println(" Ingrese el id del estudiante");
        int id = sc.nextInt();
        student.setId(id);

        System.out.println("Ingrese el nombre del estudiante");
        String name = sc.nextLine();
        student.setName(name);

        System.out.println("Ingrese el apellido del estudiante");
        String lastname = sc.nextLine();
        student.setLastname(lastname);

        System.out.println("Ingrese el correo del estudiante");
        student.setEmail(sc.nextLine());



        return student;
    }
    // Getters and Setters
    public void getStudentById(int id){
        if (id == this.id){
            System.out.println(
                    "Id: " + this.id + "\n" +
                            "Nombre: " + this.name + "\n" +
                            "Apellido: " + this.lastname + "\n" +
                            "Email: " + this.email + "\n" +
                            "Estado: " + this.status
            );

        }else{
            System.out.println("id no encontrado");
        }

    }
    public Student updateStudent(Student student){
        return student;
    }
    public void deleteStudent(int id){

    }
    // Getters And Setter

    public int getId(){
        return this.id;

    }
    public String getEmail() {
        return email;
    }

    public String getLastname() {
        return lastname;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isStatus() {
        return status;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
