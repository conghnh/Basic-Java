import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //Khởi tạo biến cân nặng
        Scanner weight = new Scanner(System.in);
        System.out.println("Hãy nhập cân nặng của bạn: ");
        int weightKg = weight.nextInt();
        //Khởi tạo biến chiều cao
        Scanner height = new Scanner(System.in);
        System.out.println("Hãy nhập chiều cao của bạn: ");
        int heightCm = height.nextInt();
        // Khởi tạo biến tính chỉ số BMI
        float pointBMI = weightKg * 10000 / (heightCm * heightCm);

        // Câu điều kiện check chỉ số BMI
        if (pointBMI < 16) {
            System.out.println(pointBMI + "Gầy cấp độ III");
        } else if (pointBMI < 17) {
            System.out.println(pointBMI + "Gầy cấp độ II");
        }else if (pointBMI < 18.5) {
            System.out.println(pointBMI + "Gầy cấp độ I");
        } else if (pointBMI < 25) {
            System.out.println(pointBMI + "Bình thường");
        } else if (pointBMI < 30) {
            System.out.println(pointBMI + "Thừa cân");
        } else if (pointBMI < 35) {
            System.out.println(pointBMI + "Beo phi do I");
        } else if (pointBMI < 40) {
            System.out.println(pointBMI + " Beo phi cap do II");
        } else {
            System.out.println(pointBMI + "Beo phi cap do III");
        }
    }
}
