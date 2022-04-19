package Ex6;
import java.util.Scanner;

public class bai6 {
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
//	___________________________________________________________________________________________________

	public static void inMT(int[][] array, int n, int m) {
		for(int i = 0; i < n; i++) {
			System.out.print("\n");
			for (int j = 0; j < m; j++) System.out.print(" " + array[i][j]);
		}
	}
//	___________________________________________________________________________________________________

	public static void main(String[] args) {
		System.out.print("Nhap so hang n = ");
		int n = nhap();
		System.out.print("Nhap so cot m = ");
		int m = nhap();
		int[][] array = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Nhap phan tu thu A[" + (i + 1) + "][" + (j + 1) + "] = ");
				array[i][j] = nhap();
			}
		}
		System.out.print("a) Ma tran da nhap vao: ");
		inMT(array, n, m);
		System.out.print("\n");
//		__________________________________________________________________________________
	
		System.out.print("b) Nhap chieu cao cua tam giac pascal: ");
		int h = nhap();
		int x, output;
		for(int i = 1;i<= h; i++) {
            for(int j = 0; j<= 2*h; j++) {
                x = j-h;
                if(x < 0){
                    x *= -1;
                }
                output = i - x;
                if(output > 0){
                    System.out.printf("%3d", output);
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
		}
	}
}