package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // operator komparasi... ini akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        // operator equal atau persamaan
        System.out.println("======= Persamaan");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);

        // operator not equal atau pertidaksamaan
        System.out.println("======= Pertidaksamaan");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);

        // operator less than atau kurang dari
        System.out.println("======= Kurang Dari");
        a = 10;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);

        // operator greater than atau lebih dari
        System.out.println("======= Lebih Dari");
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);

        // operator less than atau kurang dari sama dengan
        System.out.println("======= Kurang Dari Sama Dengan");
        a = 9;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);

        // operator greater than equal atau lebih dari sama dengan
        System.out.println("======= Lebih Dari Sama Dengan");
        a = 9;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);
    }
}
