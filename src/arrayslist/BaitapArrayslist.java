package arrayslist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaitapArrayslist {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("moi ban nhap :");
//        int n = sc.nextInt();
//        Random rd = new Random();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            int ngauNhien = rd.nextInt(100);
//            list.add(ngauNhien);
//        }
//        System.out.println(list);


//        viết chương trình nhập vào một danh sánh list sau đó :
//  1.    tạo ra một list mới bình phương các phần tử
//  2.    xác định có bao nhiêu phân tử lớn hơn 50

//        Scanner sc = new Scanner(System.in);
//        System.out.println("moi ban nhap so phan tu cua list :");
//        int n = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            System.out.println("moi nhap vao phan tu thu :" + (i + 1));
//            int soNhap = sc.nextInt();
//            list.add(soNhap);
//        }
//        System.out.println(list);
//
////        tạo ra một list mới bình phương các phần tử
//        ArrayList<Integer> binhPhuong = new ArrayList<>();
//        for (int x : binhPhuong) {
//            binhPhuong.add(x * x);
//        }
//        System.out.println("danh sach moi la :" + binhPhuong);
//
////        xác định có bao nhiêu phân tử lớn hơn 50
//        int count = 0;
//        for (int x : binhPhuong) {
//            if (x > 50)
//                count++;
//        }
//        System.out.println("so luong pt lon hon 50:" +binhPhuong);

//
//       viet chuong trinh nhap vao 1 list co n phan tu ngau nhien,
//        cac phan tu la so nguyen n nhap tu ban phim
//        1. in ra co bao nhieu so nho hown 80
//        2.va in ra vi tri indiex do

        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao so phan tu trong list :");
        int n = sc.nextInt();
        Random rd = new Random();
        Character.UnicodeBlock List;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ngauNhien = rd.nextInt(200);
            list.add(ngauNhien);
        }
        String str = sc.next();
        list.add(Integer.valueOf(str));
        list.add(Math.toIntExact(10l));

        String num = String.valueOf(3); //"3"
        System.out.println(list);


        int count = 0;
        String vitri = " ";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 80) {
                count++;
//       vi tri index
                vitri += i + " ";
            }

        }
        if (count == 0) {
            System.out.println("khong co gia tri nho hon 80 trong list ");
        } else {
            System.out.println("so nho hon 80 trong list la :" + count);
            System.out.println(" vi tri index la: " + vitri);


        }

    }
}

