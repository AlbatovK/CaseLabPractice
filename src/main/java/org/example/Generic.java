package org.example;

class Container<T> implements Containable<T>, Comparable<Container<T>> {
    private T data;

    @Override
    public int compareTo(Container<T> o) {
        return 0;
    }

    public Container(T data) {
        this.data = data;
    }

    @Override
    public void setValue(T value) {
        this.data = value;
    }

    @Override
    public T getValue() {
        return this.data;
    }
}

interface Containable<T> {
    void setValue(T value);

    T getValue();
}

class StringContainer implements Containable<String> {
    @Override
    public void setValue(String value) {

    }

    @Override
    public String getValue() {
        return null;
    }
}


public class Generic {
    public static void main(String[] args) {
        Container<Number> numberContainer = new Container<>(10);
        Container<? super Integer> integerContainer = new Container<>(20);
    }

    public static <T> T findFirst(T[] array) {
        if (array.length == 0) {
            return null;
        }

        return array[0];
    }

    public static <T extends Comparable<T>> T findMax(T[] arr) {
        if (arr.length == 0) {
            return null;
        }

        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            T elem = arr[i];
            if (elem.compareTo(max) > 0) {
                max = elem;
            }
        }

        return max;
    }

}