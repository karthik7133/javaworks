package leetcode;
import java.util.*;
public class island {
	static char[][] grid = {
		    {'1','1','0','0','0'},
		    {'1','1','0','0','0'},
		    {'0','0','1','0','0'},
		    {'0','0','0','1','1'}
		};
	static int c=0;
	public static void main(String[] args) {
		
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]=='1') {
					c++;bfs(i,j);
				}
				
			}
		}
		System.out.println(c);
	}
	static void bfs(int i,int j) {
		if(i<0||j<0||i>=grid.length || j>=grid[0].length ||grid[i][j]==0 )return;
		if(grid[i][j]=='1') {
			grid[i][j]='0';
			bfs(i+1,j);
			bfs(i,j+1);
			bfs(i-1,j);
			bfs(i,j-1);
		}
	}
}
