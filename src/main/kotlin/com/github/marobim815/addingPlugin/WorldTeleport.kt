package com.github.marobim815.addingPlugin

import org.bukkit.Bukkit
import org.bukkit.World
import org.bukkit.entity.Player
import org.bukkit.event.Listener

object WorldManager : Listener {
    private val survivalWorld = Bukkit.getWorld("survival_world")
    private val PvpWorld = Bukkit.getWorld("pvp_world")
    private val buildingWorld = Bukkit.getWorld("building_world")
    private val mainLobby = Bukkit.getWorld("main_lobby")

    private fun teleportPlayerToWorld(player: Player, world: World?) {
        val spawnLocation = world?.spawnLocation ?: return
        player.teleport(spawnLocation)
    }

    fun teleportLobby(player: Player) = teleportPlayerToWorld(player, mainLobby)
    fun teleportBuild(player: Player) = teleportPlayerToWorld(player, buildingWorld)
    fun teleportPvp(player: Player) = teleportPlayerToWorld(player, PvpWorld)

}