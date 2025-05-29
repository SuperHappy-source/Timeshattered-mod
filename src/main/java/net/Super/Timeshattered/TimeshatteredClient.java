package net.Super.Timeshattered;

import net.Super.Timeshattered.fluid.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

public class TimeshatteredClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_IRON, ModFluids.FLOWING_MOLTEN_IRON,
                new SimpleFluidRenderHandler(
                        new Identifier("timeshattered:fluid/molten_iron_still"),
                        new Identifier("timeshattered:fluid/molten_iron_flow"),
                        0xfc0303

                ));



        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier("timeshattered:fluid/molten_iron_still"));
            registry.register(new Identifier("timeshattered:fluid/molten_iron_flow"));
        });
    }
}