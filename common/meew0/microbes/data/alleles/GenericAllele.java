package meew0.microbes.data.alleles;

import meew0.microbes.data.IAllele;

public abstract class GenericAllele implements IAllele {
    
    private Object dominantData, recessiveData;
    private boolean cbn;
    private String id;
    
    public GenericAllele(Object dominant, Object recessive, boolean canBeNo, String id) {
        dominantData = dominant;
        recessiveData = recessive;
        this.id = id;
    }
    
    @Override
    public Object getDominantData() {
        return dominantData;
    }
    
    @Override
    public Object getRecessiveData() {
        return recessiveData;
    }
    
    @Override
    public boolean valueCanBeNo() {
        return cbn;
    }
    
    @Override
    public String getAlleleID() {
        return id;
    }
    
}
