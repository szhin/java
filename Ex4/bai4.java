package Ex4;

import java.util.Scanner;
import java.util.Arrays;

public class bai4 {
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
				System.out.println("Moi ban nhap lai ....... ");
				scanner.nextLine();
			}
		}
		return n;
	}
//	___________________________________________________________________________________________________

	public static void main(String[] args) {
			System.out.print("Nhap so phan tu cua mang 1 : ");
			int size1 = nhap();
			int[] array1 = new int[size1];
			for (int i = 0; i < size1; i++) {
				System.out.print("Nhap phan tu array[" + i + "] = ");
				array1[i] = nhap();
			}
			System.out.print("Nhap so phan tu cua mang 2 : ");
			int size2 = nhap();
			int[] array2 = new int[size2];
			for (int i = 0; i < size2; i++) {
				System.out.print("Nhap phan tu array[" + i + "] = ");
				array2[i] = nhap();
			}
			int length = array1.length + array2.length;
			int[] array3 = new int[length];
			int pos = 0;
			for (int element : array1) {
			      array3[pos] = element;
			      pos++;
			    }
			   
			for (int element : array2) {
			      array3[pos] = element;
			      pos++;
			    }
			System.out.print("Mang da duoc cong lai la: ");
			System.out.println(Arrays.toString(array3));
	}
}	
	