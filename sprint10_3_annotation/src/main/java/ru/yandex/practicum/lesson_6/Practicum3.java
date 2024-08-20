package ru.yandex.practicum.lesson_6;

import java.lang.reflect.Method;

public class Practicum3 {
    public void getData(String str, int num) {
        // реализация метода
    }

    private void printLog() {
        // реализация метода
    }

    public static void main(String[] args) {
        try {
            // получение конкретного метода
            Method method = Practicum3.class.getMethod("getData", String.class, int.class);
            System.out.println("Метод: " + method);

            // получение всех методов
            Method[] methods = Practicum3.class.getMethods();
            System.out.println("Все методы:");
            for (Method m : methods) {
                System.out.println(m);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

