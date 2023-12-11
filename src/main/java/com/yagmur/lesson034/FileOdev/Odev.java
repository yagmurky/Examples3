package com.yagmur.lesson034.FileOdev;

public class Odev {
    /*
    isimListesi.txt dosyamız olacak
    bu dosyayo okuyup başka bir dosyaya yazacağız
    daha sonra işlemler yapıp birtane veri seçip bu veriyi seçilmişler.txt dosyasına eklyeceğiz.

    bu 3 dosya için bir sabitler sınıfı oluşturaşlım

    OgrenciFileIslemler sınıfımız olacak bu sınıfta b,r öğrenci listesi tutaşım.
    1- dosyadan veri okuma ==> dosyadan okuduğumuz veriyi listeye ekleyeceğiz
    2- ogrenci listemizdeki verileri seçilecekler.txt dosyasına yazdıracağız.
    3- öğrenci seç metodu yazalım ==> listeden rastgele öğrenci seçmek için bir index değeri dönsün
    4- seçilen öğrenciyi seçilmişler txt dosyasına yazdıralım ve seçilenler txt dosyasından çıkaralım

    rastgele ogrenci secilecek rastgele ogrenci sec metodu ile beraber gelen indexden daha sonra
    bu veri secilmisler.txt aktarılacak secilecekler.txt guncellenecek




     */


    public static void main(String[] args) {
        OgrenciFileIslemler ogrenciFileIslemler = new OgrenciFileIslemler();
        ogrenciFileIslemler.secileceklerDosyasinaYazdir();
        ogrenciFileIslemler.secilenOgrenciyeGoreDosyaDuzenle();

    }

}

