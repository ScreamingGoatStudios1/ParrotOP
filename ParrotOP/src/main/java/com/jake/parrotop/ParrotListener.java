package com.jake.parrotop;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Random;

public class ParrotListener implements Listener {

    @EventHandler
    public void onWalk(PlayerMoveEvent e) {
        Player player = (Player) e.getPlayer();
        Random random = new Random();
        Location location = e.getTo();

        if (ParrotOP.isStarted) {
            if (player.getShoulderEntityLeft() != null) {
                ArrayList<ItemStack> items = new ArrayList<>();
                items.add(new ItemStack(Material.DIAMOND_BLOCK));
                items.add(new ItemStack(Material.NETHERITE_INGOT));
                items.add(new ItemStack(Material.GOLD_INGOT, 5));
                items.add(new ItemStack(Material.EXPERIENCE_BOTTLE, 16));
                items.add(new ItemStack(Material.DIAMOND));
                items.add(new ItemStack(Material.GOLD_INGOT));
                items.add(new ItemStack(Material.ENCHANTING_TABLE));
                items.add(new ItemStack(Material.ANVIL));
                items.add(new ItemStack(Material.ELYTRA));
                items.add(new ItemStack(Material.FIREWORK_ROCKET, 32));
                items.add(new ItemStack(Material.ENDER_PEARL, 3));
                items.add(new ItemStack(Material.ENDER_PEARL, 5));
                items.add(new ItemStack(Material.ENDER_PEARL, 1));
                items.add(new ItemStack(Material.EMERALD_BLOCK, 1));
                items.add(new ItemStack(Material.NETHERITE_BLOCK, 1));
                items.add(new ItemStack(Material.GOLD_BLOCK, 1));
                items.add(new ItemStack(Material.IRON_BLOCK));
                items.add(new ItemStack(Material.IRON_INGOT, 5));
                items.add(new ItemStack(Material.IRON_INGOT));
                items.add(new ItemStack(Material.OBSIDIAN));
                items.add(new ItemStack(Material.BEDROCK));
                items.add(new ItemStack(Material.SPAWNER));
                items.add(new ItemStack(Material.ARROW, 10));
                items.add(new ItemStack(Material.BOOKSHELF));
                items.add(new ItemStack(Material.DIAMOND_HELMET));
                items.add(new ItemStack(Material.DIAMOND_CHESTPLATE));
                items.add(new ItemStack(Material.DIAMOND_LEGGINGS));
                items.add(new ItemStack(Material.DIAMOND_BOOTS));
                items.add(new ItemStack(Material.DIAMOND_SWORD));
                items.add(new ItemStack(Material.DIAMOND_AXE));
                items.add(new ItemStack(Material.DIAMOND_PICKAXE));
                items.add(new ItemStack(Material.BOW));

                location.getWorld().dropItemNaturally(location, items.get(random.nextInt(items.size())));
            }
        }
    }
}
