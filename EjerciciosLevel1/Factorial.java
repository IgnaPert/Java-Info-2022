package EjerciciosLevel1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i,fact = 1;
        int numero;
        System.out.println("Ingrese el número a calcular el factorial");
        numero = scan.nextInt();
        scan.close();
        for(i = 1; i <= numero ; i++){
            fact = fact * i;
        }

        System.out.println("El factorial de "+ numero + " es " + fact);

    }
}
