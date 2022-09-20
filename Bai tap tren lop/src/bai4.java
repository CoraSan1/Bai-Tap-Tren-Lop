import java.util.Arrays;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        System.out.print("nhap cac phan tu trong mang ");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[arr.length - 1];
        System.out.println("nhap vi tri xoa");
        int index = sc.nextInt();

        for (int i = 0; i < arr2.length; i++){
            if (i >= index){
                arr2[i] = arr[i+1];
            }else {
                arr2[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
