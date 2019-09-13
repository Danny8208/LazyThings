package danny8208.lazythings.items.ingots;

import danny8208.lazythings.LazyThings;
import net.minecraft.item.Item;

public class IngotBronze extends Item {
    public IngotBronze() {
        super(new Item.Properties().group(LazyThings.LazyTab));
        setRegistryName("bronze_ingot");
    }
}
