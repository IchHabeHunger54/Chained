package ihh.chained;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(Chained.MOD_ID)
public class Chained {
    public static final String MOD_ID = "chained";

    public Chained() {
        DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Chained.MOD_ID);
        ITEMS.register("chainmail", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("chainmail_horse_armor", () -> new HorseArmorItem(4, "chainmail", new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
        ITEMS.register("netherite_horse_armor", () -> new HorseArmorItem(12, "netherite", new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).fireResistant()));
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
