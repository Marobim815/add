package com.github.marobim815.addingPlugin

import org.bukkit.NamespacedKey
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.persistence.PersistentDataType

object EventListeners : Listener {
    @EventHandler
    fun onInteract(event: PlayerInteractEvent) {
        val player = event.player
        val action = event.action
        val item = player.inventory.itemInMainHand
        val meta = item.itemMeta ?: return

        val dataContainer = meta.persistentDataContainer
        val key = NamespacedKey(AddingPlugin(), "custom_item")
        // 데이터가 존재하는지 확인하고 불러오기
        if (dataContainer.has(key, PersistentDataType.STRING)) {

        }
    }
}