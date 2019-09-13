package danny8208.lazythings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBronze extends Block {

    public BlockBronze() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0F)
        );
        setRegistryName("bronze_block");
    }
}
