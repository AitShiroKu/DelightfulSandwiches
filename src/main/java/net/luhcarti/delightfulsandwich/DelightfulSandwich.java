package net.luhcarti.delightfulsandwich;

import com.mojang.logging.LogUtils;
import net.luhcarti.delightfulsandwich.item.LuhCreativeTabs;
import net.luhcarti.delightfulsandwich.item.LuhItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(DelightfulSandwich.MOD_ID)
public class DelightfulSandwich
{
    public static final String MOD_ID = "delightfulsandwich";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DelightfulSandwich(IEventBus modEventBus)
    {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        LuhItems.ITEMS.register(modEventBus);

        modEventBus.addListener(LuhCreativeTabs::addItemsToCreativeTab);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
