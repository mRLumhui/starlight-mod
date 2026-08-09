package com.example.starlight;

import net.fabricmc.api.ClientModInitializer;

public class StarlightModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        StarlightMod.LOGGER.info("Starlight Mod (client) initialized.");
    }
}
