package ru.yandex.practicum.lesson5;

import lombok.Data;
import lombok.NonNull;

@Data
public class Person {
    @NonNull
    private final String name;
    private final int age;
    private String profession;
    private String email;
}

class Persons {
    public static void main(String[] args) {
        final Person personBob = new Person(null, 30);
    }
}