package lesson1;

public class User {
    private String name;
    private String lastname;
    private User(){}

    public User (String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    private String concatString (){
        return name + " " + lastname;

    }

    public String getName() {
        return name;
    }
    public String getLastname(){
        return lastname;
    }
}
