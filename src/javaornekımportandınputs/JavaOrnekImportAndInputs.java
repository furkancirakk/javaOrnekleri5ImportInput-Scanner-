/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaornekımportandınputs;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author zajigalka
 */
public class JavaOrnekImportAndInputs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanner kullaniciVerisi = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz:");
        int yas = kullaniciVerisi.nextInt();
        System.out.println("Yaşınız: " + yas);
        System.out.println("Adınızı Giriniz:");
        String isim = kullaniciVerisi.next();//Birden fazla kelime için nextLine
        System.out.println("Adınız: " + isim);*/
        
        
        //Kullanıcıdan sayısal ve metinsel değer alarak ekrana yazdır
        /*Scanner degerler = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int sayi = degerler.nextInt();
        System.out.println("Bir kelime girin:");
        String yazi = degerler.next();
        System.out.println("Yazdığınız sayı: " + sayi + " Yazdığınız kelime: " + yazi);*/
        
        
        //Kullanıcının ismini alarak ekrana Hoş geldin "Kullanıcının adı" yazdır.
        /*Scanner hosgeldin = new Scanner(System.in);
        System.out.println("Adınızı girin:");
        String isim = hosgeldin.next();
        System.out.println("Hoşgeldin " + isim);*/
        
        
        //Kullanıcıdan alınan iki sayının toplamını ekrana yazdır
        /*Scanner ikiSayi = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int sayi1 = ikiSayi.nextInt();
        System.out.println("Bir sayı daha girin:");
        int sayi2 = ikiSayi.nextInt();
        int toplam = sayi1 + sayi2;
        System.out.println("Girdiğiniz iki sayının toplamı: " + toplam);*/
        
        
        
        //Öğrenci not ortalaması kaldı/geçti uygulaması yapınız
        /*Scanner kaldiGecti = new Scanner(System.in);
        System.out.println("Notunuzu yazın:");
        int note = kaldiGecti.nextInt();
        if (note <=100 && note>=85){
            System.out.println("Notunuz Pekiyi.");
        }
            else if (note <= 84 && note >= 70){
            System.out.println("Notunuz İyi.");
            }
            else if (note <= 69 && note >= 55){
            System.out.println("Notunuz Orta.");
            }
            else if (note <= 54 && note >= 45){
            System.out.println("Notunuz Geçer.");
            }
            else if (note <= 44 && note >= 0){
            System.out.println("Sınıfta kaldın:(");
            }
        else{
            System.out.println("Geçersiz not.");
        }*/
        
        
        //Yaş hesabı
        /*Scanner yas = new Scanner(System.in);
        System.out.println("Doğum yılınızı yazın:");
        int yil = yas.nextInt();
        System.out.println("Yaşınız: " + (2021-yil));*/
        
        
        //Dört işlem
        /*Scanner dortIslem = new Scanner(System.in);
        System.out.println("İşlemin ilk sayısı: ");
        int sayi1 = dortIslem.nextInt();
        System.out.println("İşlemin ikinci sayısı: ");
        int sayi2 = dortIslem.nextInt();
        System.out.println("Yapmak istediğiniz işlem(toplama, cikartma, carpma, bolme):");
        String islem = dortIslem.next();
        if ("toplama".equals(islem)){
            System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1+sayi2));
        }
        else if ("cikartma".equals(islem)){
            System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1-sayi2));
        }
        else if ("carpma".equals(islem)){
            System.out.println(sayi1 + " x " + sayi2 + " = " + (sayi1*sayi2));
        }
        else if ("bolme".equals(islem)){
            System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1/sayi2));
        }
        else {
            System.out.println("Geçersiz giriş");
        }*/
        
        
        //Hastane randevu sistemi
        Scanner hastaneRandevu = new Scanner(System.in);
        System.out.println("Adınız:");
        String name = hastaneRandevu.next();
        System.out.println("Soyadınız:");
        String surname = hastaneRandevu.next();
        System.out.println("Kimlik Numaranız:");
        long id = hastaneRandevu.nextLong();
        System.out.println("Telefon Numaranız:");
        long phone = hastaneRandevu.nextLong();
        String bolum[] = {"İç Hastalıkları(Dahiliye)(1)","Genel Cerrahi(2)","Göğüs Hastalıkları(3)","Kulak Burun Boğaz(4)","Kardiyoloji(5)"};
        System.out.println("Bölüm Seçiniz:");
        for (int i=0;i<bolum.length;i++){
            System.out.println(bolum[i]);
        }
        System.out.println("*Seçmek istediğiniz bölümün yanındaki rakamı yazın.*");
        int bolumNo = hastaneRandevu.nextInt();
        String bolumSecim = "";
        switch (bolumNo){
            case 1:
                bolumSecim = bolum[0];
                break;
            case 2:
                bolumSecim = bolum[1];
                break;
            case 3:
                bolumSecim = bolum[2];
                break;
            case 4:
                bolumSecim = bolum[3];
                break;
            case 5:
                bolumSecim = bolum[4];
                break;
            default:
                System.out.println("Geçersiz giriş.");
    }
        System.out.println("Tarih yazınız(GG/AA/YYYY şeklinde)");
        String date = hastaneRandevu.next();
        System.out.println("Saat yazınız(SS:DD şeklinde)");
        String time = hastaneRandevu.next();
        System.out.println("Randevunuz oluşturulmuştur.\r\n"+"Randevu bilgileriniz:\r\n"+ name + " " + surname + "\r\n" + bolumSecim + "\r\n" + date + " " + time);
        
        
        
    
    
    }
}
