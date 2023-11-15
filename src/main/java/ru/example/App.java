package ru.example;

public class App 
{
    public static void main( String[] args ) {
        Bot telegramBot = new TelgramBot();
        Bot vkBot = new VkBot();
        telegramBot.start();
        vkBot.start();
    }
}
