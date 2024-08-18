package ru.yandex.practicum.lesson_3;

@interface Configuration {
    String version();

    int timeout();
}

interface Configurations {
    void getConfig();

    void security();
}

@Configuration(version = "1.0", timeout = 15)
class MyAppConfig implements Configurations {
    @Override
    public void getConfig() {}

    @Override
    public void security() {}
}
