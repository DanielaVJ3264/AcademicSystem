package cesde.userinterface;

import cesde.domain.Student;
import cesde.view.StudentView;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    private final StudentView studentView;
    public MenuApp(StudentView studentView){
        this.studentView = studentView;
    }


    public  void mainMenu(){

        System.out.println("Presione 1 para iniciar la Aplicacion");

        int init = sc.nextInt();
        sc.nextLine();   // Limpiador de buffer

        while (init !=0){
            System.out.println("Seleccione una opcion  1. Regristro 2. Inicio de Sesion 3. Salir");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Crear Usuario");
                    studentView.createStudent();
                    break;
                case 2:
                    System.out.println("Iniciar sesion");
                    courseMenu();
                    break;
                case 3:
                    System.out.println("Salir del sistema");
                    init = 0;
                default:
                    System.out.println("Ingrese una opcion valida");


            }

        }
    }
    public void courseMenu(){

        System.out.println("Menu Curso");
        boolean init = true;
        sc.nextLine();

        while (init){
            System.out.println("1. Crear curso 2. Actualizar curso 3. Ver cursos  4. Ver cursos por Id 5. Eliminar cursos 6. Volver");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt){
                case 1:
                    System.out.println("Crear curso");
                    break;

                case 2:
                    System.out.println("Actualizar curso");
                    break;
                case 3:
                    System.out.println("Ver cursos");
                    break;
                case 4:
                    System.out.println("Ver cursos por Id");
                    break;
                case 5:
                    System.out.println("Eliminar cursos");
                    break;
                case 6:
                    init = false;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }

    }


}

