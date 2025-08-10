package com.turkcell;

public class Methods {
    public static void main(String[] args) {
        veritabaninaBaglan("a");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc1234");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc123");

        int sayi1 = topla(5,5);
        System.out.println(sayi1);


        int sayi2 = topla(10,20);
        System.out.println(sayi2+50);

        int sayi3 = topla(10,20,30,40,50);
        int sayi4 = topla(10,20,30);

    }
    // erişim_belirleyici static dönüş_tipi fonksiyonAdı() {}
    public static void veritabaninaBaglan(String veritabaniAdi)
    {
        // Eğer veritabanı adı 2 haneden küçükse bağlanmaya çalışma.
        if (veritabaniAdi.length() <= 2)
            return; // Buraya geldiği an fonksiyonu bitir.
        System.out.println(veritabaniAdi + " Veritabanı bağlantısı. x15");
    }
    public static int topla(int a, int b)
    {
        return a+b;
    }

    public static int topla(int... a){
        int toplam=0;
        for (int sayi: a)
        {
            toplam += sayi;
        }
        return toplam;
    }
}
