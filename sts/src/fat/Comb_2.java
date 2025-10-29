package fat;
import java.util.Scanner;
class Comb_2{
    static void comb(int n,int a[],int r,int idx,int c[],int i){
        //base case 
        if(idx == r){//once we got the required r length combination print it 
            for(int j=0;j<r;j++) System.out.print(c[j]+" ");//1 2,1 3,1 4
            System.out.println();//after every combination printing move to new line
            return;//stop the current recursive call 
        }
        if(i>=n) return;//for checking the edge case or limits 
        c[idx] = a[i];//c[0] = a[1]=> c[0] = 1,c[1] = a[1]=>c[1] = 2,c[1]=a[2]=>c[1]=3
        //so next step is we need to add c[1] = a[1] for that idx and i values should increment by +1
        comb(n,a,r,idx+1,c,i+1);
        comb(n,a,r,idx,c,i+1);//now idx=1,i=1+1=>2,idx=1,i=2+1=>3,idx=1,i=3+1=>4
    }
    public static void main(String ar[]){
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i] = sw.nextInt();
        int r = sw.nextInt();//combination length we need 
        int c[] = new int[r];//we need to store the o/p combinations
        comb(n,a,r,0,c,0);
    }
}