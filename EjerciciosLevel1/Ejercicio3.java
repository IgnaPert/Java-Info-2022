package EjerciciosLevel1;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException{
        System.out.println("Ingrese un número");
        Scanner scan = new Scanner(System.in);
        int numero;
        String salida = "";
        numero = scan.nextInt();
        scan.close();
        for(int i=1;i<=numero;i++){
            salida = salida + " " + i;
            System.out.println(salida);
        }
    }
    
}