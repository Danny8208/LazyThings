package danny8208.lazythings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class GlassRedGlowing extends Block {
    public GlassRedGlowing() {
        super(Properties.create(Material.GLASS)
                .sound(SoundType.GLASS)
                .hardnessAndResistance(.5F)
                .lightValue(15)
        );
        setRegistryName("glowing_red_glass");
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
