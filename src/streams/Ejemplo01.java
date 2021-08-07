package streams;

import java.util.ArrayList;
import streams.model.User;

/**
 *
 * @author Irvn Cruz
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        //Obtener numero de personas mayores  a 18
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Raul", 22));
        users.add(new User("Alejandro", 21));
        users.add(new User("Lilia", 20));
        users.add(new User("Eric", 17));
        users.add(new User("Rafael", 19));

        long cantidad = users.stream().count();
        System.out.println("Cantidad: " + cantidad);

        //Filter es una condicion, que retorna un booleano y retorna un nuevo stram, donde se pueden hacer mas operaciones
        cantidad = users.stream()
                .filter(user -> user.getAge() > 18) //true o false
                .filter( user -> user.getUsername().startsWith("R"))
                .count();
        System.out.println("Cantidad con filtro 18: " + cantidad);
    }

}
