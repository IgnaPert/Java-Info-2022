package EjerciciosLevel1;
import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        System.out.println("Ingrese 2 números");
        Scanner scan = new Scanner(System.in);
        numero1 = scan.nextInt();
        numero2 = scan.nextInt();
        scan.close();
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2));
        System.out.println(numero1 + " * " + numero2 + " = " + (numero1*numero2));
        System.out.println(numero1 + " / " + numero2 + " = " + (numero1/numero2));
        System.out.println(numero1 + " % " + numero2 + " = " + (numero1%numero2));

    }
}
