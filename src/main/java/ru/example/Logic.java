package ru.example;

public class Logic {
    private Bot telegramBot;
    private Bot otherPlatformBot;

    public Logic(Bot telegramBot, Bot otherPlatformBot) {
        this.telegramBot = telegramBot;
        this.otherPlatformBot = otherPlatformBot;
    }

    public void startBots() {
        telegramBot.start();
        otherPlatformBot.start();
    }

    /**
     * Обработка сообщения
     */
    public void HandleMessage(String message) {
        String response = "Ваше сообщение: " + message;

        telegramBot.sendMessage(response);
        otherPlatformBot.sendMessage(response);
    }
}
