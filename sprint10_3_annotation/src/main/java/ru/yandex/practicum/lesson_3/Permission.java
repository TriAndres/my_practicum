package ru.yandex.practicum.lesson_3;

public @interface Permission {
    // название разрешения — по умолчанию пусто
    String value() default "";
    // уровень разрешения — по умолчанию 1
    int level() default 1;
    // описание разрешения — по умолчанию пусто
    String description() default "";
}


//public @interface ru.yandex.practicum.lesson1_2.Permission {
//    // первый элемент: название разрешения
//    String value();
//    // второй элемент: уровень разрешения
//    int level();
//    // третий элемент: описание разрешения
//    String description();
//}

class User {
    private String username;
    private String password;

    public User(String username,String password) {
        this.username = username;
        this.password = password;
    }

    @Permission(value = "Чтение", level = 1, description = "Операция чтения данных пользователя")
    public String readUserData() {
        // логика чтения данных пользователя
        return "Данные пользователя " + username;
    }

    @Permission(value = "Запись", level = 2, description = "Операция записи данных пользователя")
    public void writeUserData(String newData) {
        // логика записи новых данных пользователя
        System.out.println("Данные пользователя обновлены " + username + ": " + newData);
    }

    @Permission(value = "Удаление", level = 3, description = "Операция удаления пользователя")
    public void deleteUser() {
        // логика удаления пользователя
        System.out.println("Пользователь " + username + " удалён");
    }
}

@Permission("Чтение")
class MyClass {
}