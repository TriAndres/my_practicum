package ru.yandex.practicum;

class Animal {
    void makeSound() {
        System.out.println("Какой-то общий звук");
    }
}

class Cat extends Animal {

    /* Указываем, что реализация метода makeSound
       переопределяет реализацию этого же метода из класса ru.yandex.practicum.Animal. */
    @Override
    void makeSound() {
        System.out.println("Мяу");
    }
}

class Practicum0 {
    public static void main(String[] args){
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.makeSound();
        cat.makeSound();
    }
}
