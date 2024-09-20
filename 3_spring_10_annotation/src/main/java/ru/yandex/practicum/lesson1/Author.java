package ru.yandex.practicum.lesson1;

public @interface Author {
    String name();

    String title();
}

@interface TaskInfo {
    String description();

    Author[] authors() default {};
}

@TaskInfo(description = "Реализация функционала входа", authors = {
        @Author(name = "Иван Иванов", title = "Инженер-программист"),
        @Author(name = "Антон Сергеев", title = "Дизайнер интерфейса")
})
class LoginFeature {
    // код реализации
}