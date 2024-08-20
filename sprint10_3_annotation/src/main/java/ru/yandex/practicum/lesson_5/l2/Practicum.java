package ru.yandex.practicum.lesson_5.l2;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@interface TextFile {
    String path();
}

class FileReader {
    /* Аннотируем метод — указываем, что тут нужен новый экземпляр
       типа @TextFile со значением элемента path, равным "tasks.txt". */
    @TextFile(path = "tasks.txt")
    public List<String> readTasks(File tasks) throws IOException {
        // ...
        return null;
    }

    /* Аннотируем метод — указываем, что тут нужен новый экземпляр
       типа @TextFile со значением элемента path, равным "orders.txt". */
    @TextFile(path = "orders.txt")
    public List<String> readOrders(File orders) throws IOException {
        // ...
        return null;
    }
}

public class Practicum {
    public static void main(String[] args) throws IOException {
        /* Во время выполнения программы будет создан новый экземпляр типа FileReader.
           Также при считывании аннотаций автоматически создадутся два экземпляра аннотации TextFile.
           Один экземпляр будет содержать значение "tasks.txt", а другой — "orders.txt". */
        FileReader reader = new FileReader();
    }
}
