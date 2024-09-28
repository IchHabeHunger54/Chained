package ihh.chained;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Chained.MOD_ID)
public class Chained {
    public static final String MOD_ID = "chained";

    public Chained(IEventBus bus) {
        DeferredRegister.Items ITEMS = DeferredRegister.createItems(Chained.MOD_ID);
        DeferredItem<Item> chainmail = ITEMS.registerSimpleItem("chainmail");
        ITEMS.register(bus);
        bus.<BuildCreativeModeTabContentsEvent>addListener(e -> {
            if (e.getTabKey() == CreativeModeTabs.INGREDIENTS) {
                e.accept(chainmail);
            }
        });
    }
}
