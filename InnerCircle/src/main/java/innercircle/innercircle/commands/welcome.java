package innercircle.innercircle.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class welcome implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        // First we check if the sender of the command is a player and not the console
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command, you silly admin");
            return true;
        }

        Player player = (Player) sender;

        // command: /welcome
        if(command.getName().equalsIgnoreCase("welcome")){
            player.sendMessage("§9W§ce§6l§ec§2o§am§be §f" + player.getDisplayName() + ", remember to §cS§6l§ea§2y §ai§bt §3q§1u§9e§de§5n§f and live your best life!");
            //player.sendMessage("§4No griefing!");
        }

        return true;
    }
}
