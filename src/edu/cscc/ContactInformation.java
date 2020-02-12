package edu.cscc;

/**
 * Created by 119770 on 2/11/2020.
 */
public class ContactInformation {
    private String name;
    private String email;

    public ContactInformation(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactInformation{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
