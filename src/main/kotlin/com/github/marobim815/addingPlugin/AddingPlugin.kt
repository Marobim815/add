package com.github.marobim815.addingPlugin

import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class AddingPlugin : JavaPlugin(), Listener {

    override fun onEnable() {
        server.pluginManager.registerEvents(EventListeners, this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
