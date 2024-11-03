package org.example;

public class Phone {

    private String model;

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Phone with model " + model;
    }

    public void setModel(String model) {
        if (!model.isEmpty()) {
            this.model = model;
        }
    }

    public Phone(String model) {
        this.model = model;
    }

    public void ring(int number) {
        System.out.println("Ringing for " + number + " from model " + this.model);
    }

    public void call(int number) {
        System.out.println("Calling for " + number + " from model " + this.model);
    }
}
