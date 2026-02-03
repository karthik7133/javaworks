package cat_1;

import java.util.Scanner;

class practise{
    static node head =null;
    static node p=null;
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        System.out.println("enter no of elements:");
        int n=x.nextInt();
        head=new node(x.nextInt());
        p=head;
        for(int i=1;i<n;i++){
            insert(x.nextInt());
        }
        
        display(head);
    }
    public static void insert(int d){
        node newd= new node(d);
        p.next=newd;
        p=p.next;
    }
    public static void display(node h){
        node t=h;
        while(t.next!=null){
            System.out.print(t.data+"->");
            t=t.next;
        }
        System.out.println(t.data);
    }
}
//class node{
//    int data;node next;
//    node(int d){
//        data=d;
//        this.next=null;
//    }
//}