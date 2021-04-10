package com.start.petterns;

public class StarPatterns {

	// *
	// * *
	// * * *
	// * * * *
	// * * * * *
	public static void star1() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// * * * * *
	// * * * *
	// * * *
	// * *
	// *
	public static void star2() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// *
	// * *
	// * * *
	// * * * *
	// * * * * *
	// * * * *
	// * * *
	// * *
	// *
	public static void star3() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 0; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// 		   *
	//       * *
	//     * * *
	//   * * * *
	// * * * * *
	public static void star4() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// * * * * *
	//   * * * *
	//     * * *
	//       * *
	//         *
	public static void star5() {
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=4; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// Combined 4th & 5th star pattern
	public static void star6() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=3; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void asendingOrder() {
		int a[] = {5,2,4,8,7,9,0};
		int temp = 0;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+", ");
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+", ");
		}
	}
	

	public static void main(String[] args) {
		asendingOrder();
		}

}
