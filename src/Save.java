import java.io.*;
import java.util.*;

public class Save {
    AddressBook mapaAgenda = new AddressBook();

    public void SaveFile() throws IOException{
        HashMap<String, String> agenda = mapaAgenda.getAgendaMap();
        int cantidad = 999999999;

        FileWriter fstream;
        BufferedWriter out;


        fstream = new FileWriter("values.txt");
        out = new BufferedWriter(fstream);


        int count = 0;


        Iterator<Map.Entry<String, String>> it = agenda.entrySet().iterator();


        while (it.hasNext() && count < cantidad) {


            Map.Entry<String, String> pairs = it.next();



            out.write("{" + pairs.getKey() + "}" + "," + "{" + pairs.getValue() + "}" + "\n");
            count++;
        }
        out.close();


    }


}
