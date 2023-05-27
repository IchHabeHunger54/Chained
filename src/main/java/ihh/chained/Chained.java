package ihh.chained;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(Chained.MOD_ID)
public class Chained {
    public static final String MOD_ID = "chained";

    public Chained() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Chained.MOD_ID);
        RegistryObject<Item> chainmail = ITEMS.register("chainmail", () -> new Item(new Item.Properties()));
        RegistryObject<HorseArmorItem> chainmailHorseArmor = ITEMS.register("chainmail_horse_armor", () -> new HorseArmorItem(4, "chainmail", new Item.Properties().stacksTo(1)));
        RegistryObject<HorseArmorItem> netheriteHorseArmor = ITEMS.register("netherite_horse_armor", () -> new HorseArmorItem(12, "netherite", new Item.Properties().stacksTo(1).fireResistant()));
        ITEMS.register(bus);
        bus.<CreativeModeTabEvent.BuildContents>addListener(e -> {
            if (e.getTab() == CreativeModeTabs.INGREDIENTS) {
                e.accept(chainmail);
            }
            if (e.getTab() == CreativeModeTabs.COMBAT) {
                e.accept(chainmailHorseArmor);
                e.accept(netheriteHorseArmor);
            }
        });
    }
}
