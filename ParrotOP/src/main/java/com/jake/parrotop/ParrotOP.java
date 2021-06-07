package com.jake.parrotop;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ParrotOP extends JavaPlugin {

    public static ParrotOP plugin;

    public static boolean isStarted = false;

    @Override
    public void onEnable() {
        getCommand("parrotop").setExecutor(new StartCommand());
        Bukkit.getPluginManager().registerEvents(new ParrotListener(), this);
    }
}
