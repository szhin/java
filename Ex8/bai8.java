package Ex8;
import java.util.Scanner;

public class bai8 {
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
		System.out.print("Nhap password: ");
		int pass = nhap();
		System.out.println("Pasword sau khi da ma hoa: "+Integer.toBinaryString(pass));
	}
	
}