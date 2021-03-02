package com.latihan;

import java.util.*;

public class Main {

    public static void main(String[] args) {

      /*  Scanner inputUser;
        float a, b, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.println("nilai a=");
        a = inputUser.nextFloat();
        System.out.println("operator=");
        operator = inputUser.next().charAt(0);
        System.out.println("nilai b=");
        b = inputUser.nextFloat();

        System.out.println("input user: " + a + " "+ operator+ " "+b);
        // penjumlahan
        if (operator == '+') {
            hasil = a + b;
            System.out.println("hasil" + hasil);
        // pengurangan
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("hasil" + hasil);
        // perkalian
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("hasil" + hasil);
        // pembagian
        }else  if (operator == '/'){
              if (b == 0){
                  System.out.println("pembagi nol menghasilkan operator tak hingga");
              }else{
            hasil = a / b;
                System.out.println("hasil ="+ hasil);}
            }else System.out.println("operator tidak ditemukan"); */


        Scanner inputUser;
        float a, b, hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.println("nilai a=");
        a = inputUser.nextFloat();
        System.out.println("operator=");
        operator = inputUser.next();
        System.out.println("nilai b=");
        b = inputUser.nextFloat();

        switch (operator) {
            case "+":
                //penjumlahan
                hasil = a + b;
                System.out.println("hasil =" + hasil);
                break;
            case "-":
                //pengurangan
                hasil = a - b;
                System.out.println("hasil =" + hasil);
                break;
            case "*":
                //perkalian
                hasil = a * b;
                System.out.println("hasil =" + hasil);
                break;
            case "/":
                //pembagian
                hasil = a / b;
                System.out.println("hasil =" + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }
    }
}
































               /* int nilaiBenar = 7;
                int nilaiTebakan ;
                boolean statusTebakan;

                System.out.println("masukan nilai tebakan anda:");
                nilaiTebakan = inputUser.nextInt();
                System.out.println("nilai tebakan anda adalah:"+ nilaiTebakan);

                statusTebakan = (nilaiTebakan == nilaiBenar);
                System.out.println("tebakan anda:"+ statusTebakan);

                System.out.println("masukan nilai diantara 4 dan 9:");
                nilaiTebakan = inputUser.nextInt();

                statusTebakan =(nilaiTebakan >4) && (nilaiTebakan <9);
                System.out.println("tebakan anda:"+ statusTebakan);*/











