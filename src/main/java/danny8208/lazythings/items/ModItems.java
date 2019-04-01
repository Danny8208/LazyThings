package danny8208.lazythngs.items;

import danny8208.lazycore.LazyThings;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@GameRegistry.ObjectHolder(LazyThings.MOD_ID)
public class ModItems {
    @SideOnly(Side.CLIENT)
    public static void registerModels() {
    }
}
