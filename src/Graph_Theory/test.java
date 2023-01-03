package Graph_Theory;

public class test {
    public static void main(String[] args) {
        int c=0;
        int x=1;
        int n=20;
        while(x<=n)
        {
 for(int i=1; i<=x; i++){
     if(x%i==0) {
         c=c+1;

     }
 }
 if(c==2)
     System.out.println("prime number"+ x);
 else
     System.out.println("not aa prime number");
 c=0;
    x=x+1;
        }
    }
}
