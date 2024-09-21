package ru.yandex.practicum.lesson6;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Builder
public class User {
    // Детализированная информация о пользователе
    @NonNull
    private Details details;
    // Информация о покупках пользователя
    private PurchasesInformation purchasesInformation = new PurchasesInformation();
}

