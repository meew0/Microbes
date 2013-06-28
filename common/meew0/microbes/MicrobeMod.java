package meew0.microbes;

import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = MicrobeMod.id, name = MicrobeMod.modName, version = MicrobeMod.modVersion)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MicrobeMod {
    public static final String id = "Microbes";
    public static final String modName = "Microbes";
    public static final String modVersion = "0.1a";
    
    @Instance(id)
    public static MicrobeMod mod = new MicrobeMod();
    
    private Logger lg = Logger.getLogger(id);
    
    @PreInit
    public void preInit(FMLPreInitializationEvent evt) {
        lg.setParent(FMLLog.getLogger());
        lg.info(getFullModName() + " loaded, initializing now");
    }
    
    @Init
    public void init(FMLInitializationEvent evt) {
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent evt) {
        lg.info(getFullModName() + " successfully initialized");
    }
    
    public static String getFullModName() {
        return modName + " " + modVersion;
    }
    
    public Logger logger() {
        return lg;
    }
}
