import java.util.Scanner;

public class Tim_gia_tri_arr {
    public static void main(String[] args) {
        String[] students = {"tuấn","tú","tài","nam","việt"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name students");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
