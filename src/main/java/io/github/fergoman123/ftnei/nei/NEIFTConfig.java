package io.github.fergoman123.ftnei.nei;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import io.github.fergoman123.ftnei.reference.ModInfo;

/**
 * Created by Fergoman123.
 */
public class NEIFTConfig implements IConfigureNEI
{

    @Override
    public void loadConfig()
    {
        MaceratorRecipeHandler maceratorRecipeHandler = new MaceratorRecipeHandler();
        API.registerRecipeHandler(maceratorRecipeHandler);
        API.registerUsageHandler(maceratorRecipeHandler);
    }

    @Override
    public String getName() {
        return ModInfo.name;
    }

    @Override
    public String getVersion() {
        return ModInfo.version;
    }
}
