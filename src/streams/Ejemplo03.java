package streams;

import java.util.ArrayList;
import java.util.stream.Stream;
import streams.model.User;

/**
 *
 * @author Irvn Cruz
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        //Tipos de metodos
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Raul", 22));
        users.add(new User("Alejandro", 21));
        users.add(new User("Lilia", 20));
        users.add(new User("Eric", 17));
        users.add(new User("Rafael", 19));

        //1. Proceso
        //2. Iteracion interna
        //2.1 Filter -> Abstraccion ->Retorna un Nuevo Stream
        Stream<User> userStream = users.stream();
        System.out.println(userStream.filter(user -> user.getAge() > 18));

        //2.2 Count -> Retornoa un Valor en concreto
        Stream<User> userStream2 = users.stream();
        System.out.println(userStream2.filter(user -> user.getAge() > 18).count());
    }

}
