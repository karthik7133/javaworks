package daa;
import java.util.*;
public class lab_1 {
	static void quicksort(int [] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
            
        }
    }
    static int partition(int arr[] ,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        quicksort(arr,0,n-1);
        boolean found=false;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("The element "+arr[i]+" occurs at the indices "+i+" and "+(i+1) );
                found=true;
                break;
            }
        }
        if(!found){
            System.out.print("All the values are distinct");
        }x.close();
    }
}
/*
 * // You are using Java
import java.util.*;
 class Main{
     public static void quicksort(int [] arr,int low,int high){
         if(low<high){
             int pi=partition(arr,low,high);
             quicksort(arr,low,pi-1);
             quicksort(arr,pi+1,high);
         }
     }
     public static int partition(int []arr,int low,int high){
         int pivot=arr[high];
         int i=low-1;
         for(int j=low;j<high;j++){
             if(arr[j]<=pivot){
                 i++;
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
             }
         }int temp=arr[i+1];
         arr[i+1]=arr[high];
         arr[high]=temp;
         return i+1;
     }
     public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        quicksort(a,0,n-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
     }
 }*/
