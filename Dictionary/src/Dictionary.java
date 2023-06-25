import IO.FileOperation;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

    private Map<String,List<String>> trToEn,enToTr;

    private final String trTxt = "/tureng.txt";
    private final String enTxt = "/engtur.txt";
    private final String root = System.getProperty("user.dir");

    private final Scanner scanner = new Scanner(System.in);


    private void mainMenu(){
        System.out.println("Sözlük seçiniz: ");
        System.out.println("1- Türkçe-İngilizce");
        System.out.println("2- İngilizce-Türkçe");
        System.out.println("3- Yeni Kelime Ekle");
        System.out.println("0- Çıkış");
    }

    private void case1(){
        System.out.println("#####Türkçe-İngilizce Sözlük#####");
        while(true) {
            System.out.println("Kelime :  ");
            String word = scanner.nextLine();
            if (word.equals("0")) {
                break;
            }
            else if(trToEn.containsKey(word)){
                System.out.println("Aradığınız kelimenin ingilizce karşılığı: " + trToEn.get(word));
            }
            else{
                System.out.println("Aradığınız kelime sözlükte bulunmamaktadır.");
            }
        }
    }

    private void case2(){
        System.out.println("#####İngilizce-Türkçe Sözlük#####");
        while(true) {
            System.out.println("Kelime :  ");
            String word = scanner.nextLine();
            if (word.equals("0")) {
                break;
            }
            else if(enToTr.containsKey(word)){
                System.out.println("Aradığınız kelimenin türkçe karşılığı: " + enToTr.get(word));
            }
            else{
                System.out.println("Aradığınız kelime sözlükte bulunmamaktadır.");
            }
            //
        }
    }

    private void case3(){
        System.out.println("#####Yeni Kelime Ekleme#####");
        System.out.println("Eklemek istediğiniz kelime Türkçe ise 1, İngilizce ise 2'ye basınız.");
        int i = scanner.nextInt();
        scanner.nextLine();
        if(i == 1){
            System.out.println("Eklemek istediğiniz Türkçe kelime: ");
            String word_tr = scanner.nextLine();
            System.out.println("Eklemek istediğiniz kelimenin İngilizce karşılığı: ");
            String word_en = scanner.nextLine();
            try {
                FileOperation.fileOperation.writeToFile(root + "/asset" + trTxt,word_tr+"/"+word_en);
                System.out.println("Kelime sözlüğe eklendi.");
            } catch (IOException e) {
                System.out.println("Hata oluştu");
            }
        }
        else if(i == 2){
            System.out.println("Eklemek istediğiniz İngilizce kelime: ");
            String word_en = scanner.nextLine();
            System.out.println("Eklemek istediğiniz kelimenin Türkçe karşılığı: ");
            String word_tr = scanner.nextLine();
            try {
                FileOperation.fileOperation.writeToFile(root + "/asset" + enTxt,word_en+"/"+word_tr);
                System.out.println("Kelime sözlüğe eklendi.");
            } catch (IOException e) {
                System.out.println("Hata oluştu");
            }

        }


    }

    public void start(){
        txtToMap();
        while(true){
            mainMenu();
            int type = scanner.nextInt();
            scanner.nextLine();
            if(type == 0){
                break;
            }
            else if(type == 1){
                case1();
            }
            else if(type == 2){
                case2();
            }
            else if(type == 3){
                case3();
            }
            System.out.println(type);
        }


    }

    private void txtToMap() {
        //2 txt dosyasını oku ve map lere aktar.
        try{
            trToEn = Mapper.mapper.toMap(FileOperation.fileOperation.readFileToStringList(root + "/asset" + trTxt));
            enToTr = Mapper.mapper.toMap(FileOperation.fileOperation.readFileToStringList(root + "/asset" + enTxt));
        }
        catch (Exception e){
            System.out.println("Dosya okuma esnasında bir problem oluştu!");
        }
    }
}
