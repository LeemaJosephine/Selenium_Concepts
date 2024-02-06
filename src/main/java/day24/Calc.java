package day24;


class Addition{
	
	int a;
	int b;
	int c;
	
	public Addition(int a,int b) {  // parametrized constructor
		
		this.a=a;
		this.b=b;
		c = a + b;
		
	}
	public void add() {
		
		System.out.println(c);
		
	}
}


public class Calc {

	public static void main(String[] args) {
		
		Addition obj = new Addition(10, 20);
		obj.add();

	}

}
