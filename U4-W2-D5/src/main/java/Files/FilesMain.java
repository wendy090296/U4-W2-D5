package Files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FilesMain {
    public static void main(String[] args) throws IOException {
        File file = new File("src/output.txt"); //rif. al file e percorso

        try {

            for (int i = 0, i<archivioElementi;i++){
                FileUtils.writeStringToFile(file, archivioElementi.get(i) + System.lineSeparator(), StandardCharsets.UTF_8, true);
                System.out.println("Creazione file andata a buon fine!");
            }

            String contenuto= FileUtils.readFileToString(file,StandardCharsets.UTF_8);
            System.out.println("Contenuto del file");
            System.out.println(contenuto);


            } catch(IOException e){
                System.err.println("ERRORE " +  e.getMessage());
        }
    }
} //   NOTA : NEL MAIN MI DAVA ERRORI OVUNQUE, PER QUESTO L'HO LASCIATO QUI! :)