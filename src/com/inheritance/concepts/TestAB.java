package src.com.inheritance.concepts;

public class TestAB {
	public static void main(String[] args) {
		
		A aa = new B();
		System.out.println(aa.a);
		System.out.println(aa.b);
		aa.m1();
		aa.m2();
		System.out.println("********");
		
		A aa1 = new A();
		System.out.println(aa1.a);
		System.out.println(aa1.b);
		aa1.m1();
		aa1.m2();
		System.out.println("********");

		B bb = new B();
		System.out.println(bb.a);
		System.out.println(bb.b);
		System.out.println(bb.c);
		bb.m1();
		bb.m2();
		bb.m3();
		System.out.println("********");	
	}
}
