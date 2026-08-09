package com.example.starlight.block;

import com.example.starlight.StarlightMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModBlocks {
    public static final Block STARLIGHT_BLOCK = new Block(Block.Settings.copy(Blocks.IRON_BLOCK));
    public static final Block STARLIGHT_ORE = new Block(Block.Settings.copy(Blocks.STONE).requiresTool());

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(StarlightMod.MOD_ID, "starlight_block"), STARLIGHT_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(StarlightMod.MOD_ID, "starlight_ore"), STARLIGHT_ORE);
        Registry.register(Registries.ITEM, new Identifier(StarlightMod.MOD_ID, "starlight_block"),
                new BlockItem(STARLIGHT_BLOCK, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(StarlightMod.MOD_ID, "starlight_ore"),
                new BlockItem(STARLIGHT_ORE, new Item.Settings()));
    }
}
