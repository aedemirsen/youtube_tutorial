public class ExceptionHandle {
    public static void main(String[] args) {
        
        int sayi1 = 50;
        int sayi2 = 0;
        
        try {
            int sonuc = bol(sayi1,sayi2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
                

    }

    public static int bol(int s1,int s2) throws SifiraBolunmeHatasi{
        if(s2 == 0) throw new SifiraBolunmeHatasi("Sifira Bolunme Hatası");
        return s1 / s2;
    }
}

class SifiraBolunmeHatasi extends Exception{
    public SifiraBolunmeHatasi(){
        super();
    }

    public SifiraBolunmeHatasi(String message){
        super(message);
    }
}
