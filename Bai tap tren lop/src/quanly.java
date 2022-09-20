import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class quanly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Nhập mảng đi em êi");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("1 Hiển thị mảng");
        System.out.println("2 Thêm phần tử vào mảng");
        System.out.println("3 Sửa phần tử trong mảng");
        System.out.println("4 Xóa phần tử trong mảng");
        System.out.println("5 CÚT");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:


                System.out.println(Arrays.toString(arr));
                break;
            case 2:
                int[] arr2 = new int[arr.length + 1];
                System.out.println("nhập số muốn thêm");
                int sOthem = sc.nextInt();
                for (int i = 0; i < arr.length; i++) {
                    arr2[i] = arr[i];
                }
                arr2[arr2.length - 1] = sOthem;
                System.out.println(Arrays.toString(arr2));
                break;
            case 3:
                System.out.println("nhập vị trí cần sửa");
                int index = sc.nextInt();
                System.out.println("Nhập ký tự muốn sửa");
                int sOsua = sc.nextInt();

                for (int i = 0; i < arr.length; i++) {
                    if (index > i) {
                        System.out.println("Vị trí cần sửa không tồn tại");
                        break;
                    }
                    if (i == index) {
                        arr[i] = sOsua;
                    }
                }
                System.out.println(Arrays.toString(arr));

                break;
            case 4:
                int[] arr3 = new int[arr.length - 1];
                System.out.println("nhap vi tri xoa");
                int index1 = sc.nextInt();

                for (int i = 0; i < arr3.length; i++) {
                    if (i >= index1) {
                        arr3[i] = arr[i + 1];
                    } else {
                        arr3[i] = arr[i];
                    }
                }
                arr = arr3;
                System.out.println(Arrays.toString(arr));
                break;
            case 5:
                System.exit(0);


        }

    }
}
