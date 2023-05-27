public class Kamyon extends Araba{

    private boolean yukVarMi;

    public boolean getYukVarMi() {
        return yukVarMi;
    }

    public void setYukVarMi(boolean yukVarMi) {
        this.yukVarMi = yukVarMi;
    }

    @Override
    public void tip(){
        System.out.println("Ben bir kamyonum.");
    }

    @Override
    public double agirlik() {
        return 1000;
    }
}
