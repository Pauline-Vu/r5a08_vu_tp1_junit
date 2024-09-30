package r5a08.tp1;

public class UserGreating {
    private String nom;

    public UserGreating() {
            
    }
    public String formatGreeting(String name){

        if (name.isEmpty())
            throw new UserGreatingFailureException("name is empty");

        if (name.size > 10)
            throw new UserGreatingFailureException("name should be no more than 10 characters");

        if (!name.contentEquals("^[a-zA-Z]+$"))
            throw new UserGreatingFailureException("name should not contains special characters and space ");


        return  "Bonjour, " + name ;
    }
}
