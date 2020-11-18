
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

    // Scanner
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        boolean cantidad = false;
        int menu;

        ValidarStrings vString = new ValidarStrings();
        AddressBook mapaAgenda = new AddressBook();
        List List = new List();
        Create Create = new Create();
        Delete Delete = new Delete();
        Buscar Buscar = new Buscar();
        Load Load = new Load();
        Save Save = new Save();
        Load.loadFile();
        String nombre;
        String telefono;


        // Menu Interactivo

        while (!cantidad){

            System.out.println("Selecciona una Opcion");
            System.out.println("1. Ver el Listado");
            System.out.println("2. Crear un Contacto");
            System.out.println("3. Buscar un Contacto");
            System.out.println("4. Borrar un Contacto");
            System.out.println("5. Salir");
        try{
            System.out.println("Escribe el Numero de la Operacion");
            menu = input.nextInt();
            switch (menu){
                case 1:
                    List.listar();
                    break;
                case 2:
                    Create.crearUser();
                    break;
                case 3:
                    Buscar.buscarUser();
                    break;
                case 4:
                    Delete.borrarUser();
                    break;
                case 5:
                    Save.SaveFile();
                    System.out.println("Hasta Luego.");
                    cantidad = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
                        }
        }catch(Exception e){
            System.out.println("Selecciona una opción correcta del menú.");
            input.next();
    }   }
        Save.SaveFile();
}
}
