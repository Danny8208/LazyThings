package danny8208.lazythings.items.ingots;

import danny8208.lazythings.LazyThings;
import net.minecraft.item.Item;

public class IngotSteel extends Item {
    public IngotSteel() {
        super(new Item.Properties().group(LazyThings.LazyTab));
        setRegistryName("steel_ingot");
    }
}
