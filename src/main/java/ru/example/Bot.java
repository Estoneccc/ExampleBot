package ru.example;

/**
 * Интерфейс бота для его запуска и отправки сообшения
 */
public interface Bot extends Logic {

    /**
     * Запсук бота
     */
    void start();

    /**
     * Бот отправляет сообщение
     */
    void sendMessage(String message);
}
