package io.github.fergoman123.ftnei.reference;

import cpw.mods.fml.common.ModMetadata;

/**
 * Created by Fergoman123.
 */
public class MetadataFTNEI
{
    public static void writeMetadata(ModMetadata md)
    {
        md.autogenerated = false;
        md.modId = ModInfo.modid;
        md.name = ModInfo.name;
        md.version = ModInfo.version;
        md.description = ModInfo.description;
        md.authorList = ModInfo.authorList;
        md.logoFile = ModInfo.logoFile;
        md.url = ModInfo.url;
        md.updateUrl = "fergoman123.github.io/fergotoolnei.html";

    }
}