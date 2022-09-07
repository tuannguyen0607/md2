import java.util.Scanner;

public class Tim_uoc_chung_max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        int a = scanner.nextInt();
        System.out.println("nhập b");
        int b = scanner.nextInt();
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                if (b % i == 0) {
                    System.out.println(i + "là ước chung lớn nhất của 2 số");
                    break;
                }
            }
        }
    }
}
