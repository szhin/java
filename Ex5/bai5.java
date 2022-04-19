package Ex5;

import java.util.Scanner;

public class bai5 {
	public static int nhap() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		int n = 0;
		while(!check) {
			System.out.print("");
			try {
				n = scanner.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("Moi ban nhap lai ........");
				scanner.nextLine();
			}
		}
		return n;
	}
//	_______________________________________________________________________________________________________
	
	public static boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }
        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
//	___________________________________________________________________________________________________________
	
	public static void main(String[] args) {
		System.out.print("Nhap a: ");
		int a = nhap();
		System.out.print("Nhap b: ");
		int b = nhap();
		int k = 0;
		for (int i = a + 1; i > a; i++) {
			if (isPrime(i) && k < b ) {
				System.out.print(i+" ");
				k++;
			}
		}
			
	}
}