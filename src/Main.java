
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan tu can xoa: ");
        int x = scanner.nextInt();
        int[] newArr = new int[arr.length -1];
        int j = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] != x) {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
