package bot.blackhole.commands;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventSubscriber;

import bot.blackhole.CommandEvent;

public abstract class Command {

	protected final IDiscordClient client;

	protected Command(IDiscordClient client) {
		this.client = client;
	}

	@EventSubscriber
	protected abstract void onCommandCall(CommandEvent event);
}
