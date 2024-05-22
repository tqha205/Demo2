package array;

public class th1 {
//    chia mảng thành 5 phần và tính từng phàn của nó
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 1, 1, 1};
        tinhTongCuaMang(arr);
    }

    public static void tinhTongCuaMang(int[] arr) {
        int n = arr.length;
        int length = n / 5; // 2
        int tongsum = 0;
        for (int i = 0; i < arr.length; i++) {
//            Phan 5
            if (4 * length < i) {
                tongsum = tongsum + arr[i];
                if (i == arr.length - 1) {
                    System.out.println("phan 5:" + tongsum);
                }
                continue;
            }

//            Phan 4
            if (3 * length < i && i <= 4 * length) {
                tongsum = tongsum + arr[i];
                if (i == 4 * length) {
                    System.out.println("phan 4:" + tongsum);
                    tongsum = 0;
                }
                continue;
            }

//            Phan 3
            if (2 * length < i && i <= 3 * length) {
                tongsum = tongsum + arr[i];
                if (i == 3 * length) {
                    System.out.println("phan 3:" + tongsum);
                    tongsum = 0;
                }
                continue;
            }

//            Phan 2
            if (length < i && i <= 2 * length) {
                tongsum = tongsum + arr[i];
                if (i == 2 * length) {
                    System.out.println("phan 2:" + tongsum);
                    tongsum = 0;
                }
                continue;
            }

//            Phan 1
            if (i <= length) {
                tongsum = tongsum + arr[i];
                if (i == length) {
                    System.out.println("phan 1:" + tongsum);
                    tongsum = 0;
                }
            }
        }
    }
}
