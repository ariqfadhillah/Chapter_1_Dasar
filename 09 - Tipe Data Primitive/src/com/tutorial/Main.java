package com.tutorial;

public class Main {
    public static void main(String[] args){

        // Integer (satuan)
        int i = 10;
        System.out.println("=====INTEGER=====");
        System.out.println("ini adalah i = "+ i);
        System.out.println("Nilai Maxi = "+ Integer.MAX_VALUE);
        System.out.println("Nilai Min = "+ Integer.MIN_VALUE);
        System.out.println("Besar Integer = " + Integer.BYTES + (" Bytes"));    /* 1 Bytes = 8 bit */
        System.out.println("Besar Integer = " + Integer.SIZE + (" Bit"));

        // byte (satuan) bit itu kan biner 0, 1. so! dia dibuat 1 pangkat 32 dech
        byte b = 10;
        System.out.println("=====byte=====");
        System.out.println("ini adalah b = "+ b);
        System.out.println("Nilai Maxi = "+ Byte.MAX_VALUE);
        System.out.println("Nilai Min = "+ Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + (" Bytes"));    /* 1 Bytes = 8 bit */
        System.out.println("Besar byte = " + Byte.SIZE + (" Bit"));

        // short (satuan)
        short s = 10;
        System.out.println("=====short=====");
        System.out.println("ini adalah s = "+ s);
        System.out.println("Nilai Maxi = "+ Short.MAX_VALUE);
        System.out.println("Nilai Min = "+ Short.MIN_VALUE);
        System.out.println("Besar short = " + Short.BYTES + (" Bytes"));    /* 1 Bytes = 8 bit */
        System.out.println("Besar short = " + Short.SIZE + (" Bit"));

        // long (satuan)
        long l = 10L;
        System.out.println("=====long=====");
        System.out.println("ini adalah l = "+ l);
        System.out.println("Nilai Maxi = "+ Long.MAX_VALUE);
        System.out.println("Nilai Min = "+ Long.MIN_VALUE);
        System.out.println("Besar long = " + Long.BYTES + (" Bytes"));    /* 1 Bytes = 8 bit */
        System.out.println("Besar long = " + Long.SIZE + (" Bit"));

        // double (ada komanya, bilangan real)
        double d = 10.5d;
        System.out.println("=====double=====");
        System.out.println("ini adalah d = "+ d);
        System.out.println("Nilai Maxi = "+ Double.MAX_VALUE);
        System.out.println("Nilai Min = "+ Double.MIN_VALUE);
        System.out.println("Besar double = " + Double.BYTES + (" Bytes"));    /* 1 Bytes = 8 bit */
        System.out.println("Besar double = " + Double.SIZE + (" Bit"));

        // float (ada komanya, bilangan real)
        float f = 10.5f;
        System.out.println("=====float=====");
        System.out.println("ini adalah f = "+ f);
        System.out.println("Nilai Maxi = "+ Float.MAX_VALUE);
        System.out.println("Nilai Min = "+ Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES + (" Bytes"));    /* 1 Bytes = 8 bit */
        System.out.println("Besar float = " + Float.SIZE + (" Bit"));

        // char (Karakter,Berdasarkan ASCI code, so! dia bentuk nya simbol guys!)
        char c = 'c';
        System.out.println("=====char=====");
        System.out.println("ini adalah c = "+ c);
        System.out.println("Nilai Maxi = "+ Character.MAX_VALUE);
        System.out.println("Nilai Min = "+ Character.MIN_VALUE);
        System.out.println("Besar char = " + Character.BYTES + (" Bytes"));    /* 1 Bytes = 8 bit */
        System.out.println("Besar char = " + Character.SIZE + (" Bit"));

        // boolean (Isinya hanya ada true dan false)
        boolean val = true;
        System.out.println("=====boolean=====");
        System.out.println("ini adalah val = "+ val);
        System.out.println("Nilai Maxi = "+ Boolean.TRUE);
        System.out.println("Nilai Min = "+ Boolean.FALSE);
    }
}
