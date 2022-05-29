package EjerciciosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio01 {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        ciudades.add("Bariloche");
        ciudades.add("Resistencia");
        ciudades.add("Saenz peña");
        ciudades.add("Salta");
        int contador = 0;
        int contador2 = 1;
        for(int i=0 ; i < ciudades.size() ; i++){
            System.out.println("# " + contador2 +" "+ ciudades.get(contador));
            contador++;
            contador2++;
        }
    }
}
