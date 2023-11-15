package ru.example;

/**
 * Логика обработки входящего сообщения
 */
public interface Logic {
    /**
     * Обработка сообщения
     */
    void handleMessage(String message);
}
