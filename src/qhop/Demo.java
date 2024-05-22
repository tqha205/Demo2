package qhop;

import java.util.ArrayList;

public class Demo {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
//        Tạo danh sách không có tham số
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 1; i <= NUM_OF_ELEMENT; i++) {
//           thêm phần tử vào danh sách
            list1.add(("0" + i));
        }
        System.out.println("Danh sach ban dau :");
        printData(list1);
//        them tat ca
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.add("0" + 3);
        System.out.println("after list1.addALL(03):list2: ");
        printData(list2);
//  indexOf
        System.out.println("list2.indexOf(03)=" + list2.indexOf("03"));
        System.out.println("list2.indexOf(06)=" + list2.indexOf("06"));

    }

    public static void printData(ArrayList<String> list) {
//    Hiển thị danh sách thông qua for-each
        for (String item : list) {
            System.out.println(item + " ");
        }
        System.out.println();
//       sumAB(int a, int b);


//Tập hợp trong java gồm:
//        array -- []
//        List
//        Map
//
////        array là 1 mảng/tập hợp tĩnh có độ dài, kiểu dữ -liệu cố định.
//        int[] array = new int[3];
//        ArrayList[] arr = new ArrayList[3];
////        Truy xuất array Thông qua index, vd: array[index]  ,  array[index] = 1;
////        độ dài = array.length
//
////        List laf 1 tập hợp có độ dài và kiểu dữ liệu không cố định
//        List list = new ArrayList();
////        Truy xuất list thông qua index. list.get(index) || list.add(value can them)
////        Độ dài = list.size()
////        list.add
//
////        Map là 1 tập hợp mà mỗi phần từ trong 1 sẽ bao gồm <1 Key và 1 Value>
//        Map<String, String> map = new HashMap<>();
////        Truy xuất dữ liệu thông qua các hàm, map.put(key, value); map.get(key), iterator
////        Độ dài = map.size()
////        map.put()lisa


    }


}
