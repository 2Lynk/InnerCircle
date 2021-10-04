package innercircle.innercircle.commands;

import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class heal implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        // First we check if the sender of the command is a player and not the console
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command, you silly admin");
            return true;
        }

        Player player = (Player) sender;

        // command: /heal
        if(command.getName().equalsIgnoreCase("heal")){
            double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
            player.setHealth(maxHealth);
            player.sendMessage("§2§o(!) Healing!");
        }

        return true;
    }
}
