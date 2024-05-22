package practice;

import arrayslist.BaitapArrayslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VietChuongTrinh {
    static Scanner scanner = new Scanner(System.in);
    static boolean isLoop = true;
    static int num1, num2, num3, select;
    static boolean isFistRun = true;


    public static void main(String[] args) {
        do {
            selectMenu();
            if (isFistRun) {
                inputNumber();
                isFistRun = false;
            }
            switch (select) {
                case 1:
                    System.out.println("tổng của ba số là :" + sum());
                    checkResume();
                    break;
                case 2:
                    signal();
                    checkResume();
                    break;
                case 3:
                    average();
                    break;
                case 4:
                    isTriang();
                    break;
                case 5:
                    findMaxMin();
                    break;
                case 6:
                    checkPrimeNumber(num1);
                    checkPrimeNumber(num2);
                    checkPrimeNumber(num3);

                    checkPrimeNumber(2);

                    break;
                case 7:
                    System.out.println("quay lại menu.");
                    break;
                default:
                    System.out.println("lựa chọn khôn hợp lệ quay lại menu.");
                    break;
            }

            if (isLoop) {
                reInputNumber();
            }
        } while (isLoop);
        scanner.close();
    }

    private static void reInputNumber() {
        System.out.println("\nBạn có muốn nhập giá trị mới cho 3 số không?");
        System.out.println("0.No | 1.Yes");
        if (scanner.nextInt() == 1) {
            inputNumber();
        }
    }

    private static void selectMenu() {
        System.out.println("menu:");
        System.out.println("1.tính tổng ba số.");
        System.out.println("2.tính hiệu.");
        System.out.println("3.tính tb cộng.");
        System.out.println("4.kiểm tra xem có phải tam giác không.");
        System.out.println("5.tìm SlN và SNN .");
        System.out.println("6.kiểm tra xem có số nào là số nguyên tố không.");
        System.out.println("7.quay lại menu.");
        System.out.println("mời ban chon :");

        select = scanner.nextInt();
    }

    static void inputNumber() {
        System.out.println(" mời nhâp số thứ nhất:");
        num1 = scanner.nextInt();
        System.out.println("mời nhập số thứ hai :");
        num2 = scanner.nextInt();
        System.out.println("mời nhập số thứ 3 :");
        num3 = scanner.nextInt();
    }

    private static int sum() {
        return num1 + num2 + num3;
    }

    private static void signal() {
        int signal = num1 - num2 - num3;
        System.out.println("hiệu của ba số là :" + signal);
    }

    private static void average() {
        int average = sum() / 3;
        System.out.println("tb cộng của ba số là :" + average);

    }

    private static void isTriang() {

        boolean istriangle = ((num1 + num2 > num3) && (num2 + num3 > num1) && (num1 + num3 > num2));
        if (istriangle) {
            System.out.println("ba cạnh là một tam giác.");
//            tinhDienTichTamGiac();
        } else {
            System.out.println("ba cạnh không phải là một tam giác.");
        }
    }

    public static void findMaxMin() {
        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        System.out.println("so lon nhat la :" + max);
        System.out.println("so nho nhat la :" + min);
    }

    public static void checkPrimeNumber(int num) {

        boolean is_prime = true;
        if (num < 2) {
            is_prime = false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                is_prime = false;
                break;
            }
        }
        if (is_prime) {
            System.out.println("co so nguyen");

        } else {
            System.out.println("khong co so nguyen");

        }

    }


    public static void checkResume() {
        System.out.println("\nBạn có muốn tiếp tục chương trình không?");
        System.out.println("0.No | 1.Yes");
        int option = scanner.nextInt();
        if (option != 0 && option != 1) {
            System.out.println("Ban đã nhập sai, xin hãy nhập lại.");
            option = scanner.nextInt();
        }
//        option == 0 ? false : option;
        isLoop = option == 1;
    }
}
