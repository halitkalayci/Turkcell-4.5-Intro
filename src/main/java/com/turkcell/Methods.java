package com.turkcell;

public class Methods {
    public static void main(String[] args) {
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc1234");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc123");

        topla(5,5);
        topla(10,20);
    }
    // erişim_belirleyici static dönüş_tipi fonksiyonAdı() {}
    public static void veritabaninaBaglan(String veritabaniAdi)
    {
        System.out.println(veritabaniAdi + " Veritabanı bağlantısı. x15");
    }
    public static void topla(int a, int b){
        System.out.println(a+b);
    }
}
