package danny8208.lazythings.items;

import danny8208.lazythings.items.ingots.*;
import danny8208.lazythings.items.nuggets.NuggetBronze;
import danny8208.lazythings.items.nuggets.NuggetCopper;
import danny8208.lazythings.items.nuggets.NuggetSteel;
import danny8208.lazythings.items.nuggets.NuggetTin;
import danny8208.lazythings.items.picks.PickBronze;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {
    @ObjectHolder("lazythings:copper_ingot")
    public static IngotCopper ingotCopper;
    @ObjectHolder("lazythings:tin_ingot")
    public static IngotTin ingotTin;
    @ObjectHolder("lazythings:bronze_ingot")
    public static IngotBronze ingotBronze;
    @ObjectHolder("lazythings:steel_ingot")
    public static IngotSteel ingotSteel;

    @ObjectHolder("lazythings:copper_nugget")
    public static NuggetCopper nuggetCopper;
    @ObjectHolder("lazythings:tin_nugget")
    public static NuggetTin nuggetTin;
    @ObjectHolder("lazythings:bronze_nugget")
    public static NuggetBronze nuggetBronze;
    @ObjectHolder("lazything:steel_nugget")
    public static NuggetSteel nuggetSteel;

    @ObjectHolder("lazythings:bronze_pickaxe")
    public static PickBronze pickBronze;
}
