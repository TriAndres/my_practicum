package ru.yandex.practicum.lesson4.lesson_1_1.storege;


import ru.yandex.practicum.lesson4.lesson_1_1.user.User;

// интерфейс для сохранения и получения данных о пользователе
public interface Storage {
    void put(User user);
    User get(String email);
}
