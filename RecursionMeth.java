// import java.util.Scanner;

// public class RecursionMeth {
// 	public static void main(String[] args) {
// 		System.out.println("Input number lower or equal to 9");
// 		recMeth();
// 	}

// 	public static void recMeth() {
// 		Scanner sc = new Scanner(System.in);
// 		int scaned = sc.nextInt();
// 		if (scaned > 9) {
// 			System.out.println("You add wrong number try again!");
// 			recMeth();
// 		} else {
// 			System.out.println("This is right number!");
// 		}
// 		System.out.println("Your number is: " + scaned);
// 	}
// }


import java.util.Scanner;

class RecursionMeth {
	public static void main(String[] args) {
		System.out.println("Add number lower or equal to 9");
		run();
	}

	static void run() {
		Scanner sc = new Scanner(System.in);
		int scanedNum = sc.nextInt();
		if (scanedNum <= 9) {
			System.out.println("You add right number");
		} else {
			System.out.println();
			System.out.println(scanedNum + " is wrong number, try again!");
			run();
		}
		System.out.println("Your added numbers is: " + scanedNum);
	}
}