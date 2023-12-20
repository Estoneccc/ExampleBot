package ru.example;

import ru.example.telegram.TelegramBot;
import ru.example.vk.VkBot;

public class Main
{
    public static void main( String[] args ) {
        TelegramBot telegramBot = new TelegramBot();
        telegramBot.start();

        VkBot vkBot = new VkBot();
        vkBot.start();
    }
}
