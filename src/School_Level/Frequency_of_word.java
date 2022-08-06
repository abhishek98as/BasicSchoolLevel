package School_Level;

import java.util.Scanner;

public class Frequency_of_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String word=sc.nextLine();
        word=word.toLowerCase();
        int count=0;
        System.out.println("Character \t Frequency");
        for(char ch='a'; ch<='z'; ch++)
        {
            for(int i=0; i<word.length(); i++)
            {
                if(ch==word.charAt(i))
                    count++;
            }
            if(count !=0)
            System.out.println(ch+ "\t\t \t\t" +count);
        }
    }
}
