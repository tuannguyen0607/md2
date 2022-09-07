import java.util.Arrays;

public class pusharr {
    public static void main(String[] args) {
        int index=2;
        int value=4;
        int[] arr = new int[]{1, 5, 6, 8, 3, 4};
        int[] newarr = new int[arr.length + 1];

        if ( index < 0 || index > arr.length){
            System.out.println("không hợp lệ");
        }else{
            for (int i = 0; i <= arr.length; i++) {
                if (i < index) {
                    newarr[i] = arr[i];
                } else if (i == index) {
                    newarr[index] = value;
                } else {
                    newarr[i] = arr[i - 1];
                }
            }
            System.out.println(Arrays.toString(newarr));
        }
    }
}