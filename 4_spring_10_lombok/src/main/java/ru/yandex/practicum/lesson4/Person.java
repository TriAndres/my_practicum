package ru.yandex.practicum.lesson4;

import lombok.EqualsAndHashCode;

//@EqualsAndHashCode
//class Person {
//    private String firstName;
//    private String lastName;
//    private int age;
//    @EqualsAndHashCode.Exclude
//    private String phone;
//
//    public Person(String firstName, String lastName, int age, String phone) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.phone = phone;
//    }
//}
//
//class Practicum {
//    public static void main(String[] args) {
//        Person roman1 = new Person("Roman", "Igorev", 38, "+78889991234");
//        Person roman2 = new Person("Roman", "Igorev", 38, "");
//        if(roman1.equals(roman2)) {
//            System.out.println("Это один и тот же человек");
//        } else {
//            System.out.println("Это разные люди");
//        }
//    }
//}

// Исключаем поля age и phone из реализации методов equals и hashCode
@EqualsAndHashCode(exclude = {"age", "phone"})
class Person {
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