package _07_Method_Creation.Çözümler;

import java.util.Scanner;

public class Soru_02 {


    public static void main(String[] args) {
       /* Problem Tanımı :
         Basit 4 işlem yapan bir hesap makinesi kodlayınız....
         Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
         Kullanicidan iki sayi girmesini isteyiniz.
         Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
       */
        Scanner scan = new Scanner(System.in);
        System.out.print("+, -, x, : islemlerinden birini seciniz : ");
        char islem = scan.next().charAt(0);

        System.out.print("Islem yapmak icin ilk sayıyı giriniz : ");
        double num1 = scan.nextDouble();

        System.out.print("Islem yapmak icin ikinci sayıyı giriniz : ");
        double num2 = scan.nextDouble();

        hesapMakinasi(islem, num1, num2);

    }

    public static void hesapMakinasi(char islem, double num1, double num2) {

        switch (islem) {

            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 'x':
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case ':':
                System.out.println(num1 + " : " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("+,-,x,: disinda bir islem secmeyiniz");

        }
    }
}
