package pl.javastart.users;


public class User {
    private String firstName;
    private String lastName;
    private int age;

    public  User(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Imie brzmi: " + firstName + "<br>" + "Nazwisko to: " + lastName + "<br>" + "Wiek to: " + age + "<br>";
    }

}
