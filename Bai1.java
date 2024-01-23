package Day2;
import java.util.Scanner;

public class Bai1 {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hãy nhập số thứ nhất: ");
            int a = scanner.nextInt();
            System.out.println("Hãy nhập số thứ hai: ");
            int b = scanner.nextInt();
            int c = a + b;
            int d = a-b;
            int e = a*b;
            float f = (float) a/b;
            int g = a%b;
            System.out.println("Tổng: " + c);
            System.out.println("Hiệu: " + d);
            System.out.println("Tích: " + e);
            System.out.println("Thương: " + f);
            System.out.println("Số dư: " + g);
      }
}
