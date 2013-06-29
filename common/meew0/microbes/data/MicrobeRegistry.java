package meew0.microbes.data;

import java.util.HashMap;

public class MicrobeRegistry {

    public static HashMap<String, ICrossbreedHandler> crossbreedHandlers;
    
    public static ICrossbreedHandler getCrossbreedHandler(String alleleID) {
        return crossbreedHandlers.get(alleleID);
    }
    
}
