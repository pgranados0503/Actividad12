import java.util.*;

public class List {

    AddressBook mapaAgenda = new AddressBook();


    ValidarStrings vString = new ValidarStrings();
    
    public void listar(){
        HashMap<String, String> agenda = mapaAgenda.getAgendaMap();
        if(agenda.entrySet().isEmpty()){
            System.out.println("No hay contactos registrados.");
        }else{
            for(Map.Entry<String, String> entry: agenda.entrySet()){
                System.out.println("Telefono: " + entry.getKey() + " Nombre: " + entry.getValue());
            }
        }
    }
}
