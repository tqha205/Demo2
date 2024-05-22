package array;

public class th4 {
    //    hiện thị phan tử đầu và cuối trong mảng

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {-1, -2, -3, -4, -5};
//        hienthi(arr);
        timSoLonNhat(arr);
        ;
//        char[] ch = {'x', 'i', 'n',' ', 'c', 'h', 'a', 'o'};
//        String str = new String(ch);
//        System.out.println(str);
//        String str2 =String.valueOf(ch);
//        System.out.println(str2);
    }

//    public static void hienthi(int[] arr) {
////        hien thi phan tu dau tien
//        System.out.println("phan tu dau tien :" + arr[0]);
//        System.out.println("phan tu cuoi cung :" + arr[arr.length - 1]);
//    }

    //        tim so chan lon nhat trong mang, và index của nó
//    public static void timSoLonNhat(int[] arr) {
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0 && arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("so chan lon nhat :" + max );
//
//    }
    public static void timSoLonNhat(int[] arr) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int index = 0;
        while (i <= arr.length - 1) {

            if (arr[i] % 2 == 0 && arr[i] > max) {
                max = arr[i];
                index = i;
            }
            i++;
        }
        System.out.println("so chan lon nhat:" + max + "," + " index thu :" + index);
    }
}
