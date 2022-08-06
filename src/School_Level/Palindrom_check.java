package School_Level;

import java.util.Scanner;

public class Palindrom_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        String rev ="";

        for(int i=word.length()-1; i>=0; i--){
            rev=rev+word.charAt(i);
        }
        if(word.equals(rev)){
            System.out.println(word+"word is plaindrome" );
        }
        else{
            System.out.println("it is not palindromne");
        }

    }
}
