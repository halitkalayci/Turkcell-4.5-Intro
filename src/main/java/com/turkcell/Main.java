package com.turkcell;

public class Main {
    public static void main(String[] args)
    {
        // Bu bir yorum satırıdır.
        System.out.println("Halit Enes Kalaycı");

        // Syntax => Söz dizim kuralları.
        // Değişkenler => Programlamada verilerin bir isimle tanımlandıktan sonra tutulmasıdır.
        int yas = 25; // Tamsayı numerik değerlere "integer,int" diyoruz.
        yas = 30; // set
        System.out.println(yas); // get
        yas = 40;
        //
        String isim = "Halit Enes Kalaycı";
        System.out.println(isim);
        isim = "Engin Demiroğ";

        float sayi = 10.14F;
        double sayi1 = 10.14;
        long sayi2 = 10L; // Tam sayı, sınırları büyük.
        short sayi3 = 11;
        char karakter = 'K'; // Encoding
        boolean aktif = true;


        // Aritmetik Operatörler
        System.out.println(10 + 10);
        System.out.println(11 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        System.out.println(100 % 3); // Mod (Bölümünden kalan)
        //

        // Atama Operatörleri
        int a = 10;
        a = 15;
        a += 5; // A'nın değeri üzerine 5 ekle.
        a -= 5; // A'nın değerinden 5 çıkar
        a *= 5; // A'yı 5 ile çarp
        a /= 5; // A'yı 5'e böl.
        // a = a + 5
        System.out.println(a);
        //

        // Karşılaştırma Operatörleri -> Sonuç olarak boolean değer dönen operatörlerdir.
        System.out.println(a == 15); // A 15'e eşit mi?
        System.out.println(a != 15); // A 15'e eşit değil mi?

        System.out.println(a > 10);
        System.out.println(a >= 15);

        System.out.println(a < 20);
        System.out.println(a <= 15);
        //

        // Mantık Operatörleri
        // Ve => && => İki koşulun da true olmasını ister.
        yas = 18;
        System.out.println(a == 16 && yas > 18); // short-circuit çalışır.
        System.out.println(a == 15 || yas > 18); // short-circuit çalışır.
        //

        // Yaş 18'den büyükse ekrana kişi reşit yazsın değilse değil yazsın.
        // Şart-Koşul Blokları

        if (yas >= 18) // eğer 18den büyükse
        {
            System.out.println("Kişi reşit."); // X
        }
        else if (yas == 18) // 18den büyük değil ama 18'e eşitse
        {
            System.out.println("Kişi tam 18, ay kontrolü yapılmalı."); // Z
        }
        else
        {
            System.out.println("Kişi reşit değil"); // Y
        }

        boolean admin = true;
        if(admin)
        {
            System.out.println("Logla");
        }

    }
}

