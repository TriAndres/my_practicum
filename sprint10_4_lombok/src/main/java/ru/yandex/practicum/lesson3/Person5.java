package ru.yandex.practicum.lesson3;

import lombok.Data;
import lombok.NonNull;

@Data
public class Person5 {
    @NonNull
    private final String name;
    private final int age;
    private String profession;
    private String email;
}

class Persons {
    public static void main(String[] args) {
        final Person5 personBob = new Person5("null", 30);
    }
}