package com.github.marobim815.addingPlugin

import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.persistence.PersistentDataType
import org.bukkit.plugin.java.JavaPlugin

object Items {
    fun createCustomItem(plugin: JavaPlugin): ItemStack {
        val item = ItemStack(Material.DIAMOND)
        val meta = item.itemMeta ?: return item
        // PersistentDataContainer 가져오기
        val dataContainer = meta.persistentDataContainer
        // 커스텀 데이터 키 생성
        val key = NamespacedKey(plugin, "custom_diamond")
        // 데이터 저장 (예: 커스텀 데미지 값으로 50 저장)
        dataContainer.set(key, PersistentDataType.STRING, "custom_item")
        // 아이템 메타를 다시 설정
        item.itemMeta = meta

        return item
    }
}