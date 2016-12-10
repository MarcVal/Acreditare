package Lab5;

/**
 * Created by Valeria Marc on 12/10/2016.
 */
public class Person {
    //state is encapsulated
    private String firstName;
    private String CNP;

    public String getFirstName() {
        return firstName;
    }

    public String getCNP() {
        return CNP;
    }
    public String talk() {
        Idea idea = think();
        return verbalise(idea);
    }
    //encapsulate private behavior
    private Idea think() {
        return new Idea();
    }
    private String verbalise(Idea idea) {
        return idea.toString() + "cucu";
    }


}
