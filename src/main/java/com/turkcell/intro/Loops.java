package com.turkcell.intro;

public class Loops {
    public static void main(String[] args) {
        // İterasyon
        System.out.println("Merhaba");

        // Programlamada liste eleman sayısı 0dan başlanarak sayılır.
        int[] numbers = {10,20,30,40}; // array-dizi
        System.out.println(numbers[1] * 5);
            // değişken, şart, aksiyon
        // i++; i+=1;
        for (int i=5; i<10; i++)
        {
            System.out.println(i);
            System.out.println("Merhaba");
        }

        /*for (int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i] * 5);
        }*/
        for (int number: numbers) {
            System.out.println(number * 5);
        }

        // Koşulu kontrol eder, çalışmaya başlar.
        int a = 0;
        while (a>5) {
            a++;
            System.out.println("While çalıştı..");
        }

        // Çalışmaya başlar, koşulu kontrol eder.
        int i=0;
        do{
            System.out.println("Do while çalıştı.");
            i++;
        }while(i>5);


        String[] ogrenciler = { "Utku","Muzaffer","Seçil","Özgür" };

        for (String ogrenci: ogrenciler) {
            // Muzaffer isimli öğrenci es geçilsin.
            if (ogrenci.equals("Muzaffer")){
                //continue; // Bu iterasyonu burada bitir. Sonrakine geç.
                break; // Bu döngüyü tamamen kır (bitir).
            }
            System.out.println("Öğrenci: " + ogrenci + " için işlem yapılıyor.");
        }
    }
}
