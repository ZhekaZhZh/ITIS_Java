package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();

    t1.start();
    t2.start();

    }
}

/*
//import java.security.MessageDigest;

public class Main {

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);

        }
    }
}
*/