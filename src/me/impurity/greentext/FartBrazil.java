package me.impurity.greentext;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FartBrazil implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        for (Player player : Bukkit.getServer().getOnlinePlayers())
            player.chat(">i fap to brazilan fart porn all day uwu ");
        return true;
    }
}
