package ru.example.bot;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тест класса {@link Logic}
 */
public class TestLogic {
    /**
     * Тест, проверяющий обработку сообщения в логике бота
     */
    @Test
    public void testHandleMessage(){
        FakeBot fakeBot = new FakeBot();
        Logic logic = new Logic();
        logic.handleMessage(fakeBot, "Привет");
        Assert.assertEquals("Ваше сообщение: Привет", fakeBot.getMessage());
    }
}
