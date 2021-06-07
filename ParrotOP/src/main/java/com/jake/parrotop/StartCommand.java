package com.jake.parrotop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StartCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("parrotop.toggle")) {
               if (args.length == 1) {
                   if (args[0].equalsIgnoreCase("start")) {
                       if (!ParrotOP.isStarted) {
                           ParrotOP.isStarted = true;
                           Bukkit.broadcastMessage(ChatColor.AQUA + "[ParrotOP] " + ChatColor.GRAY + "Minecraft, but parrots are OP challenge has " + ChatColor.GREEN + "started" + ChatColor.GRAY + "!");
                       } else {
                           sender.sendMessage(ChatColor.AQUA + "[ParrotOP] " + ChatColor.RED + "The challenge has already started!");
                       }
                   } else if (args[0].equalsIgnoreCase("stop")) {
                       if (ParrotOP.isStarted) {
                           ParrotOP.isStarted = false;
                           Bukkit.broadcastMessage(ChatColor.AQUA + "[ParrotOP] " + ChatColor.GRAY + "Minecraft, but parrots are OP challenge has " + ChatColor.RED + "ended" + ChatColor.GRAY + "!");
                       } else {
                           sender.sendMessage(ChatColor.AQUA + "[ParrotOP] " + ChatColor.RED + "The challenge hasn't started yet!");
                       }
                   } else {
                       sender.sendMessage(ChatColor.AQUA + "[ParrotOP] " + ChatColor.RED + "/parrotop <start/stop>");
                   }
               } else {
                   sender.sendMessage(ChatColor.AQUA + "[ParrotOP] " + ChatColor.RED + "/parrotop <start/stop>");
               }
            } else {
                sender.sendMessage(ChatColor.AQUA + "[ParrotOP] " + ChatColor.RED + "You do not have permission to run that command!");
            }
        } else {
            sender.sendMessage(ChatColor.AQUA + "[ParrotOP] " + ChatColor.RED + "Only players can use that command!");
        }

        return false;
    }

}
