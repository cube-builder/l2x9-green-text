package me.impurity.greentext;

import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

public class Text extends PlayerListener {
    public void onPlayerChat(PlayerChatEvent event) {
        if (event.getMessage().startsWith(">"))
            event.setMessage(ChatColor.GREEN + event.getMessage());
    }
}
