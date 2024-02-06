package day24;


class Inter extends Calc2 implements InterfaceConcept{
	
	int a,b;
	public void add() {
		
		System.out.println(a+b);
		
	}
	
	public void sub() {
		
		System.out.println(a-b);
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inter obj = new Inter();
		obj.a=10;
		obj.b=1;
		obj.add();
		obj.sub();
		obj.mul(obj.a,obj.b);
		obj.div(obj.a,obj.b);
	}

}
