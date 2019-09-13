package danny8208.lazythings.items.nuggets;

import danny8208.lazythings.LazyThings;
import net.minecraft.item.Item;

public class NuggetSteel extends Item {
    public NuggetSteel() {
        super(new Item.Properties().group(LazyThings.LazyTab));
        setRegistryName("steel_nugget");
    }
}
