package EjerciciosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasPorDia = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        int totalFinal = 0;
        horasPorDia.add(6);
        horasPorDia.add(7);
        horasPorDia.add(8);
        horasPorDia.add(4);
        horasPorDia.add(5);
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);
        List<Integer> totalPorDia = new ArrayList<>();
        for(int i = 0; i < horasPorDia.size() ; i++){
            totalPorDia.add(horasPorDia.get(i) * valorPorHora.get(i));
        }
        System.out.println(totalPorDia);
        for(int i = 0; i < totalPorDia.size() ; i++){
            totalFinal += totalPorDia.get(i);

        }
        System.out.println("Total final: " + totalFinal);
    }
}
