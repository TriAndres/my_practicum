package ru.yandex.practicum.lesson_5.l1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

interface Readable {
    List<String> read() throws IOException;
}

// класс, реализующий Readable
class TextFile implements Readable {
    private final Path path;

    public TextFile(String path) {
        this.path = Paths.get(path);
    }

    @Override
    public List<String> read() throws IOException {
        return Files.readAllLines(path, StandardCharsets.UTF_8);
    }
}

public class Practicum {
    public static void main(String[] args) throws IOException {
        /* Во время выполнения программы будет создан новый экземпляр типа Readable
           с конкретным значением пути — tasks.txt. */
        Readable readable = new TextFile("tasks.txt");
        /* Использование метода экземпляра Readable.
           Во время выполнения программы будет возвращено
           текущее содержимое файла tasks.txt. */
        System.out.println(readable.read());
    }
}
