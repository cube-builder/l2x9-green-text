package me.impurity.greentext;

import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Greentext extends JavaPlugin {
    public void onEnable() {
        getServer().getPluginManager().registerEvent(Event.Type.PLAYER_CHAT, (Listener)new Text(), Event.Priority.Normal, (Plugin)this);
        getCommand("fartbrazil").setExecutor(new FartBrazil());
    }

    public void onDisable() {}
}
