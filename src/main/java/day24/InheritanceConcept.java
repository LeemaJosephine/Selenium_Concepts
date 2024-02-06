package day24;


class Calc1{
	
	int a,b;
	
	public void add() {
		
		int c= a+b;
		System.out.println("Normal add " +c);
	}
	
	public void add(int a, int b) {
		
		this.a=a;
		this.b=b;
		int c = a+b;
		System.out.println("Adding with two parameters : " +c);
		
	}
	public void sub() {
		
		System.out.println(a-b);
	}
	
}

class Calc2 extends Calc1{
	
	public void add() {
		
		int c = a+b+1;
		System.out.println("Adding with 1 " + c);
	}
	public void div(int a,int b) {
		
		this.a=a;
		this.b=b;
		System.out.println(a/b);
	}
	
	public void mul(int a,int b) {
		
		this.a=a;
		this.b=b;
		System.out.println(a*b);
	}
}

class Calc3 extends Calc2{
	
	public void mod() {
		
		System.out.println(a%b);
	}
}

public class InheritanceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		Calc3 obj = new Calc3();
		obj.a=10;
		obj.b=20;
		obj.add();
		obj.add(10, 1);
		
		Calc1 obj1 = new Calc1();
		obj1.a=1;
		obj1.b=2;
		obj1.add();
		
	}

}
