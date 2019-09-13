package danny8208.lazythings.items.picks;

import danny8208.lazythings.LazyThings;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.crafting.Ingredient;

public class PickCopper extends PickaxeItem {
    public PickCopper() {
        super(new IItemTier() {
                  @Override
                  public int getMaxUses() {
                      return 200;
                  }

                  @Override
                  public float getEfficiency() {
                      return 5;
                  }

                  @Override
                  public float getAttackDamage() {
                      return 2;
                  }

                  @Override
                  public int getHarvestLevel() {
                      return 2;
                  }

                  @Override
                  public int getEnchantability() {
                      return 14;
                  }

                  @Override
                  public Ingredient getRepairMaterial() {
                      return null;
                  }
              }, 4, 2, new Item.Properties()
                        .group(LazyThings.LazyTab)
        );
        setRegistryName("copper_pickaxe");
    }
}
