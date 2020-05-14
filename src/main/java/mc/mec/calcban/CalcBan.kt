package mc.mec.calcban

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerCommandPreprocessEvent
import org.bukkit.plugin.java.JavaPlugin

class CalcBan : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    fun onCalcCommand (e: PlayerCommandPreprocessEvent) {
        val cmd = e.message
        if(cmd == "//calc"){
            e.isCancelled
            val consolecommand = "ban ${e.player.name} 故意にサーバーを落とす行為。（自動BAN）"
            Bukkit.dispatchCommand(Bukkit.getServer().consoleSender,consolecommand)
        }
    }
}