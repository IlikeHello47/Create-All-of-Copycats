package dev.IlikeHello47.caoc.content.copycat.decoration;

import dev.IlikeHello47.caoc.CAOC;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CopycatBase {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CAOC.MODID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}