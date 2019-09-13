package danny8208.lazythings.items.ingots;

import danny8208.lazythings.LazyThings;
import net.minecraft.item.Item;

public class IngotCopper extends Item {
    public IngotCopper() {
        super(new Item.Properties().group(LazyThings.LazyTab));
        setRegistryName("copper_ingot");
    }
}
