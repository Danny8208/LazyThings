package danny8208.lazythings.items.nuggets;

import danny8208.lazythings.LazyThings;
import net.minecraft.item.Item;

public class NuggetTin extends Item {
    public NuggetTin() {
        super(new Item.Properties().group(LazyThings.LazyTab));
        setRegistryName("tin_nugget");
    }
}
