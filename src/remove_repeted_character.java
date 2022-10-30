import java.util.Scanner;

public class remove_repeted_character {
    public static void main(String[] args) {

        //create scanner to take user input
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();

        String n="";
        char prevChar=' ';

        for(int i=0; i<s.length(); i++)
        {
            if(prevChar != s .charAt(i));
                 n=n+s.charAt(i);

            prevChar=s.charAt(i);
        }
        System.out.println(n);
    }
}
