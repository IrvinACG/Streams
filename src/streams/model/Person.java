package streams.model;

/**
 *
 * @author Irvn Cruz
 */
public class Person {
    private String name;
    private String apellidos;
    private int age;

    public Person(String name, String apellidos, int age) {
        this.name = name;
        this.apellidos = apellidos;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", apellidos=" + apellidos + ", age=" + age + '}';
    }
    
}
