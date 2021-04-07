package _07_Method_Creation.Sorular;

public class _03MethodReturnType {
    public static void main(String[] args) {

        int a=topla4(5,15,3);

        System.out.println(a);
    }





    public static int topla4(int min, int max, int artMik) {
        int top = 0;
        for (int i = min; i <= max; i += artMik) {
            top += i;

        }
        //System.out.println(top);
        return top;
    }
}

