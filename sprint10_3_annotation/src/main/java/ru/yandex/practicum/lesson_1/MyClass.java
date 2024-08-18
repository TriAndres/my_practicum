package ru.yandex.practicum.lesson_1;

public class MyClass {
}

@interface ObjectInfo {
    Class<?> type() default Object.class;
    Class<?>[] args() default {};
    boolean required() default false;
}
