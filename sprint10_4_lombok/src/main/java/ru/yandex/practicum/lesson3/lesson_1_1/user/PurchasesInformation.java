package ru.yandex.practicum.lesson3.lesson_1_1.user;

import lombok.Data;

import java.util.Date;
@Data
// Информация о покупках пользователя
public class PurchasesInformation {
    // дата последней покупки
    private Date lastPurchase;
    // Общее количество покупок
    private long purchaseCounts = 0;

//    public Date getLastPurchase() {
//        return lastPurchase;
//    }
//
//    public void setLastPurchase(final Date lastPurchase) {
//        this.lastPurchase = lastPurchase;
//    }
//
//    public long getPurchaseCounts() {
//        return purchaseCounts;
//    }
//
//    public void setPurchaseCounts(final long purchaseCounts) {
//        this.purchaseCounts = purchaseCounts;
//    }
}
