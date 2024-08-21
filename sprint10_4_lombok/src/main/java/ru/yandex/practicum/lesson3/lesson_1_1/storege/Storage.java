package ru.yandex.practicum.lesson3.lesson_1_1.storege;

import ru.yandex.practicum.lesson3.lesson_1_1.user.User;

// Интерфейс для сохранения и получения данных о пользователе
public interface Storage {
    void put(User user);
    User get(String email);
}
