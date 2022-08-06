package School_Level;

import java.util.Scanner;

public class Get_String_Firest_Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();

        s=s.trim();
        String f="";

        s=" "+s;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
                f = f + Character.toUpperCase(s.charAt(++i)) + ".";
        }

        }
    }
}
