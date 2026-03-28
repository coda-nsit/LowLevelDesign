package Questions.LibrarySystem;

public abstract class User {
    String email;
    String name;

    public User(String email, String name){
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
