package ru.example;

/**
 * Телеграмм бот
 */
public class TelgramBot implements Bot {

    @Override
    public void start() {
        //TODO
    }

    @Override
    public void sendMessage(String message) {
        //TODO
    }

    @Override
    public void handleMessage(String message) {
        String response = "Ваше сообщение: " + message;
    }
}
