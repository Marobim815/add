package com.github.marobim815.addingPlugin

import org.bukkit.Location

object VillageManager {
    private const val VILLAGE_RANGE = 160

    fun getNearbyLocations(center: Location, range: Int): List<Location> {
        val locations = mutableListOf<Location>()

        for (x in -range..range) {
            for (y in -range..range) {
                for (z in -range..range) {
                    // 기준 위치에서 상대 좌표 계산
                    val location = center.clone().add(x.toDouble(), y.toDouble(), z.toDouble())
                    locations.add(location)
                }
            }
        }
        return locations
    }

    data class Village(
        var temHasVillage: Boolean = false,
        val villageLocation: Location,
        val villageRange: List<Location> = getNearbyLocations(villageLocation, VILLAGE_RANGE),
    )

    private val villages = mutableMapOf<String, Village>()

    fun createVillage(teamName: String, location: Location) {
        villages[teamName] = Village(temHasVillage = true, villageLocation = location)
    }

    //todo: 마을 범위 반환
}