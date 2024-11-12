package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.ClosedChannelException;

class Sample {
    private final String str;

    public Sample() {
        this.str = "Java Reflection API";
    }

    public void printString() {
        System.out.println("Private string info - " + this.str);
    }

    public void printNumber(int x) {
        System.out.println("X value is " + x);
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Sample obj = new Sample();

        Class<? extends Sample> cls = obj.getClass();

        System.out.println("Class Name - " + cls.getName());

        Constructor<? extends Sample> constructor = cls.getConstructor();

        System.out.println("Constructor name - " + constructor.getName());

        Sample s = constructor.newInstance();
        s.printString();

        Method[] methods = cls.getMethods();

        for (Method method: methods) {
            System.out.println(method.getName());
        }

        Method printNumberMethod = cls.getDeclaredMethod("printNumber", int.class);
        printNumberMethod.invoke(obj, 100);

        Method privateMethodCall = cls.getDeclaredMethod("privateMethod");
        privateMethodCall.setAccessible(true);
        privateMethodCall.invoke(obj);

        Field field = cls.getDeclaredField("str");
        field.setAccessible(true);
        obj.printString();
        field.set(obj, "New value changed with Reflection API");
        obj.printString();

    }

//        try (FileWriter writer = new FileWriter("input.txt", true)) {
//
//           writer.append('a');
//           writer.append("Hello world!");
//           writer.flush();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


    public static void staticExceptionCall(int a) throws CloneNotSupportedException, ClosedChannelException {
        if (a == 1) {
            throw new CloneNotSupportedException();
        } else {
            anotherCall();
        }
    }

    public static void anotherCall() throws ClosedChannelException {
        throw new ClosedChannelException();
    }
}

class ValidationException extends RuntimeException {
    private String errorMessage;

    private String field;

    public ValidationException(String field, String errorMessage) {
        super("Problem " + field + ": " + errorMessage);
    }
}

class User {
    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        if (name.length() < 3) {
            throw new ValidationException("Name", "must be longer than 2 characters");
        }

        this.name = name;
    }
}