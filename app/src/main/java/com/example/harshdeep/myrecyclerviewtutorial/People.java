package com.example.harshdeep.myrecyclerviewtutorial;

/**
 * Created by harshdeep on 15/10/17.
 */

public class People {
    private String firstName, lastName;

    public People(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}
