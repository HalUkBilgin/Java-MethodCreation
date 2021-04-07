package _07_Method_Creation.Sorular;

public class _04MethodVarargs {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        System.out.println(topla(1, 3, 5, 7, 9));
        System.out.println(topla(arr));

        System.out.println(arrTop(arr));
    }

    //arrays metod
    public static int arrTop(int[] arr) {
        int toplam = 0;
        for (int i : arr) {
            toplam += i;

        }
        return toplam;
    }

    //varargs metodh
    public static int topla(int... num) {
        int toplam = 0;
        for (int top : num) {
            toplam += top;
        }
        return toplam;
    }

}
