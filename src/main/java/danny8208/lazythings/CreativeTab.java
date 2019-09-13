package danny8208.lazythings;

import danny8208.lazythings.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab extends ItemGroup {
    public CreativeTab() {
        super("lazythings");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.ingotCopper);
    }
}
