package innercircle.innercircle.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static org.bukkit.Bukkit.getServer;


public class postlocation implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        // First we check if the sender of the command is a player and not the console
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command, you silly admin");
            return true;
        }

        Player player = (Player) sender;

        // command: /postlocation
        if(command.getName().equalsIgnoreCase("postlocation")){
            int x = player.getLocation().getBlockX();
            int y = player.getLocation().getBlockY();
            int z = player.getLocation().getBlockZ();

            getServer().broadcastMessage(player.getDisplayName() + "'s location is: X(" + String.valueOf(x) + "), Y(" +  String.valueOf(y) + "), Z(" +  String.valueOf(z) + ")");
        }

        return true;
    }
}
