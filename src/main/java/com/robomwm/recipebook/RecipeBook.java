package com.robomwm.recipebook;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created on 3/9/2019.
 *
 * @author RoboMWM
 */
public class RecipeBook extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getCommand("recipebook").setExecutor(new RecipeBookSearchCommand(this, new YamlConfiguration()));
    }
}
