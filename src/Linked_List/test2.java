package Linked_List;

import java.util.*;

class farm
{
    public int hens;
    public int cows;
    farm(int hens,int cows)
    {
        this.hens=hens;
        this.cows=cows;
    }
}

public class test2 {
    public static void main(String[] args) throws Exception
    {
        farm[] f= new farm[4];
        f[0]=new farm(10,32);
        f[1]=new farm(23,16);
        f[2]=new farm(21,89);
        f[3]=new farm(27,22);
        System.out.println(MaxLegs(f));
        
    }


    static int MaxLegs(farm[] farms) throws java.lang.Exception
    {
        ArrayList<Integer> arr=new ArrayList<>();
        int legs=0;
        if(farms.length==0)
        {
            return -1;
        }
        for(int i=0;i<farms.length;i++)
        {
            arr.add((farms[i].hens*2)+(farms[i].cows*4));
        }
        return Collections.max(arr);
    }
}
