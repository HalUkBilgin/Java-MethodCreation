package _07_Method_Creation.Sorular;

public class _02MethodParameters {
    public static void main(String[] args) {
topla();
topla1();
topla2(50);
topla3(20,50);
topla4(10,50,4);
    }
    public static void topla(){
        int top=0;
        for (int i = 0; i <=100 ; i++) {
            top+=i;

        }
        System.out.println(top);
    }
    public static void topla1(){
        int top=0;
        for (int i = 0; i <=50 ; i++) {
            top+=i;

        }
        System.out.println(top);
    }
    public static void topla2(int max){
        int top=0;
        for (int i = 0; i <=max ; i++) {
            top+=i;

        }
        System.out.println(top);
    }
    public static void topla3(int min,int max){
        int top=0;
        for (int i = min; i <=max ; i++) {
            top+=i;

        }
        System.out.println(top);
    }
    public static void topla4(int min,int max,int artMik){
        int top=0;
        for (int i = min; i <=max ; i+=artMik) {
            top+=i;

        }
        System.out.println(top);
    }
}
