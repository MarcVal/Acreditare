package Lab4;

/**
 * Created by Valeria Marc on 12/9/2016.
 */
public class Person {
    private static int index = 0;

    private int id;
    private String firstName;

    public Person (String firstName) {
        this.firstName = firstName;
        this.id = index;
        index++;
    }
    public String print() {
        return id + firstName;
    }
    public String getFirstName() {
        return  firstName;
    }
    public int getId() {
        return id;
    }
}
