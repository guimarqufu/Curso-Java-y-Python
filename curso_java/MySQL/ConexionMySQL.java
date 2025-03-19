import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    public static Connection getConexion() {
        String url = "jdbc:mysql://localhost:3306/escuela";
        String usuario = "root";
        String contraseña = "";
        Connection conn = null;

        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexion con la base de datos
            conn = DriverManager.getConnection(url, usuario, contraseña);

            System.out.println("Conexion exitosa con la base de datos");
        } 
        catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }

        return conn;
    }

/*     public static void main(String[] args) {
        getConexion();
    } */
}
