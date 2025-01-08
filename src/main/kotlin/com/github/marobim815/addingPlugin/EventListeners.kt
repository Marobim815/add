package com.github.marobim815.addingPlugin

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockPlaceEvent

object EventListeners : Listener {

    private const val VILLAGE_RANGE = 10 * 16

    @EventHandler
    fun onBlockPlace(event: BlockPlaceEvent) {
        // val player = event.player
        val block = event.block

        if (block.type == Material.DIAMOND_BLOCK) {
            val villageLocation = block.location
            // VillageManager.createVillage(TeamManager.getTeamName(player), block.location)
        }
    }
}