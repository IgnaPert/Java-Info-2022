package EjerciciosLevel1;
import java.util.Scanner;

public class Ejercicio6 {
    public static int MultiplicoAca(int argumento, int argumento2){
        int a = argumento;
        int b = argumento2;
        int resultadoFinal=a;

        for(int i=1; i<b;i++){
            resultadoFinal+=a;
        }
        return resultadoFinal;
    }
    public static void main(String[] args) {
        System.out.println("Ingrese 2 numeros enteros separados por espacio, segundo siendo potencia");
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        scan.close();
        String[] separado = entrada.split(" ");
        System.out.println("Los numeros son: ");
        for (String x : separado){
            System.out.println(": " + x);
        };
        int a = Integer.parseInt(separado[0]);
        int b = Integer.parseInt(separado[1]);
        int acaGuardo = a;
        //si es 0, que la salida sea 1
        if(b == 0){
            acaGuardo=1;
        }
        //multiplico por si mismo usando la funcion del ej 5 hasta que i sea mayor o igual a b
        for(int i = 1; i < b; i++){
            acaGuardo=MultiplicoAca(acaGuardo, a);
        }
        String estoEscribo = "El resultado de la potencia es: ";
        String resultadoTexto = String.valueOf(acaGuardo);
        if (a == 0 && b == 0){
            resultadoTexto = "Indefinido!";
        }
        System.out.println(estoEscribo + resultadoTexto);

    }
}
