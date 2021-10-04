package innercircle.innercircle;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import innercircle.innercircle.commands.feedme;
import innercircle.innercircle.commands.heal;
import innercircle.innercircle.commands.postlocation;
import innercircle.innercircle.commands.welcome;
import innercircle.innercircle.events.icEvents;


public final class InnerCircle extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // We first load the events class
        getServer().getPluginManager().registerEvents(new icEvents(), this);
        // Then we load all the commands we have made
        getCommand("welcome").setExecutor(new welcome());
        getCommand("heal").setExecutor(new heal());
        getCommand("feedme").setExecutor(new feedme());
        getCommand("postlocation").setExecutor(new postlocation());
        // When all is done we print a message to the console
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Inner Circle] Plugin enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Inner Circle] Plugin disabled!");
    }
}