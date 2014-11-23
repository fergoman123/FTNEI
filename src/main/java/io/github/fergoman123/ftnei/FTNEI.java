package io.github.fergoman123.ftnei;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.fergoman123.fergotools.helper.LogHelper;
import io.github.fergoman123.ftnei.nei.NEIFTConfig;
import io.github.fergoman123.ftnei.reference.ModInfo;
import io.github.fergoman123.ftnei.reference.Reference;

/**
 * Created by Fergoman123.
 */
@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.version, dependencies = Reference.dep)
public class FTNEI
{
    public static final LogHelper logger = new LogHelper();
    public static final NEIFTConfig neiConfig = new NEIFTConfig();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {

        logger.info("Loading " + ModInfo.modid + " ModMetadata");
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent evt)
    {
        logger.info("Loading " + ModInfo.modid + " NEI Config");
        neiConfig.loadConfig();
    }


}
