//package QLNV;
//
//import java.util.Scanner;
//
//public class QuanLi {
//
//    static Cha1 [] nhanvien = new Cha1[1000];
//    Scanner sc = new Scanner(System.in);
//
//    static int soluong = 0;
//
//    public static void Show(){
//        if (soluong == 0){
//            System.out.println("không có ai cả");
//        }
//        else {
//            for (int i = 0; i < soluong; i++) {
//                System.out.println(nhanvien[i]);
//            }
//            System.out.println();
//        }
//    }
//
//    public Cha1 createNhanVien(){
//        System.out.print("nhập id: ");
//        int id = Integer.parseInt(sc.nextLine());
//
//        System.out.print("Nhập tên: ");
//        String name = sc.nextLine();
//
//        System.out.print("Nhập tuổi ");
//        int age = Integer.parseInt(sc.nextLine());
//
//        System.out.print("Nhập địa chỉ:");
//        String address = sc.nextLine();
//
//        Cha1 nv = new FullTime(id, name, age, address, 1);
//    }
//    public static void Them(Scanner sc){
//        Cha1 nv = createNhanVien();
//        Cha1 [] nhanVienMoi = new Cha1[nhanvien.length + 1];
//
//        System.out.print("nhập id: ");
//        int id = Integer.parseInt(sc.nextLine());
//
//        System.out.print("Nhập tên: ");
//        String name = sc.nextLine();
//
//        System.out.print("Nhập tuổi ");
//        int age = Integer.parseInt(sc.nextLine());
//
//        System.out.print("Nhập địa chỉ:");
//        String address = sc.nextLine();
//
//        System.out.println("Nhập loại nhân viên muốn thêm (1. Full-Time       2. Part-Time)");
//
//        int loai = Integer.parseInt(sc.nextLine());
//        if (loai == 1){
//            System.out.print("Nhập lương: ");
//            double luong = Integer.parseInt(sc.nextLine());
//             nhanvien[soluong] = new FullTime(id, name, age, address, luong);
//            for (int i = 0; i < nhanVienMoi.length; i++){
//                nhanVienMoi[i] = nhanvien[i];
//            }
//            nhanVienMoi[nhanVienMoi.length - 1] =
//             soluong++;
//        }
//        else {
//            System.out.print("nhập số ngày đi làm: ");
//            int sOngayDilam = Integer.parseInt(sc.nextLine());
//            nhanvien[soluong] = new PartTime(id, name, age, address, sOngayDilam);
//            nhanVienMoi = nhanvien;
//            soluong++;
//        }
//
//
//    }
//
//
//}
