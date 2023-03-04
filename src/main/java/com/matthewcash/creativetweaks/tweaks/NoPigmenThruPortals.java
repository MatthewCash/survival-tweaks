package com.matthewcash.creativetweaks.tweaks;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalExitEvent;
import org.bukkit.entity.EntityType;

public class NoPigmenThruPortals implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityPortalExit(EntityPortalExitEvent event) {
        Entity entity = event.getEntity();

        if (entity.getType() != EntityType.ZOMBIFIED_PIGLIN)
            return;

        event.setCancelled(true);
    }
}
