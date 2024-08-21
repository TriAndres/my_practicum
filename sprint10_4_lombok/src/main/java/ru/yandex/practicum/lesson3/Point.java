package ru.yandex.practicum.lesson3;

import lombok.Getter;
import lombok.Setter;

class Point {
    // Для поля x будет сгенерирован только геттер
    @Getter
    private int x;

    // Для поля y будут сгенерированы и геттер, и сеттер
    @Getter
    @Setter
    private int y;
}
