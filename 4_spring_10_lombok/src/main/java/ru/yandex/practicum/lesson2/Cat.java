package ru.yandex.practicum.lesson2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@ToString
public class Cat {
    private String color;
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

class Practicum {
    public static void main(String[] args) {
        final Cat cat = new Cat();
        cat.setColor("black");
        cat.setAge(5);
        System.out.println(cat);
    }
}
