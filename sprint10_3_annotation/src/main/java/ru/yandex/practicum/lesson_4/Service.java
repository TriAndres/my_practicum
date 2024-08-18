package ru.yandex.practicum.lesson_4;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(LoggableContainer.class)
@interface Loggable {
    String value() default "лог по умолчанию";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LoggableContainer {
    Loggable[] value();
}
public class Service {

    @Loggable("Пользовательский лог")
    public void performAction() {
        System.out.println("Действие выполнено!");
    }

    @Loggable("Пользовательский лог")
    @Loggable("Повторный пользовательский лог")
    public void additionalAction() {
        System.out.println("Дополнительное действие выполнено!");
    }

    public void nonLoggedAction() {
        System.out.println("Действие без логирования!");
    }
}
