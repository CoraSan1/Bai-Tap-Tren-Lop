package QuanLyNhanVien;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLy {
    public Cha[] Them(Cha[]nv){
        Cha []nhanvien = new Cha[nv.length + 1];
        for(int i = 0; i < nv.length; i++){
            nhanvien[i] = nv[i];
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten");
        String name = sc.nextLine();
        System.out.println("nhap tuoi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("nhap dia chi");
        String address = sc.nextLine();

        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                System.out.println("Nhap bon PartTime");
                int soNgayLamViec = Integer.parseInt(sc.nextLine());
                nhanvien[nhanvien.length - 1] = new Parttime(id, name, age, address, soNgayLamViec);
                break;
            case 2:
                System.out.println("Nhap bon FullTime");
                double luong = Double.parseDouble(sc.nextLine());
                nhanvien[nhanvien.length - 1] = new Fulltime(id, name, age, address, luong);
                break;

        }
        return nhanvien;

    }

}
