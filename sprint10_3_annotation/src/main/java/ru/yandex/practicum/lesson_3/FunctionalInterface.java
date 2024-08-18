package ru.yandex.practicum.lesson_3;

public @interface FunctionalInterface {
}

/* Указываем, что интерфейс должен рассматриваться как функциональный —
   то есть только с одним абстрактным методом. */
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);

    // раскомментируйте этот метод, а затем закомментируйте обратно,
    // чтобы увидеть, как компилятор реагирует на нарушение условий функционального интерфейса
    // int anotherOperation(int x, int y);
}
