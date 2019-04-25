package danny8208.lazythngs.items;

import danny8208.lazycore.LazyThings;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@GameRegistry.ObjectHolder(LazyThings.MOD_ID)
public class ModItems {
    @GameRegstry.ObjectHolder("copper_pick")
    public static PickCopper pickCopper = new PickCopper();
    
    @GameRegistry.ObjectHolder("copper_spade")
    public static SpadeCopper spadeCopper = new SpadeCopper();
    
    @GameRegistry.ObjectHolder("copper_axe")
    public static AxeCopper axeCopper = new AxeCopper();
    
    @SideOnly(Side.CLIENT)
    public static void registerModels() {
        pickCopper.registerModels();
        
        spadeCopper.registerModels();
        
        axeCopper.registerModels();
    }
}
