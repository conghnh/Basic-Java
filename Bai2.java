import com.sun.source.util.SourcePositions;

import java.util.Scanner;
//sử dụng hàm scanner để đọc dữ liệu nhập vào
public class Bai2 {
    public static void main(String[] args) {
        //Khởi tạo biến Scanner để đọc dữ liêu nhập vào
        Scanner scannerNumber = new Scanner(System.in);
        //Viết câu hướng dẫn hay nhập số nguyên
        System.out.println("Hay nhập vào một số nguyên: ");
        int number = scannerNumber.nextInt();
        //Câu điều kiện kiểm tra số nhập vào là chẵn hay lẻ
        if (number % 2 == 0) {
            System.out.println("Đây là một số chẵn");
        } else {
            System.out.println("Đây la một số lẻ");
        }
        //đóng đối tượng scanner tránh rò rỉ tài nguyên
        scannerNumber.close();
    }
}


