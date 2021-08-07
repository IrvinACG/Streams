package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import streams.model.User;

/**
 *
 * @author Irvn Cruz
 */
public class Ejemplo02 {

    public static void main(String[] args) {
        //Generar Streams por diferentes formas
        
        //1- Coleccion
        List<User> users = new ArrayList<>();
        Stream<User> stream = users.stream(); //Abstraccion
        
        //2. Stream
        Stream<User> filter = stream.filter(user -> user.getAge() > 18);
        
        //3. Arreglo
        int numeros [] = {1,2,3,4};
        Stream numerosStream = Stream.of(numeros);
        
        //4. Secuencia
        Stream nombres = Stream.of("Raul","Juan","Alejandro");
    }
    
}
