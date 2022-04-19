package Ex2;

import java.util.Scanner;


public class bai2 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = scanner.nextInt(); 

        if (n % 2 == 0) {
            System.out.println("So nguyen n la so chan");
        } else {
            System.out.println("So nguyen n la so le");
        }

        if (isPrime(n)) {
            System.out.println("So nguyen n la so nguyen to");
        } else {
            System.out.println("So nguyen n khong phai la so nguyen to");
        }
    }
}
