package danny8208.lazythings.items.picks;

import danny8208.lazythings.LazyThings;
import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.crafting.Ingredient;

public class PickBronze extends PickaxeItem {
    public PickBronze() {
        super(new IItemTier() {
                  @Override
                  public int getMaxUses() {
                      return 300;
                  }

                  @Override
                  public float getEfficiency() {
                      return 8;
                  }

                  @Override
                  public float getAttackDamage() {
                      return 2;
                  }

                  @Override
                  public int getHarvestLevel() {
                      return 3;
                  }

                  @Override
                  public int getEnchantability() {
                      return 24;
                  }

                  @Override
                  public Ingredient getRepairMaterial() {
                      return null;
                  }
              }, 6, 2, new Properties()
                        .group(LazyThings.LazyTab)
        );
        setRegistryName("bronze_pickaxe");
    }
}
