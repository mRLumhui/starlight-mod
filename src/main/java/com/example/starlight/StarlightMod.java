package com.example.starlight;

import com.example.starlight.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StarlightMod implements ModInitializer {
    public static final String MOD_ID = "starlight-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item STARLIGHT_INGOT = new Item(new Item.Settings());
    public static final Item STARLIGHT_DUST = new Item(new Item.Settings());

    @Override
    public void onInitialize() {
        ModBlocks.register();
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "starlight_ingot"), STARLIGHT_INGOT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "starlight_dust"), STARLIGHT_DUST);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(entries -> {
                    entries.add(STARLIGHT_INGOT);
                    entries.add(STARLIGHT_DUST);
                });

        LOGGER.info("Starlight Mod initialized! Welcome to the starlight world.");

        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES,
                new net.minecraft.util.Identifier(MOD_ID, "starlight_ore")
        );
    }
}
