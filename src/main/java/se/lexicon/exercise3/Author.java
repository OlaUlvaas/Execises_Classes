package se.lexicon.exercise3;

public class Author {
    private static int authorId = 0;
    private String firstName;
    private String lastName;
    private String nationality;
    private String email;

    public Author(){
        authorId = getAuthorId();
        authorId++;
    }

    public Author(String firstName, String lastName, String nationality, String email){
        authorId = getAuthorId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.email = email;
        authorId++;
    }


    public static int getAuthorId() {
        return authorId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
