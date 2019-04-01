package danny8208.lazythings;

import danny8208.lazythings.common.LazyThings;
import danny8208.lazythings.common.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LazyTab extends CreativeTabs {
    public CoreTab() {
        super(LazyThings.MOD_ID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.pickCopper);
    }

    public static final LazyTab tab = new LazyTab();
}
