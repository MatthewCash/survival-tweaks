package com.matthewcash.creativetweaks;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.matthewcash.creativetweaks.tweaks.DeathMessage;
import com.matthewcash.creativetweaks.tweaks.NoEndermanPickup;
import com.matthewcash.creativetweaks.tweaks.NoPigmenThruPortals;

public class SurvivalTweaks extends JavaPlugin {
    private static SurvivalTweaks plugin;

    public static SurvivalTweaks getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;

        Bukkit.getPluginManager().registerEvents(new DeathMessage(), this);
        Bukkit.getPluginManager().registerEvents(new NoEndermanPickup(), this);
        Bukkit.getPluginManager()
            .registerEvents(new NoPigmenThruPortals(), this);

        getLogger().info("Enabled SurvivalTweaks!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled SurvivalTweaks!");
    }
}
