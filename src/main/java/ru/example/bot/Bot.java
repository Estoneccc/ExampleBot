package ru.example.bot;

/**
 * Интерфейс бота, который умеет отправлять сообщение
 */
public interface Bot {
    /**
     * Бот отправляет сообщение
     */
    void sendMessage(String message);
}
