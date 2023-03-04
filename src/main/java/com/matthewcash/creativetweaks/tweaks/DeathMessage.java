package com.matthewcash.creativetweaks.tweaks;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.entity.Player;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.Placeholder;

public class DeathMessage implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getPlayer();

        Location location = player.getLocation();

        String positionString = String.format(
            "%d, %d, %d",
            location.getBlockX(),
            location.getBlockY(),
            location.getBlockZ()
        );

        String dimensionString = location.getWorld().getName().toLowerCase()
            .contains("nether")
                ? "The Nether"
                : (location.getWorld().getName().toLowerCase().contains("end")
                    ? "The End"
                    : "The Overworld");

        Component message = MiniMessage.miniMessage().deserialize(
            "<bold><aqua>You died at <white><position></white> in <white><dimension></white></aqua></bold>",
            Placeholder.unparsed("position", positionString),
            Placeholder.unparsed("dimension", dimensionString)
        );

        player.sendMessage(message);
    }
}
