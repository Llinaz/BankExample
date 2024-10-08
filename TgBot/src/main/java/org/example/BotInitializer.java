package org.example;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public final class BotInitializer {

    private static final Logger LOG = LogManager.getLogger(BotInitializer.class);

    private static final String PROXY_HOST = "xx.xx.xxx.xxx";
    private static final int PROXY_PORT = 9999;

    public static void main(String[] args) {

        try {

            LOG.info("Initializing API context...");
            ApiContextInitializer.init();

            TelegramBotsApi botsApi = new TelegramBotsApi();

            LOG.info("Configuring bot options...");
            DefaultBotOptions botOptions = ApiContext.getInstance(DefaultBotOptions.class);

            botOptions.setProxyHost(PROXY_HOST);
            botOptions.setProxyPort(PROXY_PORT);
            botOptions.setProxyType(DefaultBotOptions.ProxyType.SOCKS4);

            LOG.info("Registering Anonymizer...");
            botsApi.registerBot(new AnonymizerBot(botOptions));

            LOG.info("Anonymizer bot is ready for work!");

        } catch (TelegramApiRequestException e) {
            LOG.error("Error while initializing bot!", e);
        }
    }
}