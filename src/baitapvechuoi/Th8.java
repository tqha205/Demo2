package baitapvechuoi;

import java.util.Scanner;

public class Th8 {
    public static void main(String[] args) {
// sử dụng class Scanner để nhận dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập vào chuỗi cần in hoa: ");
        message = sc.nextLine();
//khai báo một mảng, sau đó sử dụng phương thức toCharArray() 
//để chuyển đổi message thành một mảng kiểu char
        char[] charArray = message.toCharArray();
//sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for (int i = 0; i < charArray.length; i++) {
           if  (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
// chuyển đổi mảng char thành string
        message = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: \n" + message);

        System.out.println("\n---------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
//    public static void main(String[] args) {
//        //khai báo và khởi tạo một string name
//        String name = "xin chao cac ban";
//        System.out.println("\nChuỗi ban đầu: " + name);
//        

//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(2);
//        arr.add(3);
//
//        arr.get(0);

//        char char1 = 'A';
//

//        // tạo hai chuỗi con firstLetter và remainingLetters
//        // chuỗi firstLetter chứa chữ cái đầu tiên của  name
//        String firstLetter = name.substring(0, 1);
//        // chuỗi remainingLetters chứa phần còn lại của name
//        String remainingLetters = name.substring(1, name.length());
//
//        //sử dụng phương thức toUpperCase() để chuyển đổi firstLetter thành chữ in hoa
//        firstLetter = firstLetter.toUpperCase();
//
//        //sau khi chuyển đổi thì gộp chúng lại
//        name = firstLetter + remainingLetters;
////        System.out.println("Chuỗi sau khi đổi: " + name);
//    }
}
