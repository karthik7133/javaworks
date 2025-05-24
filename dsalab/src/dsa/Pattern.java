package dsa;
import java.util.*;

public class Pattern {
	public static void main(String[] args) {
		int n=6;
		for (int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				if(j==4+i || j==4-i ||(i==4 &&j<6)) {
					System.out.print("* ");
				}else System.out.print(" ");
			}System.out.println();
		}
	}
	
}
