package EjerciciosLevel1;
import java.util.Scanner;

public class Ejercicio7 {
    public static String miUppercase(String argumento){
        char[] cadenaCaracteres = argumento.toCharArray();
        String salida = " ";

        for (char i : cadenaCaracteres){
            if ('a' <= i && i <= 'z'){
                //(char) cualquier entero devuelve un caracter de acuerdo a su valor entero
                salida = salida+((char)((int)i - 32));
            }else{
                salida = salida+i;
            }
        }
        return salida;
    }
    public static void main(String[] args) {
        System.out.println("Ingrese un texto en minúscula");
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        scan.close();
        entrada = miUppercase(entrada);
        String salida = String.format("La salida es: %s", entrada);
        System.out.println(salida);
    }
}
