package EjerciciosLevel2;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio007 {
    public static List<String> FizzBuzzFunction(int a, int b){
        List<String> lista = new ArrayList<>();
        for(int i=a; i < b ; i++){
            String.valueOf(i);
            if(i % 2 == 0 && i % 3 == 0){
                lista.add("'FizzBuzz'");
            }else if(i % 2 == 0){
                lista.add("'Fizz'");
            }else if( i % 3 == 0){
                lista.add("'Buzz'");
            }else{
                lista.add("'" + String.valueOf(i) + "'");
            }
            
        }
        return lista;
    }
    public static void main(String[] args) {
        System.out.println(FizzBuzzFunction(1, 8));
        System.out.println(FizzBuzzFunction(1, 6));
    }
}
