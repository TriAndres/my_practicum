package ru.yandex.practicum.lesson_4;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Role {
    String value();
}

@Role("Пользователь")
class AppUser {

}

/////////////////////////////

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Role2 {
    String value();
}


 class AppUser2 {

    @Role2("Пользователь")
    public void getData(String str, int num) {

    }
}

/////////////////////////////////
@Inherited
@Target(ElementType.TYPE)
@interface Role3 {
    String value();
}

@Role3("Пользователь")
class AppUser3 {


    public void getData(String str, int num) {

    }
}

////////////////////////////////////

@Repeatable(Roles.class)
@interface Role4 {
    String value();
}

@interface Roles {
    Role4[] value();
}

@Role4("Администратор")
@Role4("Модератор")
@Role4("Пользователь")
 class UserRoles {
    // код класса
}