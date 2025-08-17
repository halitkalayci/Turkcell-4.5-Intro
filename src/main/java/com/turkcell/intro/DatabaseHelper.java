package com.turkcell.intro;

public class DatabaseHelper
{
    // static -> Bulunduğu nesnenin türetilmesine gerek duymadan çalışabilir.
    // override edilemez.
    public static void connect(String username, String password){
        System.out.println("Varsayılan bilgiler ve kullanıcı bilgisi ile giriş yapılıyor.");
    }
    public static void connect(String username, String password, String url) {
        System.out.println("URL bilgisindeki db'e bağlanıyor.");
    }
}
