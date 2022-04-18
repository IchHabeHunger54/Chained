package ihh.chained;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("chained")
public class Chained {
    public Chained() {
        DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "chained");
        ITEMS.register("chainmail", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("chainmail_horse_armor", () -> new HorseArmorItem(4, "chainmail", new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
