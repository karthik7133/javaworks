package shortsem_1;

public class example {
	public static void main(String[] args) {
		
		Calculator2 c=new Calculator2();
		c.add();
		Calculator2 c1=new Calculator2(2,3);
		c1.add();
		Calculator2 c2=new Calculator2(c1);
		c2.add();
	}
}
class Calculator2{
	int a,b;
	Calculator2(){
		this.a=0;
		this.b=0;
	}
	Calculator2(int a,int b){
		this.a=a;
		this.b=b;
	}
	Calculator2(Calculator2 cal){
		this.a=cal.a;
		this.b=cal.b;
	}
	public void add() {
		int c=a+b;
		System.out.println("sum:"+c);
	}
}

