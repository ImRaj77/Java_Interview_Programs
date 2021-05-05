package src.com.inheritance.concepts;

public class TrialPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swap();
//		reverseInteger();
//		largestSmallest();
//		replaceStrings();
		strConcat();
	}
	
	public static void swap() {
		int a=10;
		int b=20;
		int temp;
		
		temp = a ;
		a = b ;
		b = temp ;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void reverseInteger() {
		int num = 12321;
		int reverse=0;
		int temp = num ;
		
		while(num>0) {
			reverse = reverse * 10 + num % 10 ;
			num = num / 10 ;
		}
		System.out.println(reverse);
		
		if (reverse == temp) {
			System.out.println("Palindrome");
		}
	}
	
	public static void largestSmallest() {
		int numers[] = { 1,2,3,4,12,6,78,4,12};
		System.out.println(numers.length);
		
	}
	
	public static void replaceStrings(){
		String str = "raajesh.tidke";
		
		System.out.println(str.replace(".",""));
	}
	
	public static void strConcat() {
		System.out.println();
		int a=10;
		int b=20;
		String str = "Hello";
		System.out.println(a+b); // 30
		System.out.println(a+b+str); // 30Hello
		System.out.println(str+a+b); // Hello1020
	}
	
	
}
