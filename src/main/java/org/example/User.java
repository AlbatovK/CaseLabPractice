package org.example;

public class User {

    private String name;
    private int number;

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }


    public User(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void callUser(User user, Phone phone) {
        phone.call(user.getNumber());
        System.out.println("User " + this.name + " is calling " + user.getName());
    }
}
