package innercircle.innercircle.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class feedme implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        // First we check if the sender of the command is a player and not the console
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command, you silly admin");
            return true;
        }

        Player player = (Player) sender;

        // command: /feedme
        if(command.getName().equalsIgnoreCase("feedme")) {
            player.setFoodLevel(20);
            player.sendMessage("§9§o(!) You are well fed!");
        }

        return true;
    }
}
