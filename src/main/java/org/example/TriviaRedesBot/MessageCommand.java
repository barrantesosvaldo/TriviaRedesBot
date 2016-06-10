package org.example.TriviaRedesBot;

import io.github.nixtabyte.telegram.jtelebot.client.RequestHandler;
import io.github.nixtabyte.telegram.jtelebot.exception.JsonParsingException;
import io.github.nixtabyte.telegram.jtelebot.exception.TelegramServerException;
import io.github.nixtabyte.telegram.jtelebot.request.TelegramRequest;
import io.github.nixtabyte.telegram.jtelebot.request.factory.TelegramRequestFactory;
import io.github.nixtabyte.telegram.jtelebot.response.json.Message;
import io.github.nixtabyte.telegram.jtelebot.server.impl.AbstractCommand;

public class MessageCommand extends AbstractCommand {

	public MessageCommand(Message message, RequestHandler requestHandler) {
		super(message, requestHandler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		try {
            TelegramRequest telegramRequest = TelegramRequestFactory.
            		createSendMessageRequest(
            				message.getChat().getId(), 
            				"Hello World!", 
            				true, 
            				message.getId(), 
            				null);
            requestHandler.sendRequest(telegramRequest);
        } catch (TelegramServerException | JsonParsingException e) {
            e.printStackTrace();
        }
	}

}
