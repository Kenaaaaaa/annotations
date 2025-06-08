package org.example.Author;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;
    private String gender;

    public Author(String gender, String lastName, String firstName) {
        this.gender = gender;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName) && Objects.equals(gender, author.gender);
    }
}