//package QLNV;
//
//import java.util.Scanner;
//
//import static QLNV.QuanLi.Them;
//
//public class Main1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        QuanLi quanLi = new QuanLi();
//
//        while (true){
//            System.out.println("Quản lý nhân viên");
//            System.out.println("1. Hiển thị nhân viên ");
//            System.out.println("2. Thêm Nhân viên");
//            System.out.println("3. Thoát");
//
//            int choice = Integer.parseInt(sc.nextLine());
//            System.out.println("Chọn " + choice);
//
//            switch (choice){
//                case 1:
//                    QuanLi.Show();
//                    break;
//                case 2:
//                    System.out.println("Nhập số nhân viên muốn thêm");
//                    int snvt = Integer.parseInt(sc.nextLine());
//                    for (int i = 0; i < snvt; i++){
//                        Them(sc);
//                    }
//                    QuanLi.Show();
//                    break;
//                case 3:
//                    return;
//            }
//        }
//    }
//}
