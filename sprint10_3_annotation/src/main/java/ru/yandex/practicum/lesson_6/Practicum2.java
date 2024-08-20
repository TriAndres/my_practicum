package ru.yandex.practicum.lesson_6;

import java.util.HashSet;
import java.util.Set;

public class Practicum2 {

    public static void main(String[] args) {
        // Тип переменной setOfStrings — Set, но конкретным классом объекта является HashSet
        Set<String> setOfStrings = new HashSet<>();
        /* Получаем представление класса объекта — в нашем случае это будет класс,
           расширяющий интерфейс Set, поэтому и параметр типа записан как <? extends Set>. */
        Class<? extends Set> clazz = setOfStrings.getClass();
        System.out.println(clazz); // Выведет class java.util.HashSet
    }
}
