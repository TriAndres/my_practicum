package ru.yandex.practicum.lesson2;

//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//
//// объявляем аннотацию @Role
//@Retention(RetentionPolicy.RUNTIME)
//@interface Role {
//    String value();
//}
//// используем аннотацию @Role: отмечаем класс AppUser
//@Role("Пользователь")
//class AppUser {
//    // реализация класса
//}

//////////////////////////////////////////////////////////////

//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
//@interface Role {
//    String value();
//}
//
//// раскомментируйте аннотацию, чтобы посмотреть, как поведёт себя компилятор
//// @Role("Администратор")
//class Practicum {
//
//    @Role("Пользователь")
//    public void getData(String str, int num) {
//        // реализация метода
//    }
//}
////////////////////////////////////////////////////////////

//import java.lang.annotation.*;
//
//@Inherited
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
//public @interface Role {
//    String value();
//}
//
//@Role("Пользователь")
//class User {
//    // код класса
//}
//// класс Admin неявно наследует аннотацию @Role от базового класса User
//class Admin extends User {
//    // код класса
//}

////////////////////////////////////////////////////////////////

//import java.lang.annotation.Repeatable;
//
//@Repeatable(Roles.class)
//public @interface Role {
//    String value();
//}
//
//// контейнер аннотаций для @Role
// @interface Roles {
//    Role[] value();
//}
//
//// пример использования @Role
//@Role("Администратор")
//@Role("Модератор")
//@Role("Пользователь")
//class UserRoles {
//    // код класса
//}

///////////////////////////////////////////////////////////////////////

import java.lang.annotation.*;

// мета-аннотация @Target указывает, что аннотация применима к методам
@Target(ElementType.METHOD)
// мета-аннотация @Retention указывает, что информация об аннотации будет доступна во время выполнения
@Retention(RetentionPolicy.RUNTIME)
// мета-аннотация @Repeatable указывает на класс-контейнер для повторяющихся аннотаций
@Repeatable(LoggableContainer.class)
@interface Loggable {
    String value() default "Лог по умолчанию";
}

// контейнерная аннотация для повторяющейся аннотации Loggable
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LoggableContainer {
    Loggable[] value();
}

class Service {

    // применяем аннотацию @Loggable к методу
    @Loggable("Пользовательский лог")
    public void performAction() {
        // логика метода
        System.out.println("Действие выполнено!");
    }

    // повторное применение аннотации Loggable, ведь она отмечена мета-аннотацией @Repeatable
    @Loggable("Пользовательский лог")
    @Loggable("Повторный пользовательский лог")
    public void additionalAction() {
        // логика метода
        System.out.println("Дополнительное действие выполнено!");
    }

    public void nonLoggedAction() {
        // логика метода без аннотации
        System.out.println("Действие без логирования!");
    }
}