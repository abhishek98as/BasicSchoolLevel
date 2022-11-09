package School_Level;

public class Bitwise_swapping {
    public static void main(String[] args) {
        int a=2;
        int b=3;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

//        a=a-b;
//        b=a+b;
//        a=a-b;

        System.out.println(a +" "+ b);

    }
}
