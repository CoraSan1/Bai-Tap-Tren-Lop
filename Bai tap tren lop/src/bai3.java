import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[4];
        System.out.print("nhap cac phan tu trong mang ");
        for (int i =0; i < 4; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        int [] arr2 = new int[arr.length + 1];
        System.out.println("nhap vi tri can them");
        int index = sc.nextInt();
        System.out.println("nhap so muon them");
        int a = sc.nextInt();

        for (int i = 0; i < arr2.length; i++){
            if (i< index){
                arr2[i] = arr[i];
            }
            if (i == index){
                arr2[i] = a;
            }
            if (i > index){
                arr2[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
