package School_Level;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Palindrome_string {
    public static void main(String[] args) {
        //calling object of one method
            Palindrome_string obj=new Palindrome_string();

            //create scanner to take user input
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();

        //variable for length, counting the palindrome & last word.
        int l=s.length();
        char last=s.charAt(l-1);
        int count=0;

        //check input have valid sentence via (.?!) symbol at blast.
        if(!(last=='.' || last== '?' || last=='!')){
            System.out.println("invalid sentence ");
            return;
        }
//user to make a valid Upper Case via this method also .
// remove initial and final blank space by trim method.
        s=s.toUpperCase();
        s=s.trim();

//To extract word from string using stringtokeniser.
//also import java.util package.
        StringTokenizer st=new StringTokenizer(s," .?!");
        while(st.hasMoreTokens())
             {
            String word=st.nextToken();
            if(obj.palindrom_check(word))
            {
                System.out.print(word+" ");
                count++;
            }
        }
        System.out.println("no of palindrom="+count);
    }
//function for checking palindrome extracted string from string tokenizer.
    public boolean palindrom_check(String w)
        {
        String rev="";
        for(int i=w.length()-1; i>=0; i--)
        {
            rev=rev+w.charAt(i);
        }
       if(rev.equals(w)){
           return true;
       }
       else
           return false;
    }
}
