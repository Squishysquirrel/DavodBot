package bot.blackhole;

import org.apache.commons.lang3.ArrayUtils;

import bot.blackhole.AutoGM;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;
import sx.blah.discord.handle.obj.IMessage;

public class CommandListener {

	@EventSubscriber
	public void onCommandReceive(MessageReceivedEvent event) {
		String text = event.getMessage().getContent();
		if (!text.startsWith(AutoGM.COMMAND_KEY))
			return;
		String command;
		String[] args;
		IMessage message = event.getMessage();
		if (text.contains(" ")) {
			String[] parts = text.split(" ");
			command = parts[0].substring(1);
			args = ArrayUtils.removeElement(parts, parts[0]);
		} else {
			command = text.substring(1);
			args = null;
		}
		CommandEvent commandEvent = new CommandEvent(message, command, message.getAuthor(), args);
		DavodBot.client.getDispatcher().dispatch(commandEvent);
	}
}
