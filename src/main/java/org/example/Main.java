package org.example;

import java.util.Arrays;

public class Main {

    public static void fun(Object o) {
        System.out.println(o.toString());
    }

    public static void main(String[] args) {
        Phone phone = new Phone("123");
        fun(phone);
    }
}