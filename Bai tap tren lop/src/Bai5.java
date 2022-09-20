import java.util.Arrays;
import java.util.Scanner;


import static java.lang.Math.sqrt;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];
        System.out.print("nhap cac phan tu trong mang ");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            boolean check = true;
            if (arr[i] < 2){
                check = false;
            }
            else if (arr[i] > 2){
                for (int j = 2; j <arr[i]; j++){
                    if (arr[i] % j == 0){
                        check = false;
                        break;
                    }
                }

            } if (check == true){
                System.out.println(arr[i] + " la so nguyen to");
            }
        }
    }
}
