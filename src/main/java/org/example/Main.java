package org.example;


import java.util.*;

public class Main {

    public static void vector() {
        Vector<Integer> vector = new Vector<>(10);

        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);

        vector.add(1, 4);
        System.out.println(vector);

        vector.remove(2);

        System.out.println(vector);

        System.out.println(vector.contains(10));
        System.out.println(vector.contains(1));


        System.out.println(vector.isEmpty());

    }

    public static void stack() {
        Stack<String> stack = new Stack<>();


        // Добавление элементов в стек (push)
        stack.add("Первый");
        stack.add("Второй");
        stack.add("Третий");
        System.out.println("Стек после добавления элементов: " + stack);


        // Проверка вершины стека (peek) - не удаляет элемент
        String topElement = stack.peek();
        System.out.println("Верхний элемент стека: " + topElement);
        System.out.println("Стек без изменений: " + stack);


        // Удаление элемента из вершины стека (pop)
        String poppedElement = stack.pop();
        System.out.println("Удаленный элемент (pop): " + poppedElement);
        System.out.println("Стек после удаления элемента: " + stack);


        // Проверка, пуст ли стек (empty)
        boolean isEmpty = stack.empty();
        System.out.println("Стек пуст? " + isEmpty);


        // Поиск элемента в стеке (search) - возвращает позицию от вершины (1 - вершина)
        int searchResult = stack.search("Второй");
        System.out.println("Позиция элемента 'Второй' (от вершины): " + searchResult);


        // Получение размера стека (size)
        int size = stack.size();
        System.out.println("Размер стека: " + size);


        // Удаление всех элементов (clear)
        stack.clear();
        System.out.println("Стек после очистки: " + stack);


        //Пример добавления нескольких элементов
        stack.addAll(Arrays.asList("A", "B", "C"));
        System.out.println("Стек после добавления списка: " + stack);


        // Проверка на наличие элемента
        boolean containsB = stack.contains("B");
        System.out.println("Содержит ли стек 'B'? " + containsB);

    }

    public static void arrayList() {
        ArrayList<String> arrayList = new ArrayList<>();

        // Добавление элементов в ArrayList
        arrayList.add("Первый");
        arrayList.add("Второй");
        arrayList.add("Третий");
        System.out.println("ArrayList после добавления элементов: " + arrayList);

        // Добавление элемента в определенную позицию
        arrayList.add(1, "Вставленный");
        System.out.println("ArrayList после вставки элемента: " + arrayList);

        // Получение элемента по индексу
        String elementAtIndex2 = arrayList.get(2);
        System.out.println("Элемент на позиции 2: " + elementAtIndex2);

        // Удаление элемента по индексу
        arrayList.remove(0);
        System.out.println("ArrayList после удаления элемента: " + arrayList);

        // Удаление элемента по значению
        arrayList.remove("Вставленный");
        System.out.println("ArrayList после удаления элемента по значению: " + arrayList);

        // Удаление всех элементов
        arrayList.clear();
        System.out.println("ArrayList после очистки: " + arrayList);

        // Создание ArrayList из массива
        String[] strings = {"A", "B", "C"};
        List<String> arrayListFromArray = new ArrayList<>(Arrays.asList(strings));
        System.out.println("ArrayList из массива: " + arrayListFromArray);

        // Проверка размера
        int size = arrayListFromArray.size();
        System.out.println("Размер ArrayList: " + size);

        // Проверка на пустоту
        boolean isEmpty = arrayListFromArray.isEmpty();
        System.out.println("ArrayList пуст? " + isEmpty);

        // Проверка на наличие элемента
        boolean containsC = arrayListFromArray.contains("C");
        System.out.println("ArrayList содержит 'C'? " + containsC);

        //Получение подсписка
        List<String> subList = arrayListFromArray.subList(1, 3);
        System.out.println("Подсписок с 1 по 2 элемент: " + subList);

        //Замена элемента
        arrayListFromArray.set(0, "Z");
        System.out.println("ArrayList после замены первого элемента: " + arrayListFromArray);

    }

    public static void linkedList() {
        // Создание LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Добавление элементов в LinkedList
        linkedList.add("Первый");
        linkedList.add("Второй");
        linkedList.add("Третий");
        System.out.println("LinkedList после добавления элементов: " + linkedList);

        // Добавление элемента в начало (addFirst)
        linkedList.addFirst("В начале");
        System.out.println("LinkedList после добавления в начало: " + linkedList);

        // Добавление элемента в конец (addLast)
        linkedList.addLast("В конце");
        System.out.println("LinkedList после добавления в конец: " + linkedList);

        // Вставка элемента на определенную позицию
        linkedList.add(2, "Вставленный");
        System.out.println("LinkedList после вставки элемента: " + linkedList);

        // Получение элемента по индексу
        String elementAtIndex2 = linkedList.get(2);
        System.out.println("Элемент на позиции 2: " + elementAtIndex2);

        // Удаление первого элемента (removeFirst)
        linkedList.removeFirst();
        System.out.println("LinkedList после удаления первого элемента: " + linkedList);

        // Удаление последнего элемента (removeLast)
        linkedList.removeLast();
        System.out.println("LinkedList после удаления последнего элемента: " + linkedList);

        // Удаление элемента по значению
        linkedList.remove("Вставленный");
        System.out.println("LinkedList после удаления элемента по значению: " + linkedList);

        // Удаление всех элементов
        linkedList.clear();
        System.out.println("LinkedList после очистки: " + linkedList);


        // Проверка размера
        int size = linkedList.size();
        System.out.println("Размер LinkedList: " + size);


        // Проверка на пустоту
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("LinkedList пуст? " + isEmpty);

        //Добавление элементов
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

    }

    public static void set() {
        Set<String> hashSet = new HashSet<>();

        // Добавление элементов в HashSet. Дубликаты игнорируются.
        hashSet.add("Один");
        hashSet.add("Два");
        hashSet.add("Три");
        hashSet.add("Два"); // Дубликат, игнорируется
        System.out.println("HashSet после добавления элементов: " + hashSet);


        // Проверка размера HashSet
        int size = hashSet.size();
        System.out.println("Размер HashSet: " + size);

        // Проверка на пустоту
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("HashSet пуст? " + isEmpty);

        // Проверка на наличие элемента
        boolean containsTwo = hashSet.contains("Два");
        System.out.println("HashSet содержит 'Два'? " + containsTwo);

        // Удаление элемента
        hashSet.remove("Один");
        System.out.println("HashSet после удаления 'Один': " + hashSet);


        // Удаление всех элементов
        hashSet.clear();
        System.out.println("HashSet после очистки: " + hashSet);


        // терация по HashSet с помощью Iterator
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Дубликат

        System.out.print("терация по HashSet: ");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }

    public static void priorityQueue() {
        // Создание PriorityQueue по умолчанию (с естественным порядком)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Добавление элементов
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(1); // Дубликаты разрешены
        priorityQueue.add(2);
        System.out.println("PriorityQueue после добавления элементов: " + priorityQueue);

        // звлечение минимального элемента (poll)
        Integer minElement = priorityQueue.poll();
        System.out.println("звлеченный минимальный элемент (poll): " + minElement);
        System.out.println("PriorityQueue после извлечения: " + priorityQueue);

        // Проверка размера
        int size = priorityQueue.size();
        System.out.println("Размер PriorityQueue: " + size);

        // Проверка на пустоту
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("PriorityQueue пуст? " + isEmpty);

        // Проверка на наличие элемента
        boolean contains2 = priorityQueue.contains(2);
        System.out.println("PriorityQueue содержит 2? " + contains2);

        // Получение минимального элемента без удаления (peek)
        Integer peekElement = priorityQueue.peek();
        System.out.println("Минимальный элемент (peek): " + peekElement);
        System.out.println("PriorityQueue без изменений: " + priorityQueue);

        //спользование кастомного компаратора для изменения порядка сортировки
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); //Обратный порядок
        stringPriorityQueue.add("B");
        stringPriorityQueue.add("A");
        stringPriorityQueue.add("C");
        System.out.println("PriorityQueue строк с обратным порядком: " + stringPriorityQueue);

    }

    public static void deque() {
        // Создание ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // Добавление элементов в начало (addFirst) и конец (addLast)
        deque.addFirst(10);
        deque.addLast(20);
        deque.addLast(30);
        System.out.println("ArrayDeque после добавления элементов: " + deque);

        //Получение первого элемента (getFirst) и последнего элемента (getLast) без удаления
        System.out.println("Первый элемент (getFirst): " + deque.getFirst());
        System.out.println("Последний элемент (getLast): " + deque.getLast());
        System.out.println("ArrayDeque без изменений: " + deque);

        // Удаление первого элемента (removeFirst) и последнего элемента (removeLast)
        System.out.println("Удаленный первый элемент (removeFirst): " + deque.removeFirst());
        System.out.println("Удаленный последний элемент (removeLast): " + deque.removeLast());
        System.out.println("ArrayDeque после удаления элементов: " + deque);

        // Добавление элементов в начало и конец с помощью push и offerLast
        deque.push(100); //push - добавляет в начало, аналогично addFirst
        deque.offerLast(300); //offerLast - добавляет в конец, аналогично addLast
        System.out.println("ArrayDeque после push и offerLast: " + deque);

        // Удаление элементов из начала и конца с помощью pop и pollFirst
        System.out.println("Удаленный элемент (pop): " + deque.pop()); //pop - удаляет из начала, аналогично removeFirst
        System.out.println("Удаленный элемент (pollFirst): " + deque.pollFirst()); //pollFirst - удаляет из начала, аналогично removeFirst, возвращает null если пусто
        System.out.println("ArrayDeque после pop и pollFirst: " + deque);

        // Проверка на пустоту
        boolean isEmpty = deque.isEmpty();
        System.out.println("ArrayDeque пуст? " + isEmpty);

        // Проверка размера
        int size = deque.size();
        System.out.println("Размер ArrayDeque: " + size);


        //Пример добавления нескольких элементов
        deque.addAll(Arrays.asList(1,2,3));
        System.out.println("ArrayDeque после добавления списка: " + deque);

        // Очистка
        deque.clear();
        System.out.println("ArrayDeque после очистки: " + deque);

    }

    public static void map() {
        Map<String, Integer> hashMap = new HashMap<>();

        // Добавление элементов в HashMap. Ключи должны быть уникальны.
        hashMap.put("Один", 1);
        hashMap.put("Два", 2);
        hashMap.put("Три", 3);
        hashMap.put("Четыре", 4);
        System.out.println("HashMap после добавления элементов: " + hashMap);

        // Получение значения по ключу
        Integer valueForTwo = hashMap.get("Два");
        System.out.println("Значение для ключа 'Два': " + valueForTwo);

        // Проверка наличия ключа
        boolean containsKeyThree = hashMap.containsKey("Три");
        System.out.println("HashMap содержит ключ 'Три'? " + containsKeyThree);

        // Проверка наличия значения
        boolean containsValueOne = hashMap.containsValue(1);
        System.out.println("HashMap содержит значение 1? " + containsValueOne);


        // Удаление элемента по ключу
        hashMap.remove("Два");
        System.out.println("HashMap после удаления ключа 'Два': " + hashMap);

        // Удаление всех элементов
        hashMap.clear();
        System.out.println("HashMap после очистки: " + hashMap);


        // Проверка размера HashMap
        int size = hashMap.size();
        System.out.println("Размер HashMap: " + size);


        // Проверка на пустоту
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("HashMap пуст? " + isEmpty);

        // терация по HashMap
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Россия", "Москва");
        capitals.put("США", "Вашингтон");
        capitals.put("Франция", "Париж");

        System.out.println("терация по HashMap:");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println("Страна: " + entry.getKey() + ", Столица: " + entry.getValue());
        }

        // Замена значения по ключу
        capitals.put("США", "Нью-Йорк"); // Вашингтон заменяется на Нью-Йорк
        System.out.println("HashMap после замены значения: " + capitals);


        //Получение всех ключей
        Set<String> keys = capitals.keySet();
        System.out.println("Ключи HashMap: " + keys);


        //Получение всех значений
        Collection<String> values = capitals.values();
        System.out.println("Значения HashMap: " + values);

    }

    public static void collections() {
        String mercury = "Меркурий";
        String venus = "Венера";
        String earth = "Земля";
        String mars = "Марс";
        String jupiter = "Юпитер";
        String saturn = "Сатурн";
        String uranus = "Уран";
        String neptune = "Нептун";

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));

        Collections.sort(solarSystem);
        Collections.reverse(solarSystem);

        List<String> constant = Collections.unmodifiableList(solarSystem);
        constant.add("");
    }

    static class Person implements Comparable<Person> {

        @Override
        public int compareTo(Person o) {
            return this.age - o.getAge();
        }

        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person[name=" + name + ", age=" + age + "]";
        }
    }

    static class PersonComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void main(String[] args) {
//        ArrayList<Person> people = new ArrayList<>();
//        people.add(new Person("John", 29));
//        people.add(new Person("Mary", 31));
//        people.add(new Person("Bob", 12));
//        Collections.sort(people);
//        System.out.println(people);

        collections();
    }
}