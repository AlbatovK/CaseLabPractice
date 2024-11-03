package org.example;

public class WirelessPhone extends Phone  {

    private String model;

    private int batteryLife;

    public WirelessPhone(String model, int batteryLife) {
        super(model);
        this.batteryLife = batteryLife;
    }

    @Override
    public void call(int number) {
        super.call(number);
        System.out.println("From WirelessPhone!");
    }
}
