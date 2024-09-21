package ru.yandex.practicum.lesson6;

import lombok.Data;

import java.util.Date;

// Информация о покупках пользователя
@Data
public class PurchasesInformation {
    // дата последней покупки
    private Date lastPurchase;
    // Общее количество покупок
    private long purchaseCounts = 0;
}

