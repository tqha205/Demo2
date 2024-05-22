package array;


import java.util.Scanner;

public class th2 {
    //    B2. Tính tổng của số chẵn và số lẻ trong mảng
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 9, 1};
//        tongChanLe(arr);
//        hieuChanLe(arr);
//        trungBinhCong(arr);
        daoNguocMang(arr);
    }

    public static void trungBinhCong(int[] arr1) {
        System.out.println("nhap vao cac phan tu trong mang :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double tbcong = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("moi nhap phan tu thu" + (i + 1) + ":");
            arr[i] = (int) sc.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            tbcong += arr[i];
        }
        System.out.println("tb cong la :" + (float) tbcong / arr.length);
    }

    public static void tongChanLe(int[] arr) {
        int tongsochan = 0;
        int tongsole = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                tongsochan = tongsochan + arr[i];

            } else {
                tongsole = tongsole + arr[i];
            }
        }
        System.out.println("tong so chan:" + tongsochan);
        System.out.println("tong so le:" + tongsole);

    }

    // B3. Tính hiệu của số chẵn và số lẻ trong mảng
    public static void hieuChanLe(int[] arr) {
//        int tongSoChan = 0;
//        int tongSoLe = 0;

        int hieuChanLe = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
//                tongSoChan += arr[i];
                hieuChanLe += arr[i];
            } else {
//                tongSoLe += arr[i];
                hieuChanLe -= arr[i];
            }
        }

        System.out.println("hieu chan le:" + hieuChanLe);

    }

    public static void daoNguocMang(int[] arr1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap so phan tu:");
        int n = sc.nextInt();
        int[]arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("moi nhap phan tu thu" + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];

            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("mang sau khi dao nguoc :" + arr[i]);
        }

    }

}

