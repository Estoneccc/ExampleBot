package ru.example.bot;

/**
 * Фейк-бот для улавливания сообщения, которое отправляется пользователю
 */
public class FakeBot implements Bot{
    private String message;
    public String getMessage() {
        return message;
    }

    @Override
    public void sendMessage(String message) {
        this.message = message;
    }
}
