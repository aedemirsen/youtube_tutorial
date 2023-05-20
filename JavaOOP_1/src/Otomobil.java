public class Otomobil extends Araba{
    boolean ustuAcikMi;

    @Override
    public void tip(){
        System.out.println("Ben bir otomobilim.");
    }

    @Override
    public double agirlik() {
        return 500;
    }
}
