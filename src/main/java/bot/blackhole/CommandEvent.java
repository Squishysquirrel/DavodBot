package bot.blackhole;

import sx.blah.discord.api.events.Event;
import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.handle.obj.IUser;

public class CommandEvent extends Event {

	private final IMessage message;
	private final String command;
	private final IUser issuer;
	private final String[] args;

	public CommandEvent(IMessage message, String command, IUser issuer, String[] args) {
		this.message = message;
		this.command = command;
		this.issuer = issuer;
		this.args = args;
	}

	public IMessage getMessage() {
		return message;
	}

	public String getCommand() {
		return command;
	}

	public IUser getIssuer() {
		return issuer;
	}

	public String[] getArgs() {
		return args;
	}

	public boolean hasArgs() {
		return args != null;
	}
}
