package r5a08.tp1;

public class UserGreating {
    private String nom;

    public UserGreating() {
            
    }
    public String formatGreeting(String name){

        if (name.isEmpty())
            throw new UserGreatingFailureException("name is empty");

        return  "Bonjour, " + name ;
    }
}
