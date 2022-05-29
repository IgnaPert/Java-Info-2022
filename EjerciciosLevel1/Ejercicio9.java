package EjerciciosLevel1;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba su texto: ");
        String entrada = scan.nextLine();
        System.out.println("Escriba letra a contar: ");
        char letra = (scan.nextLine().charAt(0));
        scan.close();
        char [] temp = entrada.toCharArray();
        int contador = 0;
        for(char i : temp ){
            if( i == letra){
                contador++;
            }
        }
        String salida = String.format("La letra %s se repite %s veces", letra, contador);
        System.out.println(salida);


    }
}
