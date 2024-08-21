package ru.yandex.practicum.lesson4;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

public class Practucum {

    @Data
    @Builder
    public static class House {
        @NonNull
        private int wallWidth;
        @NonNull
        private int wallLength;
        @NonNull
        private String wallsColor;
        @Builder.Default
        private int wallHeight = 2500;
        @Builder.Default
        private int numberOfWindows = 6;
        @Builder.Default
        private int numberOfFloors = 1;

        public int calculateTotalArea() {
            return wallWidth * wallLength * numberOfFloors;
        }
    }

    public static void main(String[] args) {
        final House house = House.builder()
                .wallsColor("red")
                .wallWidth(15)
                .wallLength(12)
                .numberOfFloors(2)
                .build();

        System.out.println(house);
        System.out.println("Общая площадь = " + house.calculateTotalArea());
    }
}
