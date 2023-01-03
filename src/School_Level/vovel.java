package School_Level;

public class vovel {
    public static void main(String[] args) {
        String s="practice";
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
                    s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                str+=s.charAt(i);
            }

        }
        String s1="";
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
                    s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                s1+=str.charAt(temp);
                temp++;
            }
            else{
                s1+=s.charAt(i);
            }

        }
        System.out.println(s1);
    }
}
