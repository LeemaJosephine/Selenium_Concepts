package day24;


abstract class Sample{
	
	public abstract void add();
	
	public void sub() {
		
		System.out.println("Implemented sub methods");
	}
	
}

class Sample1 extends Sample{
	
	public void add() {
		
		System.out.println("Add method");
	}
	
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample1 obj = new Sample1();
		obj.add();
		obj.sub();
		
			
		
	}

}
