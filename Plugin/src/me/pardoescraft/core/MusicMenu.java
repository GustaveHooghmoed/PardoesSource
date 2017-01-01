package me.pardoescraft.core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

/**
 * Created by MichelFIX on 01/01/2017.
 * THIS IS MADE FOR OWN USAGE, NO PUBLIC USAGE, PUBLIC USAGE IS ONLY ON SERVER.PARDOESCRAFT.COM
 */

public class MusicMenu implements Listener, CommandExecutor {
    static boolean isOnline(String s) {
        return Bukkit.getPlayer(s) != null;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String name, String[] args) {
        if (cmd.getName().equalsIgnoreCase("musicmenu")) {
            if ((args.length < 1) || (args.length > 1)) {
                Player p = (Player) sender;
                Inventory inv = Bukkit.createInventory(null, 9, ChatColor.DARK_GRAY + "Music Menu");
                ItemStack is = new ItemStack(Material.JUKEBOX);
                ItemMeta imeta = is.getItemMeta();
                imeta.setDisplayName(ChatColor.DARK_GRAY + "Resourcepack");
                ArrayList<String> al2 = new ArrayList();
                al2.add(ChatColor.GRAY + " Click to download our resourcepack");
                imeta.setLore(al2);
                is.setItemMeta(imeta);
                ItemStack is1 = new ItemStack(Material.NOTE_BLOCK);
                ItemMeta imeta1 = is1.getItemMeta();
                imeta1.setDisplayName(ChatColor.DARK_GRAY + "DisneyAudio");
                ArrayList<String> al = new ArrayList();
                al.add(ChatColor.GRAY + " Not available");
                imeta1.setLore(al);
                is1.setItemMeta(imeta1);
                ItemStack is11 = new ItemStack(Material.REDSTONE_BLOCK);
                ItemMeta imeta11 = is11.getItemMeta();
                imeta11.setDisplayName(ChatColor.DARK_GRAY + "Exit");
                is11.setItemMeta(imeta11);
                inv.setItem(8, is11);
                inv.setItem(3, is);
                inv.setItem(5, is1);
                p.openInventory(inv);
            } else if ((isOnline(args[0])) &&
                    (sender.hasPermission("SOM.Admin"))) {
                Player p = (Player) sender;
                Inventory inv = Bukkit.createInventory(null, 9, ChatColor.DARK_GRAY + "Music Menu");
                ItemStack is = new ItemStack(Material.JUKEBOX);
                ItemMeta imeta = is.getItemMeta();
                imeta.setDisplayName(ChatColor.DARK_GRAY + "Resourcepack");
                ArrayList<String> al2 = new ArrayList();
                al2.add(ChatColor.GRAY + " Click to download our resourcepack");
                imeta.setLore(al2);
                is.setItemMeta(imeta);
                ItemStack is1 = new ItemStack(Material.NOTE_BLOCK);
                ItemMeta imeta1 = is1.getItemMeta();
                imeta1.setDisplayName(ChatColor.DARK_GRAY + "DisneyAudio");
                ArrayList<String> al = new ArrayList();
                al.add(ChatColor.GRAY + " Not available");
                imeta1.setLore(al);
                is1.setItemMeta(imeta1);
                ItemStack is11 = new ItemStack(Material.REDSTONE_BLOCK);
                ItemMeta imeta11 = is11.getItemMeta();
                imeta11.setDisplayName(ChatColor.DARK_GRAY + "Exit");
                is11.setItemMeta(imeta11);
                inv.setItem(8, is11);
                inv.setItem(3, is);
                inv.setItem(5, is1);
                p.openInventory(inv);
            }
        }
        return false;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equalsIgnoreCase(ChatColor.DARK_GRAY + "Music Menu")) {
            e.setCancelled(true);
            if ((e.getCurrentItem() != null) &&
                    (e.getCurrentItem().hasItemMeta())) {
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GRAY + "Resourcepack")) {
                    p.closeInventory();
                    p.setResourcePack("http://block.hosting/SOM.zip");
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GRAY + "DisneyAudio")) {
                    p.sendMessage("Nog niet af.");
                    p.closeInventory();
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GRAY + "Exit")) {
                    p.closeInventory();
                }
            }
        }
    }
}


