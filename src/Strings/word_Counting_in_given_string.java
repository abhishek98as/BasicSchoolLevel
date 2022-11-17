package Strings;

import java.util.ArrayList;

public class word_Counting_in_given_string {
    public static void main(String[] args) {
//        String str="hello i am going to learn java programming";
        int[] a={-1,-1,-2,34,-5,6,-6};
        ArrayList<Integer> lst = new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<a.length;i++)
        {
            if(lst.contains(a[i]))
            {
                ans.add(a[i]);
            }
            else
            {
                lst.add(a[i]);
            }
        }

        System.out.println(ans);
//        int[] fian= new int[ans.size()];
//        for(int i=0; i<ans.size(); i++)
//        {
//            fian[i]= ans.get(i);
//        }
//        return fian;
    }
}
