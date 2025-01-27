// Gale - Gale commands - /gale info command

package org.galemc.gale.command.subcommands;

import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.format.TextDecoration;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.galemc.gale.command.GaleSubcommand;
import org.jetbrains.annotations.Nullable;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;

import static net.kyori.adventure.text.Component.text;

@DefaultQualifier(NonNull.class)
public final class InfoCommand implements GaleSubcommand {

    public final static String LITERAL_ARGUMENT = "info";

    @Override
    public boolean execute(final CommandSender sender, final String subCommand, final String[] args) {
        sender.sendMessage(
            text("Gale is a performant Minecraft server system. Find us on: ")
                .append(text("https://github.com/GaleMC/Gale")
                    .decorate(TextDecoration.UNDERLINED)
                    .clickEvent(ClickEvent.openUrl("https://github.com/GaleMC/Gale")))
        );
        return true;
    }

    @Override
    public boolean testPermission(CommandSender sender) {
        return true;
    }

    @Override
    public @Nullable Permission getPermission() {
        return null;
    }

}
