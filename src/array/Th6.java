package array;

public class Th6 {

    //    static int[] arr = {5, 2, 8, 1, 0, 2, 3};
//
//    public static void main(String[] args) {
//
//        /*int firstSum = 0;
//        int lastSum = 0;
//        for (int i = 0; i < arr.length / 2; i++) {
//            firstSum += arr[i];
//            lastSum += arr[arr.length - 1 - i];
//        }
//        System.out.println("firstSum: " + (firstSum + arr[arr.length / 2]) + " lastSum: " + lastSum);*/
//
//
////        Nhập vào n số nguyên và tính tổng những số đó và tổng của nó không quá 100
//        int sum = 0;
//        int i = 0;
//        do {
//            sum += 100;
//
//            if(sum >= 100) {
//                break;
//            }
//            i++;
//        } while (i < 10);

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 1, 1, 1},
                {0, 1, 6, 5, 2, 4},
                {3, 2, 1, 2, 7, 8},
                {1, 0, 2, 1, 6, 2},
                {2, 2, 4, 3, 1, 7},
                {1, 1, 1, 1, 1, 1}};
//        tongDuongCheo(arr);
        tongHinhZ(arr);
//        sumZ(arr);


    }


    /*public static void tongDuongCheo(int[][] arr) {
        int duongCheo1 = 0;
        int duongCheo2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    duongCheo1 += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    duongCheo2+=arr[i][j];
                }
            }
        }

        System.out.println("duong cheo 1:" + duongCheo1);
        System.out.println("duong cheo 2:" + duongCheo2);


    }*/
    public static void tongHinhZ(int[][] arr) {
        int sumZ = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1) {
                for (int j = 0; j < arr.length; j++) {
                    sumZ += arr[i][j];
                }
            } else {
                sumZ += arr[i][arr.length - i - 1];
            }
        }
        System.out.println("tong Z :" + sumZ);


    }


//    public static void sumZ(int[][] arr) {
//
//        int sum = 0, j = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[0][i];
//            sum += arr[arr.length - 1][i];
//
//            if (i != 0 && i != arr.length - 1) {
//                sum += arr[i][arr.length - 1 - i];
//            }
//        }
//        System.out.println("Sum = " + sum);
//    }
}
