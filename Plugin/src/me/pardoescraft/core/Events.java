package me.pardoescraft.core;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Created by MichelFIX on 01/01/2017.
 * THIS IS MADE FOR OWN USAGE, NO PUBLIC USAGE, PUBLIC USAGE IS ONLY ON SERVER.PARDOESCRAFT.COM
 */
public class Events implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (e.getPlayer().hasPlayedBefore()) {
            e.setJoinMessage(ChatColor.GOLD + "Welcome back, " + e.getPlayer().getName());
        } else {
            e.setJoinMessage(ChatColor.GOLD + "Welcome home, " + e.getPlayer().getName());
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        e.setQuitMessage("");
        // Nothing
    }
}
