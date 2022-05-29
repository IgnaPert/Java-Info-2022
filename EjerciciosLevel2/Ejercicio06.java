// package EjerciciosLevel2;

// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Map;
// import java.util.Set;

// class Empleado{
//     public String nombreApellido;
//     public int dni;
//     public int horasTrabajadas;
//     public int valorPorHora;

//     public Empleado(int dni, String nombreApellido, int horasTrabajadas, int valorPorHora){
//         this.nombreApellido = nombreApellido;
//         this.dni = dni;
//         this.horasTrabajadas = horasTrabajadas;
//         this.valorPorHora = valorPorHora;
//     }
    
//     @Override
//     public String toString(){
//         return String.valueOf(this.dni) + " - " + this.nombreApellido;
//     }
// }

// public class Ejercicio06 {
//     public static void main(String[] args) {
//         Set<Empleado> empleados = new HashSet<>();
//         Map<Integer, Integer> sueldos = new HashMap<Integer, Integer>();

//         empleados.add(new Empleado(123456789, "Homero Simpson", 6, 200));
//         empleados.add(new Empleado(123456555, "Lisa Simpson", 8, 300));
//         for(Empleado i : empleados){
//             sueldos.put(i.dni, (i.horasTrabajadas * i.valorPorHora));
//         }
//         System.out.println("Sueldo para el dni 123456789 " + sueldos.get(123456789));
//     }

// }
