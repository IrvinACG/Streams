package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import streams.model.User;

/**
 *
 * @author Irvn Cruz
 */
public class Ejemplo04 {

    public static void main(String[] args) {
        //Convertir a Listas

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Raul", 22));
        users.add(new User("Alejandro", 21));
        users.add(new User("Lilia", 20));
        users.add(new User("Eric", 17));
        users.add(new User("Rafael", 19));
        
        List<User> newUsers = users.stream().filter( user -> user.getAge() > 18).collect(Collectors.toList());
        
        System.out.println(newUsers);
        
    }

}
