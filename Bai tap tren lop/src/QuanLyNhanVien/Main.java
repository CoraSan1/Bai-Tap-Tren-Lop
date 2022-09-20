package QuanLyNhanVien;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Cha[] arrNV = new Cha[1000];
    static int soLuong = 0;
    public static void showNV(){
        if(soLuong == 0){
            System.out.println("Không có ai cả");
        }
        else {
            for (int i = 0; i < soLuong; i++){
                System.out.println(arrNV[i]);
            }
        }
    }
    public static void Them(Scanner sc){
        System.out.print("Nhập id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();

        System.out.println("Nhập loại nhân viên (1. Full-Time    2. Part-Time)");
        int loai = sc.nextInt();

        if (loai == 1) {
            System.out.print("Nhâp lương: ");
            double luong = sc.nextDouble();
            arrNV[soLuong] = new Fulltime(id, name, age, address, luong);
            soLuong++;
        }
        else {
            System.out.print("Nhập số ngày đi làm: ");
            int ngaydilam = sc.nextInt();
            arrNV[soLuong] = new Parttime(id, name, age, address, ngaydilam);
            soLuong++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Menu-------------");
        System.out.println("1. Hiển thị nhân viên");
        System.out.println("2. Thêm nhân viên");
        System.out.println("3. Thoát");

        while (true){
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    showNV();
                    break;
                case 2:
                    System.out.print("Số lượng nhân viên muốn thêm: ");
                    int slnv = sc.nextInt();
                    for (int i = 0; i < slnv; i++){
                        Them(sc);
                    }
                    showNV();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

}
