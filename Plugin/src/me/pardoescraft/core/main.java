package me.pardoescraft.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by MichelFIX on 01/01/2017.
 * THIS IS MADE FOR OWN USAGE, NO PUBLIC USAGE, PUBLIC USAGE IS ONLY ON SERVER.PARDOESCRAFT.COM
 */
public class main extends JavaPlugin {

    public void onEnable(){
        registerEvents();
    }

    private void registerEvents() {
        PluginManager plm = Bukkit.getPluginManager();
        plm.registerEvents(new Events(), this);
    }

    public void onDisable(){

    }
}
