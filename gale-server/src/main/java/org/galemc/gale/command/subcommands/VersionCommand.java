// Gale - Gale commands - /gale version command

package org.galemc.gale.command.subcommands;

import net.minecraft.server.MinecraftServer;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.galemc.gale.command.GaleCommand;
import org.galemc.gale.command.PermissionedGaleSubcommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.PermissionDefault;

@DefaultQualifier(NonNull.class)
public final class VersionCommand extends PermissionedGaleSubcommand {

    public final static String LITERAL_ARGUMENT = "version";
    public static final String PERM = GaleCommand.BASE_PERM + "." + LITERAL_ARGUMENT;

    public VersionCommand() {
        super(PERM, PermissionDefault.TRUE);
    }

    @Override
    public boolean execute(final CommandSender sender, final String subCommand, final String[] args) {
        final @Nullable Command ver = MinecraftServer.getServer().server.getCommandMap().getCommand("version");
        if (ver != null) {
            ver.execute(sender, GaleCommand.COMMAND_LABEL, me.titaniumtown.ArrayConstants.emptyStringArray); // Gale - JettPack - reduce array allocations
        }
        return true;
    }

    @Override
    public boolean testPermission(CommandSender sender) {
        return super.testPermission(sender) && sender.hasPermission("bukkit.command.version");
    }

}
