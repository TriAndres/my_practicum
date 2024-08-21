package ru.yandex.practicum.lesson3.lesson_1_1.user;

import lombok.Data;
import lombok.NonNull;

@Data
public class User {
    // Детализированная информация о пользователе
    @NonNull
    private Details details;
    // Информация о покупках пользователя
    private PurchasesInformation purchasesInformation = new PurchasesInformation();

//    public Details getDetails() {
//        return details;
//    }
//
//    public void setDetails(final Details details) {
//        this.details = details;
//    }
//
//    public PurchasesInformation getPurchasesInformation() {
//        return purchasesInformation;
//    }
//
//    public void setPurchasesInformation(final PurchasesInformation purchasesInformation) {
//        this.purchasesInformation = purchasesInformation;
//    }
}
