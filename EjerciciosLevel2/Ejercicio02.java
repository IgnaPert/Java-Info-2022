package EjerciciosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio02 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println("Tamaño de la lista: " + numeros.size());
        System.out.println("Elementos en la lista:");
        for (Integer i : numeros) {
            System.out.println(i);
        }
        numeros.add(6);
        numeros.add(0, 0);
        System.out.println("Tamaño de la lista luego de agregar elementos: " + numeros.size());
        System.out.println("Elementos en la lista");
        for (Integer i : numeros) {
            System.out.println(i);
        }
    }
}
