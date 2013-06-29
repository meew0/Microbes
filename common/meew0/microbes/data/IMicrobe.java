package meew0.microbes.data;

public interface IMicrobe {
    public IProductionHandler getProductionHandler(MicrobeEnvironment env);
    public boolean canLiveInEnvironment(MicrobeEnvironment env);
    public String getMicrobeType();
    public int getSpeciesID();
    public MicrobialChromosome getChromosome();
}
