package EjerciciosLevel1;
import java.util.Scanner;

public class HolaUsuario {
    public static void main(String[] args) {
        String nombre;
        System.out.println("Ingrese su nombre");
        Scanner scan = new Scanner(System.in);
        nombre = scan.nextLine();
        scan.close();
        System.out.println("Hola " + nombre);
    }
}
