package innercircle.innercircle;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import innercircle.innercircle.commands.icCommands;
import innercircle.innercircle.events.icEvents;

public final class InnerCircle extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // We first load the events class
        getServer().getPluginManager().registerEvents(new icEvents(), this);
        // Then we load all the commands we have made
        getCommand("welcome").setExecutor(new icCommands());
        getCommand("heal").setExecutor(new icCommands());
        getCommand("feedme").setExecutor(new icCommands());
        getCommand("postlocation").setExecutor(new icCommands());
        // When all is done we print a message to the console
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Inner Circle] Plugin enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Inner Circle] Plugin disabled!");
    }
}
