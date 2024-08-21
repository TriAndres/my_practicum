package ru.yandex.practicum.lesson4.lesson_1_1.user;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import ru.yandex.practicum.lesson4.lesson_1_1.storege.Gender;

import java.util.Date;

@Data
@Builder
public class Details {
    @NonNull
    private String email;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;

    private String information;
    private Date dayOfBirthday;
    @Builder.Default
    private Gender gender = Gender.UNKNOWN;
}
