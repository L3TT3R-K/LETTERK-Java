import java.util.Scanner;


public class bai7 {
	public static void main(String[] args) {
		int n = getAPositiveInteger();
		if (isPrime(n)) {
			System.out.println(n + " là số nguyên tố");
		}
		else {
			System.out.println(n + " không là số nguyên tố");
		}
	}
	
	public static int getAPositiveInteger() {
		int n;
		Scanner banPhimCuaTui = new Scanner(System.in);
		System.out.print("Nhập một số nguyên dương: ");
		do {
			n = banPhimCuaTui.nextInt();
			if (n <= 0) {
				System.out.println("Bạn nhập sai. Mời nhập lại!");
				System.out.print("Nhập một số nguyên dương: ");
			}
		} while(n <= 0);
		banPhimCuaTui.close();
		return n; //getAPositiveInteger() = n
	}
	
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
