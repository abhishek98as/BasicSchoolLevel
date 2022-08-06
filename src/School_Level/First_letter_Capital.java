package School_Level;//Problem:- Print a string whose a School_Level.first letter is capital.

import java.util.Scanner;
//import scanner class for take input.

public class First_letter_Capital {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        //store string sentence in word
        String word=sc.nextLine();

       // make 3 variable for remove extra space &
        //add one space initially & create final string.
        word=word.trim();
        word=" "+word;
        String f="";

        //1.run a for loop iterate whole string word by word.
        //2.take variable and store  an each word.
        //3.check condition for spaces before gape string (eg.   _Hello_world)

        for(int i=0; i<word.length(); i++){
            char ch= word.charAt(i);
            if(ch ==' ')
            {
        //store in f then i++ next word
        //convert in  to Uppper case of firest letter
                f=f + ch;
                i++;
                ch=word.charAt(i);
                f=f+Character.toUpperCase(ch);

        // only 1 string found return only a single string
            }
            else
            {
                f=f+ch;
            }
        }
        System.out.println(f);

    }
}
