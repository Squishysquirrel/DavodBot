package bot.blackhole.commands;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.MessageBuilder;
import sx.blah.discord.util.MissingPermissionsException;
import sx.blah.discord.util.RateLimitException;

public abstract class Command {

	protected final IDiscordClient client;

	protected Command(IDiscordClient client) {
		this.client = client;
	}

	@EventSubscriber
	protected abstract void onCommandCall(CommandEvent event);
}
