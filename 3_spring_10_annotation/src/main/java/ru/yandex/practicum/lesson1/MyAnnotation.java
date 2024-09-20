package ru.yandex.practicum.lesson1;

public @interface MyAnnotation {
}
class MyClass {
    @MyAnnotation
    private String myField;

    @MyAnnotation
    public void myMethod() {
        // код метода
    }
}
