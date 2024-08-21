package ru.yandex.practicum.lesson3;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
class Person2 {
    private String firstName;
    private String lastName;
    private int age;
    @EqualsAndHashCode.Exclude
    private String phone;

    public Person2(String firstName, String lastName, int age, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
    }
}

public class Practicum3 {
    public static void main(String[] args) {
        Person2 roman1 = new Person2("Roman", "Igorev", 38, "+78889991234");
        Person2 roman2 = new Person2("Roman", "Igorev", 38, "");
        if(roman1.equals(roman2)) {
            System.out.println("Это один и тот же человек");
        } else {
            System.out.println("Это разные люди");
        }
    }
}

// Исключаем поля age и phone из реализации методов equals и hashCode
@EqualsAndHashCode(exclude = {"age", "phone"})
class Person3 {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
}

// Используем только поле isbn для генерации equals и hashCode
@EqualsAndHashCode(of = { "isbn" })
class Book {
    private String isbn;
    private String title;
    private String author;
}

// Вместо конструктора будет сгенерирован статический метод of
@AllArgsConstructor(staticName = "of")
class Point2 {
    private int x;
    private int y;
}

class Practicum4 {
    public static void main(String[] args) {
        // Используем статический метод of для создания объекта
        Point2 point2 = Point2.of(23, -12);
    }
}