package ru.yandex.practicum.lesson3.lesson_1_1.user;

import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
// Детализированная информация о пользователе
public class Details {
    // Электронная почта
    @NonNull
    private String email;
    // Имя
    @NonNull
    private String firstName;
    // Фамилия
    @NonNull
    private String lastName;

    // Дополнительная информация
    private String information;
    // Дата рождения
    private Date dayOfBirthday;
    // Пол
    private Gender gender = Gender.UNKNOWN;

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(final String email) {
//        this.email = email;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(final String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(final String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getInformation() {
//        return information;
//    }
//
//    public void setInformation(final String information) {
//        this.information = information;
//    }
//
//    public Date getDayOfBirthday() {
//        return dayOfBirthday;
//    }
//
//    public void setDayOfBirthday(final Date dayOfBirthday) {
//        this.dayOfBirthday = dayOfBirthday;
//    }
//
//    public Gender getGender() {
//        return gender;
//    }
//
//    public void setGender(final Gender gender) {
//        this.gender = gender;
//    }
}
