package _07_Method_Creation.Sorular;

import java.util.Scanner;

public class Soru_02 {

          /*
            Problem Tanımı :
            Basit 4 işlem yapan bir hesap makinesi kodlayınız....
            Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
            Kullanicidan iki sayi girmesini isteyiniz.
            Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
          */
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
        System.out.print("yapacağınız işlemi x + - / olarak seçiniz : ");
        char islem=sc.next().charAt(0);

        System.out.print("işlme için ilk sayıyı giriniz : ");
        double num1= sc.nextDouble();

        System.out.print("işlme için ikinci  sayıyı giriniz : ");
        double num2= sc.nextDouble();

        hesapMakinesi(islem,num1,num2);
    }

    public static void hesapMakinesi( char islem,double num1, double num2) {


        switch (islem){

            case '+':
                System.out.println(num1+"+"+num2+"="+(num1+num2));
                break;
            case '-':
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                break;
            case 'x':
                System.out.println(num1+"x"+num2+"="+(num1*num2));
                break;
            case '/':
                System.out.println(num1+"/"+num2+"="+(num1/num2));
                break;
            default:
                System.out.println("dört işlem harici bir seçim yaptınız");
        }

    }


}
