package ru.example.bot;

/**
 * Класс, отвечающий за логику бота
 */
public class Logic {

    /**
     * Метод, обрабатывающий сообщение
     * @param message сообщение пользователя
     */
    public void handleMessage(Bot bot, String message) {
        bot.sendMessage("Ваше сообщение: " + message);
    }
}