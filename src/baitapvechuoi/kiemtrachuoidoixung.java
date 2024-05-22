package baitapvechuoi;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class kiemtrachuoidoixung {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi bạn muốn kiểm tra:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        String reverseString = " ";

        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");


//        String str = "A";
//        str = str + "B";
//        String str2 = "AB";
//        str2.concat("C");
//        System.out.println(str.equals(str2)); // so sanh gia tri
//        System.out.println(str == str2); //        == so sanh tham tri
//
//        StringBuffer bf = new StringBuffer();
//        bf.append("A");
//        bf.append("B");
//
//        StringBuilder bd = new StringBuilder();
//        bd.append("ABC");
//        System.out.println(bf);
//        System.out.println(bd);
//        System.out.println(bf.toString().compareTo(bd.toString()));
    }
}
