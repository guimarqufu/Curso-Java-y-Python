
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

//import ConexionMySQL;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ver datos");
            System.out.println("2. Insertar datos");
            System.out.println("3. Actualizar datos");
            System.out.println("4. Eliminar datos");
            System.out.println("5. Salir");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (option) {
                case 1:
                    verDatos();
                    break;
                case 2:
                    insertarDatos(scanner);
                    break;
                case 3:
                    actualizarDatos(scanner);
                    break;
                case 4:
                    eliminarDatos(scanner);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }

    public static void verDatos() {
        Connection conn = ConexionMySQL.getConexion();

        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String sql = "SELECT * FROM alumnos";
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    int edad = rs.getInt("edad");
                    System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
                }

            } catch (SQLException e) {
                System.out.println("Error al interactuar con la base de datos: " + e.getMessage());
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexion: " + e.getMessage());
                }
            }
        }
    }

    public static void insertarDatos(Scanner scanner) {
        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();
        scanner.nextLine();

        Connection conn = ConexionMySQL.getConexion();

        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String sql = "INSERT INTO alumnos (nombre, edad) VALUES ('" + nombre + "', " + edad + ")";
                stmt.executeUpdate(sql);
                System.out.println("Datos insertados correctamente.");

            } catch (SQLException e) {
                System.out.println("Error al interactuar con la base de datos: " + e.getMessage());
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexion: " + e.getMessage());
                }
            }
        }
    }

    public static void actualizarDatos(Scanner scanner) {
        System.out.println("Introduce el ID del registro a actualizar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.println("Introduce el nuevo nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce la nueva edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Connection conn = ConexionMySQL.getConexion();

        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String sql = "UPDATE alumnos SET nombre = '" + nombre + "', edad = " + edad + " WHERE id = " + id;
                stmt.executeUpdate(sql);
                System.out.println("Datos actualizados correctamente.");

            } catch (SQLException e) {
                System.out.println("Error al interactuar con la base de datos: " + e.getMessage());
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexion: " + e.getMessage());
                }
            }
        }
    }

    public static void eliminarDatos(Scanner scanner) {
        System.out.println("Introduce el ID del registro a eliminar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Connection conn = ConexionMySQL.getConexion();

        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String sql = "DELETE FROM alumnos WHERE id = " + id;
                stmt.executeUpdate(sql);
                System.out.println("Datos eliminados correctamente.");

            } catch (SQLException e) {
                System.out.println("Error al interactuar con la base de datos: " + e.getMessage());
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexion: " + e.getMessage());
                }
            }
        }
    }
}