package ru.yandex.practicum.lesson4.lesson_1_1.user;

import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Value
@Builder
public class PurchasesInformation {
    private Date lastPurchase;
    private long purchaseCounts = 0;
}