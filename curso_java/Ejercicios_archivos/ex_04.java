import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex_04 {
    public static void main(String[] args) {
        Path path = Paths.get("nuevo_directorio");
        try {
            Files.createDirectory(path);
            System.out.println("Directorio creado con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
