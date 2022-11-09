//package Linked_List;
//
//import java.util.Scanner;
//
//class node
//{
//    int data;
//    node next;
//    node(int data)
//    {
//        this.data= data;
//        next=null;
//        System.out.println("node created");
//    }
//}
//public class Learn_linked_list {
//    node createlinkedlist()
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the data");
//        int m=sc.nextInt();
//        node h1=new node(m);
//        node head=h1;
//        System.out.println("do you want new node choose y/n");
//        String option=sc.next();
//        while(option.equals("y"))
//        {
//            System.out.println("enter the data");
//            int m1=sc.nextInt();
//            node h2=new node(m1);
//            h1.next=h2;
//            h1=h2;
//            System.out.println("do you want new node choose y/n");
//            option=sc.next();
//        }
//        return head;
//    }
//    void display(node head)
//    {
//        while(head!=null)
//        {
//            System.out.print(head.data+" ");
//            head=head.next;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        linked_list ll=new linked_list();
//        node head=ll.createlinkedlist();
//        ll.display(head);
//        head=ll.addatend(head);
//
//
//
//    }
//
//    public node addatend(node newhead)
//    {
//        //write your code here
//        node h1=new node(newhead);
//        h1.data=
//
//}
//}
//
