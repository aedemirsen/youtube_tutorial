


public abstract class Araba implements Arac{
    private int hiz;
    private String marka;
    private int modelYili;
    private String renk;

    // public Araba(String renk){
    //     this.renk = renk;
    // }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getModelYili() {
        return modelYili;
    }

    public void setModelYili(int modelYili) {
        this.modelYili = modelYili;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setHiz(int hiz){
        this.hiz = hiz;
    }

    public int getHiz(){
        return hiz;
    }


    void markaModel(){
        System.out.println(marka + "-" + modelYili);
    }

    public void tip(){
        System.out.println("Ben bir arabayım.");
    }


}
