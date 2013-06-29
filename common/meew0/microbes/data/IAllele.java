package meew0.microbes.data;

public interface IAllele {
    public Object getDominantData();
    public Object getRecessiveData();
    public IAllele doCrossbreed(IAllele i);
    public boolean valueCanBeNo();
    public String getAlleleID();
}
