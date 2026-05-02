package cesde.domain;

import java.util.Scanner;

public class Student  extends  User {



    // POJO - Plain Old Java Object

    //Atributes
    private  String studentType;


    //constructores
    //constructor vacio

    public Student(){
     super();
    }

    public Student(int id, String name, String lastName, String email, String phone, String password, boolean status, String studentType) {
        super(id, name, lastName, email, phone, password, status);
        this.studentType = studentType;
    }
    // getter y setter

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }
}