package check_no;

import java.util.Scanner;

public class _is_PNZ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = -5;

        if (num == 0)
        {
            System.out.println ("Zero");
        }

        else{
            String result = num > 0 ? "The number is positive" : "The number is negative";
            System.out.println (result);
        }
    }
}
