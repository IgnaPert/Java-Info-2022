package EjerciciosLevel1;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba su nombre y apellido: ");
        String nombreApellido = scan.nextLine();

        System.out.println("Escriba su edad: ");
        String edad = scan.nextLine();

        System.out.println("Escriba su dirección: ");
        String direccion = scan.nextLine();

        System.out.println("Escriba su ciudad: ");
        String ciudad = scan.nextLine();
        scan.close();

        String salida = String.format("%s - %s - %s - %s", ciudad, direccion, edad, nombreApellido);
        System.out.println(salida);
    }
}
