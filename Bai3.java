package Day2;

import java.util.Scanner;

public class Bai3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hãy nhập số tiền gốc: ");
    float P = scanner.nextFloat();
    System.out.println("Hãy nhập lãi suất vay");
    float r = scanner.nextFloat();
    System.out.println("Hãy nhập thời gian vay");
    int t = scanner.nextInt();
    double PV = P*r*t;
    System.out.println("Lãi xuất sô tiền là:" + PV);

  }
}
