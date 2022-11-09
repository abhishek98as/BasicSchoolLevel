package School_Level;

import java.util.HashSet;

public class Removing_dublicate_from_string_by_Hashset {
    public static void main(String[] args) {
        String str="abhishek";
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<str.length(); i++)
        {
            set.add(str.charAt(i));
        }
        //System.out.println(set);
        for(char x:set)
        {
            System.out.print(x);
        }
  /*String s2="";String s3="";int c=0;
        for(int i=0; i<str.length(); i++){
            int count=0;
            for(int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j) ) {
                    count = count + 1;
                    c=1;
                }

            }
            if(count<2)
                s2=s2+str.charAt(i);
            else
                s3=s3+str.charAt(i);

            System.out.println(str.charAt(i)+" "+count);
        }
        System.out.println(s2);
        System.out.println(s3);
        for(int i=0;i<str.length();i++)
        {
           for(int j=0;j<s3.length();j++)
           {
               if(str.charAt(i)==s3.charAt(j))
               {

               }
           }
        }*/
    }
}
