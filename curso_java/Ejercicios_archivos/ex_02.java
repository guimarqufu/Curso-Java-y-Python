import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ex_02 {
    public static void main(String[] args) {
        String contenido = "Hola son pepito,\nhola don jose";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salida.txt"))) {
            writer.write(contenido);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
