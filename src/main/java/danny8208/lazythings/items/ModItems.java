package danny8208.lazythngs.items;

import danny8208.lazycore.common.LazyCore;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@GameRegistry.ObjectHolder(LazyCore.MOD_ID)
public class ModItems {
    @SideOnly(Side.CLIENT)
    public static void registerModels() {
    }
}
