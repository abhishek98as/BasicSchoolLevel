public class loops2 {
    public static void main(String[] args) {
        char ch;
        int x=97;

        do{
            ch=(char)x;
            System.out.println(ch+" ");
            if(x%10==0)
                break;
            ++x;
        }
        while(x<=100);
    }
}
