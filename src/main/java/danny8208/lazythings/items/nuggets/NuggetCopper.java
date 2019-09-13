package danny8208.lazythings.items.nuggets;

import danny8208.lazythings.LazyThings;
import net.minecraft.item.Item;

public class NuggetCopper extends Item {
    public NuggetCopper() {
        super(new Item.Properties().group(LazyThings.LazyTab));
        setRegistryName("copper_nugget");
    }
}
