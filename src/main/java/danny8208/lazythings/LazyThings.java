package danny8208.lazythings;

import danny8208.lazythings.blocks.*;
import danny8208.lazythings.items.ingots.*;
import danny8208.lazythings.items.nuggets.NuggetBronze;
import danny8208.lazythings.items.nuggets.NuggetCopper;
import danny8208.lazythings.items.nuggets.NuggetSteel;
import danny8208.lazythings.items.nuggets.NuggetTin;
import danny8208.lazythings.items.picks.PickBronze;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("lazythings")
public class LazyThings {
    public static LazyThings instance;
    public static final String modid = "lazythings";
    public static final ItemGroup LazyTab = new CreativeTab();
    private static final Logger logger = LogManager.getLogger(modid);

    public LazyThings() {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        logger.info("setup method registered");
    }

    private void clientRegistries(final FMLClientSetupEvent event) {
        logger.info("clientregisties method registered");
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().registerAll(
                    new BlockCopper(),
                    new BlockTin(),
                    new BlockBronze(),
                    new BlockSteel(),

                    new GlassClearGlowing()
            );

            logger.info("blocks registered");
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties()
                    .group(LazyTab);
            event.getRegistry().registerAll(
                    new BlockItem(ModBlocks.blockCopper, properties).setRegistryName("copper_block"),
                    new BlockItem(ModBlocks.blockTin, properties).setRegistryName("tin_block"),
                    new BlockItem(ModBlocks.blockBronze, properties).setRegistryName("bronze_block"),
                    new BlockItem(ModBlocks.blockSteel,properties).setRegistryName("steel_block"),

                    new BlockItem(ModBlocks.glassClearGlowing, properties).setRegistryName("glowing_clear_glass"),

                    new IngotCopper(),
                    new IngotTin(),
                    new IngotBronze(),
                    new IngotSteel(),

                    new NuggetCopper(),
                    new NuggetTin(),
                    new NuggetBronze(),
                    new NuggetSteel(),

                    new PickBronze(),
                    new PickCoppper()
            );

            logger.info("items registered");
        }
    }
}
