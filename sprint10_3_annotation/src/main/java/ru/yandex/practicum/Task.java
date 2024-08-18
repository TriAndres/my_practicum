package ru.yandex.practicum;

public @interface Task {
    String name();
    Priority priority();
}
 enum Priority {
    LOW, MEDIUM, HIGH
}

@Task(name = "Добавление функционала X", priority = Priority.HIGH)
class FeatureXImplementation {
    // код реализации
}

@Task(name = "Исправление бага Y", priority = Priority.MEDIUM)
class BugYFix {
    // код исправления
}