package ru.yandex.practicum.lesson3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
class Cat {
    private String color;
    private int age;

//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "color='" + color + '\'' +
//                ", age=" + age +
//                '}';
//    }
}

public class Practicum {
    public static void main(String[] args) {
        final Cat cat = new Cat();
        cat.setColor("black");
        cat.setAge(5);
        System.out.println(cat);
    }
}