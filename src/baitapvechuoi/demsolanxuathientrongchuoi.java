package baitapvechuoi;

import java.util.Scanner;

public class demsolanxuathientrongchuoi {
    public static void main(String[] args) {

        DemKyTu("xin chao cac ban");
    }

    public static void DemKyTu(String str) {

        int counter[] = new int[256];
        int  len = str.length();
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;
        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
        }
    }
}
