package Ejercicios_archivos;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex_05 {
    public static void main(String[] args) {
        Path path = Paths.get("Ejercicios_archivos");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
