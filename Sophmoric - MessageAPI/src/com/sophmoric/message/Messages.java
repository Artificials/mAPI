package com.sophmoric.message;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Messages implements Listener {
	
	@EventHandler
	public void PlayerJoin(PlayerJoinEvent e) {
		e.setJoinMessage(null);
	}
	
	@EventHandler
	public void playerQuit(PlayerQuitEvent e) {
		e.setQuitMessage(null);
	}
	
	public static String getPerm() {
		return ChatColor.DARK_RED + "You do not have permission to do this.";
	}
	
	public static String getConsole() {
		return ChatColor.DARK_RED + "You do not have permission to use console.";
	}
	
	public static String getPlayer() {
		return ChatColor.RED + "That player is either offline or invalid.";
	}
	
	public static String getData() {
		return ChatColor.DARK_RED + "You do not have permission to do this.";
	}
	
	public static String getLogin() {
		return ChatColor.GREEN + "Your profile has loaded!";
	}
	
	public static String color(String msg){
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
	long oldTime = System.currentTimeMillis();
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Everything loaded correctly in &6&l" + (System.currentTimeMillis() - oldTime) + "&6ms."));
	}
}
