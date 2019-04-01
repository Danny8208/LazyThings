package danny8208.lazythings;

import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class CoreConfig {
    private static final String COMMENT_ENABLE = "Set to true in order to enable this";
    private static final String COMMENT_RESISTANCE = "The resistance of the block. You should only change if you feel like it";
    private static final String COMMENT_HARDNESS = "The hardness of the block. You should only change if you feel like it";

    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
          cfg.load();
        }   catch (Exception e1) {
            LazyThings.logger.log(Level.ERROR, "Problem with loading config file", e1);
        } finally {
            if(cfg.hasChanged()) {
                cfg.save();
            }
        }
    }
}
