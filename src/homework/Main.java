package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister persister = new Persister();
        persister.report(user);
        persister.save(new User("Bob"));
    }
}