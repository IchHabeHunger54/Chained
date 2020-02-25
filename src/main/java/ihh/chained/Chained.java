package ihh.chained;

import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("chained")
public class Chained {
    public Chained() {
        MinecraftForge.EVENT_BUS.register(this);
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "chained");
    static {
        ITEMS.register("chainmail", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
        ITEMS.register("chainmail_horse_armor", () -> new HorseArmorItem(4, "chainmail", new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
    }
}
