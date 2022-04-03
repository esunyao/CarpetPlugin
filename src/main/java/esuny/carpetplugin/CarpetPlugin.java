package esuny.carpetplugin;

import esuny.carpetplugin.commands.PlayerCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CarpetPlugin extends JavaPlugin {

    public static CarpetPlugin instance;
    private PlayerCommand playerCommand;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        playerCommand = new PlayerCommand();
        playerCommand.register();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
