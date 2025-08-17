package com.turkcell;

public class DatabaseHelper
{
    // static -> Bulunduğu nesnenin türetilmesine gerek duymadan çalışabilir.
    public static void connect(String username, String password){
        System.out.println("Varsayılan bilgiler ve kullanıcı bilgisi ile giriş yapılıyor.");
    }
    public static void connect(String username, String password, String url) {
        System.out.println("URL bilgisindeki db'e bağlanıyor.");
    }
}
