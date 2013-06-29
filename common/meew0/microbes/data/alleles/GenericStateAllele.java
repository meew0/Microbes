package meew0.microbes.data.alleles;

import meew0.microbes.data.IAllele;
import meew0.microbes.data.MicrobeHelper;
import meew0.microbes.data.MicrobeRegistry;

public class GenericStateAllele extends GenericAllele {
    
    public GenericStateAllele(Object dominant, Object recessive, boolean canBeNo, String id) {
        super(dominant, recessive, canBeNo, id);
    }

    @Override
    public IAllele doCrossbreed(IAllele i) {
        if(MicrobeRegistry.getCrossbreedHandler(getAlleleID()) == null)
            return MicrobeHelper.doGenericAlleleCrossbreed(this, i);
        else return MicrobeRegistry.getCrossbreedHandler(getAlleleID()).doCrossbreed(this, i);
    }
    
}
