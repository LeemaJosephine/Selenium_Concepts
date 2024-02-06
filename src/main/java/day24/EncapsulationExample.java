package day24;


class Encaps{
	
	private int a;
	private int b;
	
	public void setA(int a) {
		
		this.a=a;
		
	}
	
	public void setB(int b) {
		
		this.b=b;
	
	}
	
	public void getA() {
		
		System.out.println(a);
	}
	
	public void getB() {
		
		System.out.println(b);
	}
	
}
public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encaps obj = new Encaps();
		obj.setA(10);
		obj.setB(20);
		obj.getA();
		obj.getB();
	
	}

}
