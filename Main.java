//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main  {
    public static void main(String[] args){
        //I. Data type kiểu số nguyên Interger
            //1.Kiểu byte - 8bit
            byte maxByte = 127;
            byte minByte = -128;
        System.out.println("Gia tri lon nhat byte: " + maxByte);
        System.out.println("Gia tri nho nhat byte: " + minByte);
            //2. Kiểu short - 16 bit
            short maxShort = 32767;
            short minShort = - 32768;
        System.out.println("Gia tri lon nhat short: " + maxShort);
        System.out.println("Gia tri nho nhat short: " + minShort);
            //3. Kieu int - 32 bit
            int maxInt = 2147483647;
            int minInt = -2147483648;
        System.out.println("Gia tri lon nhat int: " + maxInt);
        System.out.println("Gia tri nho nhat int: " + minInt);
            //4. Kieu long - 64 bit
            long maxLong = 92233L;
            long minLong = -92233L;
        System.out.println("Gia tri lon nhat long: " + maxLong);
        System.out.println("Gia tri nho nhat long: " + minLong);
       //II.Data type kieu phay dong Floating Type
            //1. Kieu float - 32 bit
            float maxFloat = 1500f;
            float minFloat = -1900f;
        System.out.println("Gia tri lon nhat float: " + maxFloat );
        System.out.println("Gia tri nho nhat float: " + minFloat);
            //2. Kieu double - 64 bit
            double maxDouble = 50000d;
            double minDouble = - 55000d;
        System.out.println("Gia tri lon nhat double: " + maxDouble);
        System.out.println("Gia tri nho nhat double: " + minDouble);
       //III. Data type kieu boolean
            boolean isJava = true;
            boolean isNotJava = false;
        System.out.println("Chuong trinh la java: " + isJava);
        System.out.println("Chuong trinh khong phai la java: " + isNotJava);
       //IV. Data type kieu Characters
            char myName = 'C';
            String fullName = "Hoang Ngoc Hong Cong";
        System.out.println("Ten viet tat cua ban : " + myName );
        System.out.println("Ten đầy đủ cua ban : " + fullName );
    }
}