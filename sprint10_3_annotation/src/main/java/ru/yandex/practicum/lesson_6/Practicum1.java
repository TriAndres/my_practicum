package ru.yandex.practicum.lesson_6;

import java.util.Set;

public class Practicum1 {

    public static void main(String[] args) {
        // тип переменной setClass — Class, и ей присвоен литерал класса Set
        Class<Set> setClass = Set.class;
        System.out.println(setClass); // выведет: interface java.util.Set
    }
}
