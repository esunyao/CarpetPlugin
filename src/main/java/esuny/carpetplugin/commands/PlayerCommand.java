package esuny.carpetplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

public class PlayerCommand extends CommandException {

    public void register(){
        if (Bukkit.getPluginCommand("spawn") != null) {
            Bukkit.getPluginCommand("spawn").setExecutor(new CommandExecutor() {
                @Override
                public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
                    if (args.length == 0) {
                        return false;
                    }
                    Player player = Bukkit.getPlayer(args[0]);
                    if (player == null) {
                        return true;
                    }
                    player.setHealth(0);
                    return true;
                }
            });
        }
        if (Bukkit.getPluginCommand("spawn") != null) {
            Bukkit.getPluginCommand("spawn").setExecutor(new CommandExecutor() {
                @Override
                public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
                    if (args.length == 0) {
                        return false;
                    }
                    Player player = Bukkit.getPlayer(args[0]);
                    if (player == null) {
                        return true;
                    }
                    player.setHealth(0);
                    return true;
                }
            });
        }
        if (Bukkit.getPluginCommand("spawn") != null) {
            Bukkit.getPluginCommand("spawn").setExecutor(new CommandExecutor() {
                @Override
                public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
                    if (args.length == 0) {
                        return false;
                    }
                    Player player = Bukkit.getPlayer(args[0]);
                    if (player == null) {
                        return true;
                    }
                    player.setHealth(0);
                    return true;
                }
            });
        }
        if (Bukkit.getPluginCommand("spawn") != null) {
            Bukkit.getPluginCommand("spawn").setExecutor(new CommandExecutor() {
                @Override
                public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
                    if (args.length == 0) {
                        return false;
                    }
                    Player player = Bukkit.getPlayer(args[0]);
                    if (player == null) {
                        return true;
                    }
                    player.setHealth(0);
                    return true;
                }
            });
        }
        if (Bukkit.getPluginCommand("spawn") != null) {
            Bukkit.getPluginCommand("spawn").setExecutor(new CommandExecutor() {
                @Override
                public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
                    if (args.length == 0) {
                        return false;
                    }
                    Player player = Bukkit.getPlayer(args[0]);
                    if (player == null) {
                        return true;
                    }
                    player.setHealth(0);
                    return true;
                }
            });
        }if (Bukkit.getPluginCommand("spawn") != null) {
            Bukkit.getPluginCommand("spawn").setExecutor(new CommandExecutor() {
                @Override
                public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
                    if (args.length == 0) {
                        return false;
                    }
                    Player player = Bukkit.getPlayer(args[0]);
                    if (player == null) {
                        return true;
                    }
                    player.setHealth(0);
                    return true;
                }
            });
        }if (Bukkit.getPluginCommand("spawn") != null) {
            Bukkit.getPluginCommand("spawn").setExecutor(new CommandExecutor() {
                @Override
                public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
                    if (args.length == 0) {
                        return false;
                    }
                    Player player = Bukkit.getPlayer(args[0]);
                    if (player == null) {
                        return true;
                    }
                    player.setHealth(0);
                    return true;
                }
            });
        }
    }
}
