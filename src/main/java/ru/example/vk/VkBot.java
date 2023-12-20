package ru.example.vk;

import ru.example.bot.Bot;
import ru.example.bot.Logic;

/**
 * ВК бот
 */
public class VkBot implements Bot {
    private final Logic logic = new Logic();

    /**
     * Метод, который вызывается каждый раз при отправке сообщения пользователем
     */
    public void onUpdateReceived(String message) {
        logic.handleMessage(this, message);
    }

    /**
     * Запуск бота
     */
    public void start() {
        //TODO
    }

    @Override
    public void sendMessage(String message) {
        //TODO
    }
}
