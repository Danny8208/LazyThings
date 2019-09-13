package danny8208.lazythings.items.nuggets;

import danny8208.lazythings.LazyThings;
import net.minecraft.item.Item;

public class NuggetBronze extends Item {
    public NuggetBronze() {
        super(new Item.Properties().group(LazyThings.LazyTab));
        setRegistryName("bronze_nugget");
    }
}
