package Giris;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        // değişkenleri oluştur
        int mat, fizik, kimya,turkce,tarih,muzik;

        //scanner sınıfını tanımla
        Scanner girdi=new Scanner(System.in);

        //kullanıcıdan değeri al
        System.out.print("Matematik Notunuz:");
        mat=girdi.nextInt();
        System.out.print("Fizik Notunuz:");
        fizik=girdi.nextInt();
        System.out.print("Kimya Notunuz:");
        kimya=girdi.nextInt();
        System.out.print("Türkçe Notunuz:");
        turkce=girdi.nextInt();
        System.out.print("Tarih Notunuz:");
        tarih=girdi.nextInt();
        System.out.print("Müzk Notunuz:");
        muzik=girdi.nextInt();
        double ortalama= (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.print("Not Ortalamanız: "+ortalama);
        boolean durum=ortalama>60;
        System.out.println(durum ? "->Geçti":"->Kaldı");
    }
}
