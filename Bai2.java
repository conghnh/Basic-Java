package Day2;

import java.util.Scanner;

public class Bai2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hãy nhập số tiền gôc: ");
    float P = scanner.nextFloat();
    System.out.println("Hãy nhập lãi xuất hàng nam: ");
    float r = scanner.nextFloat();
    System.out.println("Hãy nhập số lần tính lãi trong 1 năm: ");
    int t = scanner.nextInt();
    System.out.println("Hãy nhap thoi gian vay: ");
    int n = scanner.nextInt();
    double FV = P * Math.pow((1 + r/t), t*n);
    System.out.println("Lãi kep của bạn la: " + FV);
  }

}
