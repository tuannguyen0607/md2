import java.util.Scanner;

public class Tinhlaisuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền gửi");
        double money = scanner.nextDouble();
        System.out.println("nhập tỉ lệ lãi suất % năm");
        double interestRate = scanner.nextDouble();
        System.out.println("nhập số tháng gửi");
        int month = scanner.nextInt();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12;
        }
        System.out.println("tổng tiền lãi là :" + totalInterest);

    }
}
