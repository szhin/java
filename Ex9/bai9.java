package Ex9;
import java.util.Scanner;
public class bai9 {
	public static long nhap() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		long n = 0;
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
//___________________________________________________________________________________________________
	public static void main(String[] args) {
		System.out.print("Nhap so a = ");
		long a = nhap();
		String temp,res="";
		temp = "" + a;
		int count = 0;
		for (int i = (temp.length()-1);i>=0 ;i--) {
			res = temp.charAt(i) + res;
			count++;
			if (count == 3) {
				if (i>0) {
					res = "," + res;
					count = 0;
				}
			}
		}
		System.out.print("Ket qua la " + res);
	}
}