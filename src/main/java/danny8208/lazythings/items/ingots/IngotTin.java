package danny8208.lazythings.items.ingots;

import danny8208.lazythings.LazyThings;
import net.minecraft.item.Item;

public class IngotTin extends Item {
    public IngotTin() {
        super(new Item.Properties().group(LazyThings.LazyTab));
        setRegistryName("tin_ingot");
    }
}
