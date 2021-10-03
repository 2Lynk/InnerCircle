package innercircle.innercircle.commands;

import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class icCommands implements CommandExecutor {

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

        // command: /heal
        if(command.getName().equalsIgnoreCase("heal")){
            double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
            player.setHealth(maxHealth);
            player.sendMessage("§2§o(!) Healing!");
        }

        // command: /feedme
        if(command.getName().equalsIgnoreCase("feedme")){
            player.setFoodLevel(20);
            player.sendMessage("§9§o(!) You are well fed!");
        }

        return true;
    }
}
