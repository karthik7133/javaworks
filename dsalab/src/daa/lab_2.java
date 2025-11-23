package daa;
import java.util.*;
public class lab_2 {
	public static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr, 0, arr.length - 1);
        System.out.print("The sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int maxDigitSum = -1;
        int maxDigitSumInt = -1;
        for (int num : arr) {
            int currentDigitSum = digitSum(num);
            if (currentDigitSum > maxDigitSum) {
                maxDigitSum = currentDigitSum;
                maxDigitSumInt = num;
            }
        }
        System.out.println("The integer with the highest digit sum is: " + maxDigitSumInt);
        sc.close();
    }
}
/*
 * // You are using Java
import java.util.*;
public class  Main{
    public static int digitsum(int x){
        int s=0;
        while(x>0){
            s+=x%10;
            x/=10;
        }return s;
    }
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }int d=x.nextInt();
        int ans=-1;
        for(int num:a){
            if(digitsum(num)==d){
                if(ans==-1 || num<ans){
                    ans=num;
                }
            }
        }System.out.println(ans);
        x.close();
    }
}*/
