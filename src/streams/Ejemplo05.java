package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import streams.model.Person;
import streams.model.User;

/**
 *
 * @author Irvn Cruz
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        //Transformar valores con map
        //Map se hace una expresion lambda y retorna un nuevo stream

        //Ejemplo 01 obtener cuadrado de lista oritiginal
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numeros.stream().
                map(num -> num * num).
                collect(Collectors.toList());

        System.out.println(result);

        //Ejemplo 02 Generar lista de numeros enteros a traves de lista de numeros en string
        List<String> numerosStr = List.of("1","2","3","4","5");
        List<Integer> numerosResult = numerosStr.stream()
                                                            .map( numStr -> Integer.parseInt(numStr))
                                                            .collect(Collectors.toList());
         System.out.println(numerosResult);
         
         //Ejemplo 03 Cambiar todos los string a mayusculas
         List<String> palabras = List.of("Uno","dos","TRes","cUatro","Cinco");
         List<String> palabrasResult = palabras.stream()
                                                            .map( palabra -> palabra.toUpperCase())
                                                            .collect(Collectors.toList());
         System.out.println(palabrasResult);
         
         //Ejemplo 04 Generar lista de caligicaciones en booleanos (true) para aprobatorios a partir de 6
         List<Integer> calificaciones = List.of(4,7,9,4,6,8,7,10,5,8,7);
         List<Boolean> califAprobatorias = calificaciones.stream()
                                                                    .map( calificacion -> calificacion > 6)
                                                                    .collect(Collectors.toList());
         System.out.println(califAprobatorias);
         
         //Ejemplo 05 Mapear una lista de objetos a otra
         ArrayList<User> users = new ArrayList<>();
        users.add(new User("Raul", 22));
        users.add(new User("Alejandro", 21));
        users.add(new User("Lilia", 20));
        users.add(new User("Eric", 17));
        users.add(new User("Rafael", 19));
        
        List<Person> personas = users.stream()
                                                    .map(user -> { //Mapea y hace return al nuevo objeto mapeado 
                                                    return new Person(user.getUsername(), "Desconocido", user.getAge());
                                                }).collect(Collectors.toList());
        System.out.println(personas);
        
        
    }

}
