package Day2;

import java.util.Scanner;

public class Bai4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hãy nhập vào số tiền vay: ");
    float P = scanner.nextFloat();
    System.out.println("Hãy nhập vào lãi xuất hàng tháng: ");
    float r = scanner.nextFloat();
    System.out.println("Hãy nhập vào ky hạn vay");
    int n = scanner.nextInt();
    double M = (P*r*Math.pow((1+n), n))/(Math.pow((1+n), n) - 1);
    System.out.println("Số tiền phải trả hàng than là: " + M);
  }

}
