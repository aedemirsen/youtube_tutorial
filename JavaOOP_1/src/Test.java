public class Test {

    public static void main(String[] args) {
        //upcast
        Araba a1 = new Kamyon();
        Araba a2 = new Otomobil();

        //downcast
        if (a1 instanceof Kamyon) {
            Kamyon k = (Kamyon)a1;            
        } else if(a2 instanceof Otomobil) {
            Otomobil o = (Otomobil)a2;
        }
        
    }
    
}
