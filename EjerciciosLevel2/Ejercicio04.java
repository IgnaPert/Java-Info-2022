package EjerciciosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio04 {
    public static void main(String[] args) {
        List<String> estudiantes = new ArrayList<>();
        estudiantes.add("Juan");
        estudiantes.add("Pedro");
        estudiantes.add("Luisa");
        estudiantes.add("Luis");
        estudiantes.add("Eliana");
        estudiantes.add("Oriana");
        estudiantes.add("Martin");
        estudiantes.add("Santiago");
        estudiantes.add("Florencia");
        estudiantes.add("Karen");
        estudiantes.add("Fernando");
        estudiantes.add("Valentina");
        List<String> clase1 = new ArrayList<>(estudiantes.subList(0, 4));
        List<String> clase2 = new ArrayList<>(estudiantes.subList(4, 8));
        List<String> clase3 = new ArrayList<>(estudiantes.subList(8, 12));

        System.out.println("Estudiantes clase 1: ");
        for (String i : clase1) {
            System.out.println(i);
        }

        System.out.println("Estudiantes clase 2: ");
        for (String i : clase2) {
            System.out.println(i);
        }
        
        System.out.println("Estudiantes clase 3: ");
        for (String i : clase3) {
            System.out.println(i);
        }

    }
}
