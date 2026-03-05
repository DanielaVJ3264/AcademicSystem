package cesde;
import java.util.Scanner;
public class School {


    Scanner sc = new Scanner(System.in);
    // Atributes

    private int id;
    private String nameSchool;
    private String headMaster;

    // Constructor vacío
    public School() {
    }

    // Constructor con todos los argumentos
    public School(int id, String nameSchool, String headMaster) {
        this.id = id;
        this.nameSchool = nameSchool;
        this.headMaster = headMaster;

    }

    //Methods

    public School createSchool(School school){
        System.out.println("Ingrese el id de la escuela:");
        int id = sc.nextInt();
        school.setId(id);

        System.out.println("Ingrese el nombre de la escuela:");
        school.setNameSchool(sc.nextLine());

        System.out.println("Ingrese el rector de la escuela:");
        school.setHeadMaster(sc.nextLine());
        return school;
    }
    public void getSchoolById(int id){
        if (id == this.id) {
            System.out.println(
                    "Id: " + this.id + "\n" +
                            "Nombre: " + this.nameSchool + "\n" +
                            "Dirección: " + this.headMaster
            );
        } else {
            System.out.println("Id no encontrado");
        }

    }
    public School updateSchool(School school){
        return school;
    }
    public void deleteSchool(int id){

    }
// Getters and Setters


    public Scanner getSc() {
        return sc;
    }

    public int getId() {
        return id;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public String getHeadMaster() {
        return headMaster;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public void setHeadMaster(String headMaster) {
        this.headMaster = headMaster;
    }
}


