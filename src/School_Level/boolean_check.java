package School_Level;

public class boolean_check {
    public static void main(String[] args) {
        int k=3;boolean flag=false;
        int a[]={1,2,3,4,5};int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
                flag=true;
            if(flag==true)
            {
                break;
            }
        }
        System.out.println(flag);
    }
}
