package bot.blackhole;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.util.DiscordException;
import java.util.stream.Stream;

public class DefinitelyNotDave {

    public final static String COMMAND_KEY;
    public final static String LOGIN_TOKEN;

    public static IDiscordClient client;

    // do config stuff here
    private static void loadConfiguration() {
        // read from file here
        LOGIN_TOKEN = "MTgyMjg4MTA2MzgzMzQzNjE3.DuC4Ew.7zmGU-io7mjy6v-c80Irek_qzKM";
        COMMAND_KEY = "!";
    }

    public static void main(String[] args) throws DiscordException {
        loadConfiguration();
        client = new ClientBuilder().withToken(TOKEN).login();
        client.getDispatcher().registerListener(new CommandListener());
        // Add new commands here:
    }
}
