package meew0.microbes.data;

import meew0.microbes.MicrobeMod;

public class MicrobialChromosome {
    IAllele[] a;
    
    /*
     * Chromosome:
     * 0: Species ID (String)
     * 1: Produce (IProductionHandler)
     * 2: Production speed (AlleleState)
     * 3: Life cycle speed (AlleleState)
     * 4: Mutability (AlleleState)
     * 5: Fertility (AlleleState)
     * 6: Ideal environment (MicrobeEnvironment)
     * 7: Environment tolerance (AlleleState)
     * 8: 
     *  Bacteria: Immunity (AlleleState)
     *  Fungi: Nothing
     *  Protozoa: Nothing
     *  Bacteriophages: Selectivity (AlleleState, can't be No)
     */
    
    public MicrobialChromosome(IAllele[] alleles) {
        a = new IAllele[alleles.length];
        System.arraycopy(alleles, 0, a, 0, alleles.length);
    }
    
    public MicrobialChromosome doCrossbreed(MicrobialChromosome other) {
        if(a.length != other.a.length) {
            MicrobeMod.mod.crash(new IllegalArgumentException
                    ("Two MicrobialChromosomes must have the same amount of alleles for doCrossbreed()"));
            return null;
        }
        IAllele[] crossbred = new IAllele[a.length];
        for(int i = 0; i < a.length; i++) {
            crossbred[i] = a[i].doCrossbreed(other.a[i]);
        }
        return new MicrobialChromosome(crossbred);
    }
}
