package me.pardoescraft.core;

import com.skionz.pingapi.PingAPI;
import com.skionz.pingapi.PingEvent;
import com.skionz.pingapi.PingListener;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MichelFIX on 01/01/2017.
 * THIS IS MADE FOR OWN USAGE, NO PUBLIC USAGE, PUBLIC USAGE IS ONLY ON SERVER.PARDOESCRAFT.COM
 */
public class Events implements Listener {

    public static void setPingMessage() {
        PingAPI.registerListener(new PingListener() {
            @Override
            public void onPing(PingEvent pingEvent) {
                pingEvent.getReply().setMOTD(ChatColor.GOLD + "" + ChatColor.BOLD + "DisneycraftParis" + ChatColor.RESET + "" + ChatColor.GRAY + "Your magical Disney experience start here!");
                pingEvent.getReply().setProtocolName("Disneyland Core");
                List<String> sample = new ArrayList<String>();
                sample.add(ChatColor.GOLD + "" + ChatColor.BOLD + "DisneycraftParis");
                sample.add(" ");
                sample.add(ChatColor.GOLD + "You will now connect to the most magical themepark in Minecraft! Enjoy our rides, accomplish quests, play with friends and more! Join now and be a star!");
                sample.add(ChatColor.AQUA + " ");
                pingEvent.getReply().setPlayerSample(sample);
            }
        });
    }

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
