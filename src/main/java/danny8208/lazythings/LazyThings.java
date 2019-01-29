package danny8208.lazythings;

import danny8208.lazythings.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = LazyThings.MOD_ID,
        name = LazyThings.NAME,
        version = LazyThings.VERSION,
        dependencies = "required:forge@[" + LazyThings.FORGE + ",);" + "after:" + LazyThings.API_VERSION + ";"
)
public class LazyThings {
    public static final String MOD_ID = "lazythings";
    public static final String NAME = "LazyThings";
    public static final String VERSION = "1.0";
    public static final String FORGE = "14.23.5.2808";
    public static final String API_VERSION = "1.0";
    public static Logger logger;

    @Mod.Instance
    public static LazyThings instance;

    @SidedProxy(
            clientSide = "danny8208.lazythings.proxy.ClientProxy",
            serverSide = "danny8208.lazythings.proxy.ServerProxy"
    )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
