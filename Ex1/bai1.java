package Ex1;

import java.util.Scanner;

public class bai1{
    float a;
    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextFloat();
        scanner.close();
    }
    void xuat() {
        System.out.println("a sau khi da lam tron: "+ Math.round(a));
    }
    public static void main(String[] args) {
        bai1 a = new bai1();
        a.nhap();
        a.xuat();
    }
}