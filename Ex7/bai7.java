package Ex7;
import java.util.Scanner;

public class bai7 {
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
				System.out.println("Moi ban nhap lai .... ");
				scanner.nextLine();
			}
		}
		return n;
	}
//____________________________________________________________________________________
	public static void main(String[] args) {
		System.out.print("Nhap n = ");
		int n = nhap();
		System.out.print("Nhap so a ma ban doan : ");
		int a = nhap();
		while (n != a) {
			if (a < n) {
				System.out.print("Số a đang nhỏ hơn n, mời nhập lại : ");
				a = nhap();
			} else if (a > n) {
				System.out.print("Số a đang lớn hơn n, mời nhập lại : ");
				a = nhap();
			}
		}
		System.out.print("Ban da doan dung!!!! Congratulations ");
	}
}
