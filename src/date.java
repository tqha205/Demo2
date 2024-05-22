import sun.util.resources.cldr.ar.CalendarData_ar_MA;

import java.util.Calendar;
import java.util.Scanner;


public class date {
    public static void main(String[] args) {
//
//        Calendar cal = Calendar.getInstance();
////            lay ngay thang nam
//        int nam = cal.get(Calendar.YEAR);
//        int thang = cal.get(Calendar.MONTH);
//        int ngay = cal.get(Calendar.DAY_OF_MONTH);
//        System.out.println(nam);
//        System.out.println(thang + 1);
//        System.out.println(ngay);
//        //        set ngay thang nam sinh theo y muon
//        cal.set(Calendar.YEAR, 2005);
//        cal.set(Calendar.MONTH, 11);
//        cal.set(Calendar.DAY_OF_MONTH, 21);
////        kiem tra ngay thang nam sinh sau khi thiet lap
//        int namSinh = cal.get(Calendar.YEAR);
//        int thangSinh = cal.get(Calendar.MONTH);
//        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
//        System.out.println("ngay thang nam sinh :" +ngaySinh + "/" + thangSinh + "/" + namSinh);

        int day, month, year, tuoi;
        //    nhap du lieu tu ban phim
        Scanner sc = new Scanner(System.in);

        System.out.println("moi ban nhap ngay sinh :");
        day = sc.nextInt();
        System.out.println("moi ban nhap thang sinh :");
        month = sc.nextInt();
        System.out.println("moi ban nhap nam sinh :");
        year = sc.nextInt();
//khoi tao

        Calendar brithday = Calendar.getInstance();
        brithday.set(year, month - 1, day);
        int namSinh = brithday.get(Calendar.YEAR);
        int thangSinh = brithday.get(Calendar.MONTH);
        int ngaySinh = brithday.get(Calendar.DAY_OF_MONTH);
        System.out.println("ngay thang nam sinh :" + ngaySinh + "/" + (thangSinh + 1) + "/" + namSinh);

        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        tuoi = namHienTai - namSinh;
        System.out.println("tuoi cua ban la:" + tuoi);
    }

}
