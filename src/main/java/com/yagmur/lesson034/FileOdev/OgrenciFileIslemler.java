package com.yagmur.lesson034.FileOdev;

import com.yagmur.lesson034.FileOdev.DosyaSabitleri;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class OgrenciFileIslemler {

    private ArrayList<String> ogrenciListesi;

    public OgrenciFileIslemler() {
        ogrenciListesi = new ArrayList<>();
        dosyadanVeriOku();
    }

    private void dosyadanVeriOku() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(DosyaSabitleri.isimListesiPath));
            String satir;
            while ((satir = bufferedReader.readLine()) != null) {
                ogrenciListesi.add(satir);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            throw new RuntimeException(fileNotFoundException);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void secileceklerDosyasinaYazdir() {

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(DosyaSabitleri.secileceklerListesiPath));
            for (String ogrenci : ogrenciListesi) {
                bufferedWriter.write(ogrenci + "\n");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException exception) {
                System.out.println(exception.toString());
            }
        }
    }

    public int ogrenciSec() {
        Random random = new Random();
        return random.nextInt(ogrenciListesi.size());
    }

    public void secilenOgrenciyeGoreDosyaDuzenle() {
        int index = ogrenciSec();
        String secilenOgrenci = ogrenciListesi.get(index);

        try (BufferedWriter secilmislerWriter = new BufferedWriter(new FileWriter(DosyaSabitleri.secilmislerListesiPath, true));
             BufferedWriter secileceklerWriter = new BufferedWriter(new FileWriter(DosyaSabitleri.secileceklerListesiPath))) {

            secilmislerWriter.write(secilenOgrenci + "\n");
            secilmislerWriter.flush();

            for (int i = 0; i < ogrenciListesi.size(); i++) {
                if (i != index) {
                    secileceklerWriter.write(ogrenciListesi.get(i) + "\n");
                    secileceklerWriter.flush();
                }
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

}
