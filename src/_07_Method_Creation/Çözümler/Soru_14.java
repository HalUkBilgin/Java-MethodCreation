package _07_Method_Creation.Çözümler;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru_14 {
    public static void main(String[] args) {
        /*
        Problem Tanımı :
        parametre olarak Integer Arraylist alan ve return type int olan hillNum isminde br method yazınız
        method ; kendinden önceki sayıdan küçük kendinden sonrakinden büyük olan sayıyı yazdırsın
        Test data:
        input : ArrayList 5,4,6,2,1
        output : 2
        2; 6 dan küçük 1 den büyük
         */

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 4, 6, 2, 1));

        System.out.println(hillName(arrayList));
    }

    public static int hillName(ArrayList<Integer> arrayList) {
        int myHillNum = 0;
        for (int i = 1; i < arrayList.size() - 1; i++) {//ilk eleamn ve son eleman işleme giremez onu için 1 ve size()-1 aldık

            if ((arrayList.get(i)) < arrayList.get(i - 1) && arrayList.get(i) > arrayList.get(i + 1)) {

                myHillNum = arrayList.get(i);
            }
        }
        return myHillNum;
    }
}

