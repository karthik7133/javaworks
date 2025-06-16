package practise;
import java.util.*;
public class ex_34 {
	public static void main(String[] args) {
		int[][] m1 = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		int[][] m2 = {
			    
			    {4, 5, 6},
			    {7, 8, 9}
			};
		MatrixComparison m=new MatrixComparison();
		try {
			System.out.println(m.MatricesEqual(m1, m2));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
interface MatrixCompartor{
	boolean MatricesEqual(int a[][] ,int [][]b)throws Exception;
}
class MatrixComparison implements MatrixCompartor{

	@Override
	public boolean MatricesEqual(int a[][] ,int [][]b) throws Exception{
		boolean flag=true;
		if(a.length==b.length & a[0].length==b[0].length) {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					if(a[i][j]==b[i][j])continue;
					else {flag =false;
					throw new MatrixMismatchException("Matrices are not equal!");}
				}
			}
		}else {
			flag=false;
			throw new MatrixMismatchException("Matrices are not equal!");
		}
		return flag;
	}
	
}
class MatrixMismatchException extends Exception{
	MatrixMismatchException(String message){
		super(message);
	}
}