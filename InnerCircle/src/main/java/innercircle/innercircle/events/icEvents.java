package innercircle.innercircle.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class icEvents implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        player.sendMessage("§9W§ce§6l§ec§2o§am§be §f" + player.getDisplayName() + ", remember to §cS§6l§ea§2y §ai§bt §3q§1u§9e§de§5n§f and live your best life!");
        if(player.getDisplayName().equals("Pwiena")){
            player.sendMessage(ChatColor.BLUE + "Niels: Tu sei mi dolce amore <3!");
        }
    }
}
