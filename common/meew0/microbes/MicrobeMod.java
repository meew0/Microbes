package meew0.microbes;

import java.util.logging.Logger;

import meew0.microbes.proxy.CommonProxy;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = MicrobeMod.id, name = MicrobeMod.modName, version = MicrobeMod.modVersion)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MicrobeMod {
    // Random variables
    public static final String id = "Microbes";
    public static final String modName = "Microbes";
    public static final String modVersion = "0.1a";
    
    // Items
    
    // Blocks
    
    @SidedProxy(serverSide = "meew0.microbes.proxy.CommonProxy", clientSide = "meew0.microbes.proxy.ClientProxy")
    public static CommonProxy serverProxy = new CommonProxy(); // Create proxy
    
    @Instance(id)
    public static MicrobeMod mod = new MicrobeMod(); // Create mod instance
    
    private Logger lg = Logger.getLogger(id); // Create logger
    
    @PreInit
    public void preInit(FMLPreInitializationEvent evt) {
        lg.setParent(FMLLog.getLogger()); // Initialize logger
        lg.info(getFullModName() + " loaded, initializing now");
    }
    
    @Init
    public void init(FMLInitializationEvent evt) {
        // Initialize items
        
        
        
        // Initialize blocks
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
