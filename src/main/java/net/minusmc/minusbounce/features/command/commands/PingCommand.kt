/*
 * MinusBounce Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/MinusMC/MinusBounce
 */
package net.minusmc.minusbounce.features.command.commands

import net.minusmc.minusbounce.features.command.Command

class PingCommand : Command("ping", emptyArray()) {
    override fun execute(args: Array<String>) {
        chat("§3Your ping is §a${mc.netHandler.getPlayerInfo(mc.thePlayer.uniqueID).responseTime}ms§3.")
    }
}
