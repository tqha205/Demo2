package array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3};
//        tinhTongcuamang(arr);
        tinhTongCuaMang(arr);

    }

    //   B1.  Chia mảng thành 5 phần, tính và hiển thị toonrh của từng phần đó
//    B2. Tính tổng của số chẵn và số lẻ trong mảng
//    B3. Tính hiệu của số chẵn và số lẻ trong mảng

//    public static void tinhTongcuamang(int[] arr) {
//        int n = arr.length;
//        int length = n / 3;  // 3
//        int tongsum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i < length) {
//                tongsum += arr[i];
//                if (i == length - 1) {
//                    System.out.println("Phan dau: " + tongsum);
//                    tongsum = 0;
//                }
//            }
//
//            if (length <= i && i <= (2 * length)) {
//                tongsum += arr[i];
//                if (i == 2 * length - 1) {
//                    System.out.println("Phan giua: " + tongsum);
//                    tongsum = 0;
//                }
//            }
//
//            if (i > 2 * length) {
//                tongsum += arr[i];
//                if (i == arr.length - 1) {
//                    System.out.println("Phan cuoi: " + tongsum);
//                }
//            }
//        }

//        System.out.println("Phan cuoi: " + tongsum);

    ////        phan dau
//        int sum = 0;
//        for (int i = 0; i < length; i++) {
//            sum = sum + arr[i];
//            System.out.println("phan dau" + sum );
//
//        }
////        phan giua
//        sum = 0;
//        int sum1 = 0;
//        for (int i = length; i < 2 * length; i++) {
//            sum1 = sum1 + arr[i];
//            System.out.println("phan giua" + sum1);
//        }
////        phan cuoi
//        int sum2 = 0;
//        for (int i = 2 * length; i < n; i++) {
//            sum2 = sum2 + arr[i];
//            System.out.println("phan cuoi "+sum2);
//
//        }
    public static void tinhTongCuaMang(int[] arr) {
//        int n = arr.length;
        int length = arr.length / 2;
        int tongSum = 0;
        int i = 0;
        while (i < arr.length) {
            tongSum += arr[i];

//            if (i < length) {
            if (i == length - 1) {
                System.out.println("phan dau :" + tongSum);
                tongSum = 0;
            }
//            }

//            if (length <= i) {
            if (i == arr.length - 1) {
                System.out.println("phan cuoi :" + tongSum);
//                    tongSum = 0;
            }
//            }

            i++;
        }
    }
}





