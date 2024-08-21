package ru.yandex.practicum.lesson3;

import lombok.Data;

@Data
/*
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
 */
public class Person4 {
    private final String name;
    private final int age;
    private String profession;
    private String email;
}
