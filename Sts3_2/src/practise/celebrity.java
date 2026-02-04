package practise;

public class celebrity {
	static boolean[][] knows = {
            {false, true,  true,  false},
            {false, false, false,  false},
            {false, true, false, false},
            {false, true, false,  false}
    };
	public static void main(String[] args) {
		System.out.println(cel());
	}
	static int cel() {
		int c=0;
		for(int i=1;i<knows.length;i++) {
			if(knows[c][i])c=i;
		}
		for(int i=0;i<knows.length;i++) {
			if(i!=c) {
				if(knows[c][i] || !knows[i][c])return -1;
			}
		}return c;
	}
}
