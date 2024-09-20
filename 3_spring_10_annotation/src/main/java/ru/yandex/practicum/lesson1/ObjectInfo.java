package ru.yandex.practicum.lesson1;

@interface ObjectInfo {
    Class<?> type() default Object.class;
    Class<?>[] args() default {};
    boolean required() default false;
}

// Класс для аннотирования
@ObjectInfo(type = MyClasse.class)
class MyClasse {

    // Элементы класса
    @ObjectInfo(type = String.class)
    private String myField;

    // Конструктор
    @ObjectInfo(type = MyClasse.class, args = {int.class}, required = true)
    public MyClasse(int initialValue) {
        // Код конструктора
    }

    // Метод
    @ObjectInfo(type = void.class, args = {int.class, String.class}, required = true)
    public void myMethod(int number, String text) {
        // Код метода
    }
}
