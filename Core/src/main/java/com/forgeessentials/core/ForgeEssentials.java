package com.forgeessentials.core;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class ForgeEssentials
{
    public static final String MODID = "FE";
    public static final String NAME  = "ForgeEssentials";
    public static File feFolder;
    public static File settingsFolder;

    static void init(FMLPreInitializationEvent event)
    {
        feFolder = new File(event.getModConfigurationDirectory().getParentFile(), NAME);
        feFolder.mkdirs();

        settingsFolder = new File(feFolder, "settings");
        settingsFolder.mkdir();
    }
}
