package EjerciciosLevel1;
import java.util.Scanner;

public class Ejercicio5 {
    public static int MultiplicoAca(int argumento, int argumento2){
        if(argumento2 == 0){
            return 0;
        }
        int a = argumento;
        int b = argumento2;
        int resultadoFinal = a;
        //Sumo a si mismo hasta que i sea igual a b
        for(int i = 1; i < b; i++){
            resultadoFinal +=a;
        }
        return resultadoFinal;

    }
    public static void main(String[] args) {
        System.out.println("ingrese 2 numeros enteros separados por espacio: ");
        //Preparo para leer
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        scan.close();
        String[] separado = entrada.split(" ");
        System.out.println("Los numeros ingresados son: ");
        for (String x : separado){
            System.out.println(": "+x);
        }
        int a = Integer.parseInt(separado[0]);
        int b = Integer.parseInt(separado[1]);
        int acaGuardo= MultiplicoAca(a, b);

        System.out.println("El resultado de la multiplicación: " + acaGuardo);
    }
}
