package EjerciciosLevel2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio03 {

    public static void main(String[] args) {
        List<String> baraja = new ArrayList<>();
        baraja.add("A");
        baraja.add("2");
        baraja.add("3");
        baraja.add("4");
        baraja.add("5");
        baraja.add("6");
        baraja.add("7");
        baraja.add("8");
        baraja.add("9");
        baraja.add("10");
        baraja.add("J");
        baraja.add("Q");
        baraja.add("K");
        System.out.println("Lista ordenada: ");
        for (String i : baraja) {
            System.out.println(i);
        }
        System.out.println("Lista en orden inverso");
        //Con Collections: Collections.reverse(baraja);

        for(int i = baraja.size() - 1 ; i >= 0 ; i--){
            System.out.println(baraja.get(i));
        }
        System.out.println("Lista desordenada ");
        Collections.shuffle(baraja, new Random());
        for (String i : baraja) {
            System.out.println(i);
        }
    }
}
