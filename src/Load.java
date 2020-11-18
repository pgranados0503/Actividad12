import java.io.*;
import java.util.*;

public class Load {

    AddressBook mapaAgenda = new AddressBook();

    ValidarStrings vString = new ValidarStrings();


    public void loadFile() throws FileNotFoundException, IOException{
        String archivo = "test2.txt";
        HashMap<String, String> agenda = mapaAgenda.getAgendaMap();
        System.out.println("Contactos precargados del archivo: " + archivo);
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(archivo));
        while ((line = reader.readLine()) != null)
        {
            String[] parts = line.split(",", 2);
            if (parts.length >= 2)
            {
                String key = parts[0];
                String value = parts[1];
                agenda.put(key, value);
            } else {
                System.out.println("archivos con mal formato: " + line);
            }
        }

        for (String key : agenda.keySet())
        {
            System.out.println(key + ":" + agenda.get(key));
        }
        System.out.println("---Finalización de cargar contactos del archivo---");
        reader.close();
    }

}
