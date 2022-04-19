package Ex3;

import java.util.Scanner;

public class bai3 {
 
    static int n2;
    static int count = 0;
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = scanner.nextInt();
       
        if (n < 0) {
            n2 = Math.abs(n);
            while (n2 > 0) {
                n2 = n2 / 10;
                count = count + 1;
            }
            System.out.println("So nguyen n co " + count + " chu so");  
        } else if (n > 0) {
            while (n > 0) {
                n = n / 10;
                count = count + 1;
            }
            System.out.println("So nguyen n co " + count + " chu so");
        } else {
            count++;
            System.out.println("So nguyen n co " + count + " chu so");
        }
        
    }
}
