package ru.example;

public interface Bot {
    /**
     * Запсук бота
     */
    void start();

    /**
     * Бот отправляет сообщение
     */
    void sendMessage(String message);
}
