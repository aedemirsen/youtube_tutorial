public class Kamyon extends Araba{
    boolean yukVarMi;

    @Override
    public void tip(){
        System.out.println("Ben bir kamyonum.");
    }

    @Override
    public double agirlik() {
        return 1000;
    }
}
